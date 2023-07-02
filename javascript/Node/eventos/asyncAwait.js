const ordenarProducto = (producto) => {
  return new Promise((resolve, reject) => {
    console.log(`Ordenando: ${producto} de freeCodeCamp`);
    setTimeout(() => {
      if (producto === "taza") {
        resolve("Ordenando una taza con el logo de freeCodeCamp...");
      } else {
        reject("Este producto no esta disponible actualmente.");
      }
    }, 2000);
  });
};

const procesarPedido = (respuesta) => {
  return new Promise((resolve) => {
    console.log("Procesando la respuesta...");
    console.log(`La respuesta fue: "${respuesta}"`);
    setTimeout(() => {
      resolve("Gracias por tu compra. Disfruta tu producto de freeCodeCamp");
    }, 4000);
  });
};

// ENCADENANDO PROMESAS (CODIGO SIN ASYNC AWAIT)
// ordenarProducto("taza")
//   .then((respuesta) => {
//     console.log("Respuesta recibida");
//     console.log(respuesta);

//     return procesarPedido(respuesta);
//   })
//   // Aqui encadena, con el return le pasa la promesa la respuesta al otro then
//   .then((respuestaProcesada) => {
//     console.log(respuestaProcesada);
//   })
//   .catch((err) => {
//     console.log(err);
//   });

// ENCADENANDO PROMESAS (CODIGO CON ASYNC AWAIT)
const realizarPedido = async (producto) => {
  try {
    const respuesta = await ordenarProducto(producto);
    console.log("Respuesta recibida");
    console.log(respuesta);

    const respuestaProcesada = await procesarPedido(respuesta);
    console.log(respuestaProcesada);
    
  } catch (error) {
    console.log(error);
  }
};

realizarPedido("taza");
