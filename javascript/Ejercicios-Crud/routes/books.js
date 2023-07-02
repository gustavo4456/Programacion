const express = require("express");
const router = express.Router();
const { ObjectId } = require("mongodb");


// Obtener todos los libros
router.get("/books", async (req, res) => {
  try {
    const db = req.app.locals.db;
    const collection = db.collection("personas"); // Nombre de la colección

    const books = await collection.find().toArray();
    res.json(books);
  } catch (error) {
    console.error("Error al obtener los libros:", error);
    res.status(500).json({ error: "Error al obtener los libros" });
  }
});

// Obtener un libro por ID
router.get("/books/:id", async (req, res) => {
  try {
    const db = req.app.locals.db;
    const collection = db.collection("personas"); // Nombre de la colección
    const bookId = req.params.id;

    const book = await collection.findOne({ _id: new ObjectId(bookId) });
    if (!book) {
      return res.status(404).json({ error: "Libro no encontrado" });
    }

    res.json(book);
  } catch (error) {
    console.error("Error al obtener el libro:", error);
    res.status(500).json({ error: "Error al obtener el libro" });
  }
});

// Crear un nuevo libro
router.post("/books", async (req, res) => {
  try {
    const db = req.app.locals.db;
    const collection = db.collection("personas"); // Nombre de la colección
    const bookData = req.body;

    const result = await collection.insertOne(bookData);
    const newBook = result;
    res.status(201).json(newBook);
  } catch (error) {
    console.error("Error al crear el libro:", error);
    res.status(500).json({ error: "Error al crear el libro" });
  }
});

// Actualizar un libro
router.put("/books/:id", async (req, res) => {
  try {
    const db = req.app.locals.db;
    const collection = db.collection("personas"); // Nombre de la colección
    const bookId = req.params.id;
    const updatedBookData = req.body;

    const result = await collection.updateOne(
      { _id: new ObjectId(bookId) },
      { $set: updatedBookData }
    );

    if (result.modifiedCount === 0) {
      return res.status(404).json({ error: "Libro no encontrado" });
    }

    res.json({ message: "Libro actualizado exitosamente" });
  } catch (error) {
    console.error("Error al actualizar el libro:", error);
    res.status(500).json({ error: "Error al actualizar el libro" });
  }
});

// Eliminar un libro
router.delete("/books/:id", async (req, res) => {
  try {
    const db = req.app.locals.db;
    const collection = db.collection("personas"); // Nombre de la colección
    const bookId = req.params.id;

    const result = await collection.deleteOne({ _id: new ObjectId(bookId) });

    if (result.deletedCount === 0) {
      return res.status(404).json({ error: "Libro no encontrado" });
    }

    res.json({ message: "Libro eliminado exitosamente" });
  } catch (error) {
    console.error("Error al eliminar el libro:", error);
    res.status(500).json({ error: "Error al eliminar el libro" });
  }
});

module.exports = router;