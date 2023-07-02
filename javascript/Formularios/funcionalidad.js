const params = new URLSearchParams(window.location.search);
const nombre = params.get("nombre");
const apellido = params.get("apellido");

console.log(nombre);
console.log(apellido);
