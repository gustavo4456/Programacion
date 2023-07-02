import tensorflow as tf
from tensorflow import keras
from tensorflow.keras import layers
from tensorflow.keras.preprocessing.image import ImageDataGenerator
import numpy as np
import matplotlib.pyplot as plt


# cargar los datos de imágenes de melanoma y no melanoma
melanoma = np.load('melanoma.npy')
non_melanoma = np.load('non_melanoma.npy')

# etiquetas para las imágenes de melanoma y no melanoma (1 para melanoma, 0 para no melanoma)
melanoma_labels = np.ones(melanoma.shape[0])
non_melanoma_labels = np.zeros(non_melanoma.shape[0])

# combinar las imágenes y etiquetas en un solo conjunto de datos
data = np.concatenate((melanoma, non_melanoma), axis=0)
labels = np.concatenate((melanoma_labels, non_melanoma_labels), axis=0)

# mezclar los datos y dividir en conjuntos de entrenamiento y prueba
indices = np.random.permutation(data.shape[0])
data = data[indices]
labels = labels[indices]
split = int(data.shape[0] * 0.8)
train_data = data[:split]
train_labels = labels[:split]
test_data = data[split:]
test_labels = labels[split:]

# crear generador de aumento de datos
datagen = ImageDataGenerator(
    rotation_range=20,
    width_shift_range=0.1,
    height_shift_range=0.1,
    shear_range=0.2,
    zoom_range=0.2,
    horizontal_flip=True,
    vertical_flip=True,
    fill_mode='nearest'
)

# ajustar el generador de datos al conjunto de entrenamiento
datagen.fit(train_data)

# crear el modelo de red neuronal
model = keras.Sequential([
    layers.Conv2D(32, (3, 3), activation='relu', input_shape=(128, 128, 3)),
    layers.MaxPooling2D((2, 2)),
    layers.Conv2D(64, (3, 3), activation='relu'),
    layers.MaxPooling2D((2, 2)),
    layers.Conv2D(128, (3, 3), activation='relu'),
    layers.MaxPooling2D((2, 2)),
    layers.Conv2D(128, (3, 3), activation='relu'),
    layers.MaxPooling2D((2, 2)),
    layers.Dropout(0.2),
    layers.Flatten(),
    layers.Dense(512, activation='relu'),
    layers.Dense(1, activation='sigmoid')
])

# compilar el modelo con la función de pérdida, optimizador y métrica de precisión
model.compile(optimizer='adam',
              loss='binary_crossentropy',
              metrics=['accuracy'])

# entrenar el modelo con los datos de entrenamiento y el generador de datos
history = model.fit(datagen.flow(train_data, train_labels, batch_size=32),
                    epochs=10,
                    validation_data=(test_data, test_labels))

# evaluar el modelo con los datos de prueba
test_loss, test_acc = model.evaluate(test_data, test_labels, verbose=2)
print('\nTest accuracy:', test_acc)

# guardar el modelo entrenado
model.save('my_model.h5')
