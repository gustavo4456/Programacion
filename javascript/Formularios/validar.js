let nombre = document.getElementById("txtNombre");
let apellido = document.getElementById("txtApellido");
let form = document.getElementById("formPersona");

let esValido = false;

form.onsubmit = (event) => {
    event.preventDefault();

    if (nombre.value.trim() === "") {
        esValido = false;
    } else {
        esValido = true;
    }

    if (esValido) {
        form.submit();
    }
};
