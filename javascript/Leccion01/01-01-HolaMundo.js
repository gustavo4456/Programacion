const saludar = (...numero) => {
  // const url = "https://pokeapi.co/api/v2/pokemon/ditto";

  // fetch(url)
  //   .then((response) => response.json())
  //   .then((data) => {
  //     console.log(data.abilities[1].ability.url);
  //   })
  //   .catch((error) => {
  //     console.log("error ", error);
  //   });
  let esVacio = "";
  console.log(esVacio || "Hola mundo");

  let prueba = "Hola mundo! agua lomito pizza chocolate";
  let nuevoString = prueba.slice(0, 3);

  let cadena = prueba.split(" ", 3);

  console.log(cadena.join(" "));

  console.log(nuevoString);
};

saludar();
