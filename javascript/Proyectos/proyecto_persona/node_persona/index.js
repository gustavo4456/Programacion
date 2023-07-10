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
    console.log("Conexion exitosa a MongoDB.");

    const db = cliente.db("prueba");

    app.locals.db = db;

    app.use((req, res, next) => {
      res.setHeader("Access-Control-Allow-Origin", "http://localhost:3001");
      res.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
      res.setHeader("Access-Control-Allow-Headers", "Content-Type");
      next();
    });

    app.use(express.json());

    app.use("/api", routesPersonas);

    app.listen(PUERTO, () => {
      console.log(`Escuchando en http://localhost:${PUERTO}`);
    });
  } catch (error) {
    console.error("Error al conectar con MongoDB");
  }
}

iniciarServidor();
