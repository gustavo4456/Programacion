const express = require("express");
const router = express.Router();
const { ObjectId } = require("mongodb");

// obtener todas las personas
router.get("/personas", async (req, res) => {
  try {
    const db = req.app.locals.db;
    const collection = db.collection("personas");

    const personas = await collection.find().toArray();
    res.json(personas);
  } catch (error) {
    console.error("Error al obtener todas las personas", error);
    res.status(500).json({ error: "Error al obtener las personas" });
  }
});

// Obtener persona por id
router.get("/personas/:id", async (req, res) => {
  try {
    const db = req.app.locals.db;
    const collection = db.collection("personas");
    const personaId = req.params.id;

    const persona = await collection.findOne({ _id: new ObjectId(personaId) });

    if (!persona) {
      return res.status(404).json({ error: "Persona no encontrada." });
    }

    res.json(persona);
  } catch (error) {
    console.error("Error al obtener persona por id", error);
    res.status(500).json({ error: "Error al obtener persona por id" });
  }
});

// Insertar persona a la bd
router.post("/personas", async (req, res) => {
  try {
    const db = req.app.locals.db;
    const collection = db.collection("personas");
    const personaData = req.body;

    const resultado = await collection.insertOne(personaData);
    res.json({ mensaje: "Persona agregada existosamente." });
  } catch (error) {
    console.error("Error al ingresar una persona a la base de datos.", error);
    res
      .status(500)
      .json({ error: "Error al ingresar una persona a la base de datos." });
  }
});

// Actualizacion de una persona
router.put("/personas/:id", async (req, res) => {
  try {
    const db = req.app.locals.db;
    const collection = db.collection("personas");
    const personaId = req.params.id;
    const personaData = req.body;

    const resultado = await collection.updateOne(
      { _id: new ObjectId(personaId) },
      { $set: personaData }
    );

    if (resultado.modifiedCount === 0) {
      return res.status(404).json({ error: "No se encontro a la persona." });
    }

    res.json({ error: "Persona actualizada exitosamente." });
  } catch (error) {
    console.error("Error al actualizar persona.", error);
    res.status(500).json({ error: "Error al actualizar persona" });
  }
});

// Eliminar persona
router.delete("/personas/:id", async (req, res) => {
  try {
    const db = req.app.locals.db;
    const collection = db.collection("personas");
    const personaId = req.params.id;

    const resultado = await collection.deleteOne({
      _id: new ObjectId(personaId),
    });

    if (resultado.deletedCount === 0) {
      return res.status(404).json({ error: "No se encontro la persona." });
    }

    res.json({ mensaje: "Persona eliminada exitosamente." });
  } catch (error) {
    console.error("Error al eliminar persona", error);
    res.status(500).json({ error: "Error al eliminar persona" });
  }
});

module.exports = router;
