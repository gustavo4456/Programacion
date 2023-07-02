import cv2
import numpy as np
from tensorflow import keras

# cargar el modelo entrenado
model = keras.models.load_model('my_model.h5')

# definir las etiquetas
labels = {0: 'non-melanoma', 1: 'melanoma'}

# cargar una imagen de prueba
img = cv2.imread('no_melanoma2.jpg')

# redimensionar la imagen a 128x128 píxeles
resized_img = cv2.resize(img, (128, 128))

# normalizar la imagen
normalized_img = resized_img / 255.0

# agregar una dimensión a la imagen para que tenga la forma (1, 128, 128, 3)
input_img = np.expand_dims(normalized_img, axis=0)

# hacer una predicción con el modelo
prediction = model.predict(input_img)
probability = keras.activations.sigmoid(prediction)[0][0]

print("Prediction: ", prediction)
print("Probability: ", probability)

# encontrar la etiqueta correspondiente a la clase predicha
label = 'melanoma' if probability >= 0.5 else 'non-melanoma'
print("Etiqueta predicha:", label)
