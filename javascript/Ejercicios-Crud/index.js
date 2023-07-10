const express = require("express");
const { MongoClient } = require("mongodb");
const routes = require("./routes/books");

const app = express();
const port = 3000;

// Configuración de la conexión a MongoDB
// const uri = "mongodb://localhost:27017";
const uri = "mongodb+srv://gustavosilvaartaza:GWuAlekZVk0Wqrfn@cluster0.hrtiwok.mongodb.net/?retryWrites=true&w=majority";
const client = new MongoClient(uri);

async function startServer() {
  try {
    await client.connect();
    console.log("Conexión exitosa a MongoDB");

    const db = client.db("prueba"); // Nombre de la base de datos
    app.locals.db = db;

    // Middleware
    app.use(express.json());

    // Rutas
    app.use("/api", routes);

    // Iniciar el servidor
    app.listen(port, () => {
      console.log(`Servidor escuchando en http://localhost:${port}`);
    });
  } catch (error) {
    console.error("Error de conexión a MongoDB:", error);
  }
}

startServer();
