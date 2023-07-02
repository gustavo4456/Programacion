const express = require("express");
const { infoCursos } = require("./datos/cursos");

const app = express();

// Routers

const routerProgramacion = require("./routers/programacion");
app.use("/api/cursos/programacion", routerProgramacion);

const routerMatematicas = require("./routers/matematicas");

app.use("/api/cursos/matematicas", routerMatematicas);

// Routing

app.get("/", (req, res) => {
  res.send("Mi primer servidor. Cursos");
});

app.get("/api/cursos", (req, res) => {
  res.send(JSON.stringify(infoCursos));
});

// Matematicas

const PUERTO = process.env.PORT || 3000;

app.listen(PUERTO, () => {
  console.log(`El servidor esta escuchando en el puerto ${PUERTO}...`);
});


