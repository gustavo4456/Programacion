const express = require("express");
const { programacion } = require("../datos/cursos").infoCursos;

const routerProgramacion = express.Router();

// Middleware
routerProgramacion.use(express.json());

routerProgramacion.get("/", (req, res) => {
  // El metodo send ya envia el objeto convertiro en JSON, no es necesario el JSON.stringify()
  res.json(programacion);
});

routerProgramacion.get("/:lenguaje/:nivel", (req, res) => {
  const lenguaje = req.params.lenguaje;
  const nivel = req.params.nivel;

  const resultado = programacion.filter(
    (curso) => curso.nivel === nivel && curso.lenguaje === lenguaje
  );

  if (resultado.length === 0) {
    // return res
    //   .status(404)
    //   .send(`No se encontro cursos de ${lenguaje} de nivel ${nivel}`);
    return res.status(204).end(); //Metodo  que enviar el error vacio 
  }

  res.json(resultado);
});

routerProgramacion.get("/:lenguaje", (req, res) => {
  const lenguaje = req.params.lenguaje;
  const resultado = programacion.filter((curso) => curso.lenguaje === lenguaje);

  if (resultado.length === 0) {
    return res.status(404).send(`No se encontraron cursos en ${lenguaje}`);
  }

  // Accediendo a query, http://...?ordenar=vistas
  if (req.query.ordenar === "vistas") {
    //Ordenando -> b - a primeros los que tengan mas vistas, a - b primero los que tengan menos vistas
    return res.json(
      resultado.sort((a, b) => b.vistas - a.vistas)
    );
  }

  res.json(resultado);
});

// POST
routerProgramacion.post("/", (req, res) => {
  let cursoNuevo = req.body;
  programacion.push(cursoNuevo);
  res.json(programacion);
});

// PUT hay que pasar todo el objeto completo
routerProgramacion.put("/:id", (req, res) => {
  const cursoAcualizado = req.body;
  const id = req.params.id;

  // solo 2 == ya que id es un string y curso.id es un entero
  const indice = programacion.findIndex((curso) => curso.id == id);

  if (indice >= 0) {
    programacion[indice] = cursoAcualizado;
  }
  res.json(programacion);
});

// PATCH se puede modificar solo los atributos que se pase
routerProgramacion.patch("/:id", (req, res) => {
  const infoActualizada = req.body;
  const id = req.params.id;

  // solo 2 == ya que id es un string y curso.id es un entero
  const indice = programacion.findIndex((curso) => curso.id == id);

  if (indice >= 0) {
    const cursoAModificar = programacion[indice];
    Object.assign(cursoAModificar, infoActualizada);
  }
  res.json(programacion);
});

// DELETE
routerProgramacion.delete("/:id", (req, res) => {
  const id = req.params.id;
  const indice = programacion.findIndex((curso) => curso.id == id);

  if (indice >= 0) {
    // elimina elmentos apartir del indice, en este caso elimina el propio indice
    programacion.splice(indice, 1);
  }
  res.json(programacion);
});

module.exports = routerProgramacion;
