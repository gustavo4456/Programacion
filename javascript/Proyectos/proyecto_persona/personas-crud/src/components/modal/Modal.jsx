import React, { useState } from "react";
import "../modal/Modal.css";

const Modal = ({ isOpen, onClose, filaSeleccionada }) => {
  const [nombre, setNombre] = useState("");
  const [apellido, setApellido] = useState("");
  const [edad, setEdad] = useState("");

  const editarPersona = () => {
    fetch(`http://localhost:3000/api/personas/${filaSeleccionada._id}`, {
      method: "PUT",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({
        nombre: nombre,
        apellido: apellido,
        edad: edad,
      }),
    })
      .then((res) => res.json())
      .then((data) => console.log(data))
      .catch((error) => console.error(error));
  };

  if (!isOpen) {
    return null;
  }

  return (
    <div className="modal">
      <div className="modal-content">
        <span className="close-button" onClick={onClose}>
          &times;
        </span>
        <h2>Editar Persona</h2>
        <label htmlFor="nombre">Nombre:</label>
        <input
          type="text"
          name="nombre"
          id="nombre"
          defaultValue={filaSeleccionada.nombre}
          onChange={(e) => setNombre(e.target.value)}
        />
        <label htmlFor="apellido">Apellido:</label>
        <input
          type="text"
          name="apellido"
          id="apellido"
          defaultValue={filaSeleccionada.apellido}
          onChange={(e) => setApellido(e.target.value)}
        />
        <label htmlFor="edad">edad:</label>
        <input
          type="text"
          name="edad"
          id="edad"
          defaultValue={filaSeleccionada.edad}
          onChange={(e) => setEdad(e.target.value)}
        />
        <input type="button" value="Modificar" onClick={editarPersona} />
      </div>
    </div>
  );
};

export default Modal;
