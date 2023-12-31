const express = require("express");
const { MongoClient } = require("mongodb");
const routesPersonas = require("./routes/personas");

const app = express();
const PUERTO = 3000;

// Configurar MongoDB
const uri =
  "mongodb+srv://gustavosilvaartaza:GWuAlekZVk0Wqrfn@cluster0.hrtiwok.mongodb.net/?retryWrites=true&w=majority";
const cliente = new MongoClient(uri);

async function iniciarServidor() {
  try {
    await cliente.connect();
    console.log("Conexion exitosa a MongoDB");

    const db = cliente.db("prueba");
    app.locals.db = db;

    app.use(express.json());

    app.use("/api", routesPersonas);

    app.listen(PUERTO, ()=>{
      console.log(`Escuchando en http://localhost:${PUERTO}`);
    })
  } catch (error) {
    console.error("Error al conectarse con MongoDB", error);
  }
}

iniciarServidor();
