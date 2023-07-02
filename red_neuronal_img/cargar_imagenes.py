import cv2
import numpy as np
import os
import matplotlib.pyplot as plt


# definir las rutas a las carpetas de imágenes de cada clase
melanoma_path = r"C:\Users\Gustavo\Downloads\archive\melanoma_cancer_dataset\train\malignant"
non_melanoma_path = r"C:\Users\Gustavo\Downloads\archive\melanoma_cancer_dataset\train\benign"

# definir el tamaño de las imágenes a cargar
img_width, img_height = 128, 128

# función para cargar las imágenes y convertirlas a matrices NumPy
def load_images_from_folder(folder):
    images = []
    for filename in os.listdir(folder):
        img = cv2.imread(os.path.join(folder,filename))
        if img is not None:
            img = cv2.resize(img, (img_width, img_height))
            images.append(img)
    return np.array(images)

# cargar las imágenes de las tres carpetas en matrices NumPy separadas
melanoma_images = load_images_from_folder(melanoma_path)
non_melanoma_images = load_images_from_folder(non_melanoma_path)

# guardar las matrices NumPy en archivos .npy para su posterior uso
np.save('melanoma.npy', melanoma_images)
np.save('non_melanoma.npy', non_melanoma_images)

# mostrar las primeras 5 imágenes de melanoma
for i in range(5):
    img = melanoma_images[i]
    plt.subplot(1, 5, i+1)
    plt.imshow(cv2.cvtColor(img, cv2.COLOR_BGR2RGB))
    plt.axis('off')
    plt.title('Melanoma')
plt.show()

# mostrar las primeras 5 imágenes de no melanoma
for i in range(5):
    img = non_melanoma_images[i]
    plt.subplot(1, 5, i+1)
    plt.imshow(cv2.cvtColor(img, cv2.COLOR_BGR2RGB))
    plt.axis('off')
    plt.title('No Melanoma')
plt.show()
