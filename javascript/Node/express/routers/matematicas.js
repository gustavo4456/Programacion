const express = require("express");

const { matematicas } = require("../datos/cursos").infoCursos;

const routerMatematicas = express.Router();

// Midleware
routerMatematicas.use(express.json());

routerMatematicas.get("/", (req, res) => {
  res.send(JSON.stringify(matematicas));
});

routerMatematicas.get("/:tema", (req, res) => {
  const tema = req.params.tema;
  const resultado = matematicas.filter((curso) => tema === curso.tema);

  if (resultado.length === 0) {
    return res.status(404).send(`No se encontraron cursos del tema ${tema}`);
  }

  // Accediendo a query, http://...?ordenar=vistas
  if (req.query.ordenar === "vistas") {
    return res.send(
      //Ordenando -> b - a primeros los que tengan mas vistas, a - b primero los que tengan menos vistas
      JSON.stringify(resultado.sort((a, b) => b.vistas - a.vistas))
    );
  }
  res.send(JSON.stringify(resultado));
});

routerMatematicas.get("/:tema/:nivel", (req, res) => {
  const tema = req.params.tema;
  const nivel = req.params.nivel;
  const resultado = matematicas.filter(
    (curso) => curso.tema === tema && curso.nivel === nivel
  );

  if (resultado.length === 0) {
    return res
      .status(404)
      .send(`No se encontro cursos con el tema ${tema} y de nivel ${nivel}`);
  }

  res.send(JSON.stringify(resultado));
});

// POST
routerMatematicas.post("/", (req, res) => {
  const cursoNuevo = req.body;
  matematicas.push(cursoNuevo);
  res.json(matematicas);
});

// PUT
routerMatematicas.put("/:id", (req, res) => {
  const id = req.params.id;
  const cursoAModificar = req.body;
  const indice = matematicas.findIndex((curso) => curso.id == id);

  if (indice >= 0) {
    matematicas[indice] = cursoAModificar;
  }

  res.json(matematicas);
});

// PATCH
routerMatematicas.patch("/:id", (req, res) => {
  const id = req.params.id;
  const infoActualizada = req.body;
  const indice = matematicas.findIndex((curso) => curso.id == id);

  if (indice >= 0) {
    const cursoAmodificar = matematicas[indice];
    Object.assign(cursoAmodificar, infoActualizada);
  }

  res.json(matematicas);
});

// DELETE
routerMatematicas.delete("/:id", (req, res) => {
  const id = req.params.id;

  const indice = matematicas.findIndex((curso) => curso.id == id);

  if (indice >= 0) {
    matematicas.splice(indice, 1);
  }
  res.json(matematicas);
});

module.exports = routerMatematicas;
