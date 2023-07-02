from django.shortcuts import render

# Create your views here.
from rest_framework.decorators import api_view
from rest_framework.response import Response
import cv2
import numpy as np
from tensorflow import keras

# cargar el modelo entrenado
model = keras.models.load_model('models\my_model.h5')

# definir las etiquetas
labels = {0: 'non_melanoma', 1: 'melanoma'}

@api_view(['POST'])
def detect_melanoma(request):
    # leer la imagen del request
    file = request.FILES['image']
    image = cv2.imdecode(np.frombuffer(file.read(), np.uint8), cv2.IMREAD_UNCHANGED)

    # redimensionar la imagen a 128x128 píxeles
    resized_image = cv2.resize(image, (128, 128))

    # normalizar la imagen
    normalized_image = resized_image / 255.0

    # agregar una dimensión a la imagen para que tenga la forma (1, 128, 128, 3)
    input_image = np.expand_dims(normalized_image, axis=0)

    # hacer una predicción con el modelo
    prediction = model.predict(input_image)[0]

    # encontrar la etiqueta correspondiente a la clase predicha
    label = labels[np.argmax(prediction)]

    # devolver la respuesta
    response = {
        'result': label
    }
    return Response(response)

