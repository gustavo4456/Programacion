const express = require("express");
const router = express.Router();
const { ObjectId } = require("mongodb");

// Obtener todas las personas
router.get("/personas", async (req, res) => {
  try {
    const db = req.app.locals.db;
    const collection = db.collection("personas");

    const personas = await collection.find().toArray();
    res.json(personas);
  } catch (error) {
    console.error("Error al obtener las personas", error);
    res.status(500).json({ error: "Error al obtener todas las personas." });
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
      return res.status(404).json({ error: "no se encontro a la persona" });
    }

    res.json(persona);
  } catch (error) {
    console.error("Error al obtener una persona por id", error);
    res.status(500).json({ error: "Error al obtener la personas" });
  }
});

// Ingresar persona a la db
router.post("/personas", async (req, res) => {
  try {
    const db = req.app.locals.db;
    const collection = db.collection("personas");
    const personaData = req.body;

    const resultado = await collection.insertOne(personaData);
    res.json({ mensaje: "Persona ingresada a la bd con exito" });
  } catch (error) {
    console.error("Error al ingresar persona a la db", error);
    res.status(500).json({ error: "Error al ingresar una persona" });
  }
});

// Actualizar persona
router.put("/personas/:id", async (req, res) => {
  try {
    const db = req.app.locals.db;
    const collection = db.collection("personas");
    const personaId = req.params.id;
    const personaData = req.body;

    const resultado = await collection.updateOne(
      {
        _id: new ObjectId(personaId),
      },
      { $set: personaData }
    );

    if (resultado.modifiedCount === 0) {
      return res.status(404).json({ error: "Persona no encontrada" });
    }

    res.json({ mensaje: "Persona actualizada con exito" });
  } catch (error) {
    console.error("Error al actualizar la persona", error);
    res.status(500).json({ error: "Error al actulizar la persona" });
  }
});

router.delete("/personas/:id", async (req, res) => {
  try {
    const db = req.app.locals.db;
    const collection = db.collection("personas");
    const personaId = req.params.id;

    const resultado = await collection.deleteOne({ _id: new ObjectId(personaId) });
    if (resultado.deletedCount === 0) {
      return res.status(404).json({ error: "Persona no encontrada" });
    }

    res.json({ mensaje: "persona eleminada" });
  } catch (error) {
    console.error("Error al eleminar una persona", error);
    res.status(500).json({ error: "Error al eliminar la persona" });
  }
});

module.exports = router;
