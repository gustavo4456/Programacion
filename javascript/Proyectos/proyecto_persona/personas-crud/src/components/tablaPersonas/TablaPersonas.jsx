import React, { useEffect, useState } from "react";
import "./TablaPersonas.css";
import Modal from "../modal/Modal";

const TablaPersona = () => {
  const [modalOpen, setModalOpen] = useState(false);
  const [listaPersonas, setListaPersonas] = useState([]);
  const [nombre, setNombre] = useState("");
  const [apellido, setApellido] = useState("");
  const [edad, setEdad] = useState("");
  const [filaSeleccionada, setFilaSeleccionada] = useState(null);

  const eventoAgregarPersona = async () => {
    await fetch("http://localhost:3000/api/personas", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({
        nombre: nombre,
        apellido: apellido,
        edad: edad,
      }),
    })
      .then((res) => res.json())
      .then((data) => console.log(data))
      .catch((error) => console.error(error));

    await actualizarTabla();
  };

  const openModal = (item) => {
    setFilaSeleccionada(item);
    setModalOpen(true);
  };

  const closeModal = () => {
    setModalOpen(false);
  };

  const actualizarTabla = () => {
    fetch("http://localhost:3000/api/personas")
      .then((res) => res.json())
      .then((data) => {
        setListaPersonas(data);
      })
      .catch((error) => console.error(error));
  };

  const eliminarPersona = async (id) => {
    await fetch(`http://localhost:3000/api/personas/${id}`, {
      method: "DELETE",
      headers: {
        "Content-Type": "application/json",
      },
    })
      .then((res) => res.json())
      .then((data) => console.log(data))
      .catch((error) => console.error(error));

    await actualizarTabla();
  };

  useEffect(() => {
    actualizarTabla();
  }, []);

  return (
    <>
      <div className="contenedor-agregar">
        <h2>Agregar Persona</h2>
        <label htmlFor="nombre">Nombre:</label>
        <input
          type="text"
          name="nombre"
          id="nombre"
          onChange={(e) => setNombre(e.target.value)}
        />
        <label htmlFor="apellido">Apellido:</label>
        <input
          type="text"
          name="apellido"
          id="apellido"
          onChange={(e) => setApellido(e.target.value)}
        />
        <label htmlFor="edad">Edad:</label>
        <input
          type="text"
          name="edad"
          id="edad"
          onChange={(e) => setEdad(e.target.value)}
        />
        <input type="button" value="Agregar" onClick={eventoAgregarPersona} />
      </div>

      <div className="contenedor-tabla">
        <table>
          <thead>
            <tr>
              <th>ID</th>
              <th>NOMBRE</th>
              <th>APELLIDO</th>
              <th>EDAD</th>
              <th>OPCIONES</th>
            </tr>
          </thead>
          <tbody>
            {listaPersonas.map((item, index) => (
              <tr key={item._id}>
                <td>{item._id}</td>
                <td>{item.nombre}</td>
                <td>{item.apellido}</td>
                <td>{item.edad}</td>
                <td>
                  <button onClick={() => openModal(item)}>Editar</button>

                  <button
                    value={item._id}
                    onClick={(e) => eliminarPersona(e.target.value)}
                  >
                    Eliminar
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
      <Modal
        isOpen={modalOpen}
        onClose={closeModal}
        filaSeleccionada={filaSeleccionada}
      />
    </>
  );
};

export default TablaPersona;
