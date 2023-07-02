let saludar = document.getElementById("saludo");
let boton = document.getElementById("btnCambiarSaludo");
let txtNombre = document.getElementById("txtNombre");
let contenedor = document.getElementById("contenedor");

let mensaje = document.createElement("h1");

boton.onclick = (e) => {
  mensaje.innerHTML = txtNombre.value || "No ingreso nada";

  contenedor.appendChild(mensaje);

  saludar.textContent = console.log(saludar.textContent);
};
