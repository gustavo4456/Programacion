let nombre = document.getElementById("txtNombre");
let apellido = document.getElementById("txtApellido");

let btnAgregar = document.getElementById("btnAgregarPersona");
let tabla = document.getElementById("tablaPersonas");

btnAgregar.onclick = () => {
    let tr = document.createElement("tr");
    let td1 = document.createElement("td");
    let td2 = document.createElement("td");
    let td3 = document.createElement("td");
    let td4 = document.createElement("td");

    td1.innerHTML = "5";
    td2.innerHTML = nombre.value;
    td3.innerHTML = apellido.value;
    td4.innerHTML = "5";

    tr.appendChild(td1);
    tr.appendChild(td2);
    tr.appendChild(td3);
    tr.appendChild(td4);

    tabla.appendChild(tr);
};
