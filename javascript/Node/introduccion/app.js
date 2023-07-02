const { saludar, saludarHolaMundo } = require("./saludos");

// console.log(saludar("Gustavooo"));

// console.log(saludarHolaMundo());

// console.warn("Ocurrio un error...");
// console.error(new Error("Ocurrio un error"));

// MODULO PROCESS
// console.log(process.env);

// console.log(process.argv[3]);

// console.log(process.memoryUsage());

// MODULO OS
// const os = require("os");
// console.log(os.type());
// console.log(os.homedir());
// console.log(os.uptime());
// console.log(os.userInfo());

// setTimeout
// const mostrarTema = (tema) => {
//   console.log(`Estoy aprendiendo ${tema}`);
// };

// setTimeout(mostrarTema, 8000, "node.js");

// const sumar = (a, b) => {
//   console.log(a + b);
// };

// setTimeout(sumar, 2000, 12, 12);

// setImmediate
// const mostrarTema = (tema) => {
//   console.log(`Estoy aprendiendo ${tema}`);
// };

// console.log("Antes de setImmediate()");

// setImmediate(mostrarTema, "node.js");

// console.log("Despues de setImmediate()");

// setInterval()
// const mostrarTema = (tema) => {
//   console.log(`Estoy aprendiendo ${tema}`);
// };

// setInterval(mostrarTema, 1500, "node.js");

// const sumar = (a, b) => {
//   console.log(a + b);
// };

// setInterval(sumar, 1500, 12,11);

// MODULO FS (FILESYSTEM)
const fs = require("fs");

// ASINCRONO

// console.log("Antes de leer el archivo...");
// // Mostrar contenido
// fs.readFile("./index.html", "utf-8", (err, contenido) => {
//   if (err) {
//     throw err;
//   }
//   console.log(contenido);
// });
// console.log("Despues de leer el archivo...");

// console.log("Antes de cambiar el nombre del archivo...");
// // Cambiar nombre del archivo
// fs.rename("./index.html", "main.html", (err) => {
//   if (err) {
//     throw err;
//   }
//   console.log("Nombre cambiado exitosamente.");
// });
// console.log("Despues de cambiar el nombre del archivo...");

// console.log("Antes de agregar el contenido al archivo...");
// // Agregar contenido al final del archivo
// fs.appendFile("./main.html", "<p>Hola</p>", (err) => {
//   if (err) {
//     throw err;
//   }
//   console.log("Archivo actualizado.");
// });
// console.log("Despues de agregar el contenido al archivo...");

// console.log("Antes de reemplazar el contenido del archivo...");
// // Reemplazar todo el contenido del archivo (se crea si no existe)
// fs.writeFile("./main.html", "Contenido nuevo", (err) => {
//   if (err) {
//     throw err;
//   }
//   console.log("Contenido reemplazado correctamente.");
// });
// console.log("Despues de reemplazar el contenido del archivo...");

// console.log("Antes de eliminar el archivo...");
// // Eliminar archivos
// fs.unlink("./main.html", (err) => {
//   if (err) {
//     throw err;
//   }
//   console.log("Archivo eliminado");
// });
// console.log("Despues de eliminar el archivo...");

// SINCRONO
// console.log("Antes de leer el archivo...");
// // Mostrar contenido
// const archivo = fs.readFileSync("./index.html", "utf-8");
// console.log(archivo);
// console.log("Despues de leer el archivo...");

// console.log("Antes de cambiar el nombre del archivo...");
// // Cambiar nombre del archivo
// fs.renameSync("./index.html", "main.html");
// console.log("Despues de cambiar el nombre del archivo...");

// console.log("Antes de agregar el contenido al archivo...");
// // Agregar contenido al final del archivo
// fs.appendFileSync("./main.html", "<p>Hola</p>");
// console.log("Despues de agregar el contenido al archivo...");

// console.log("Antes de reemplazar el contenido del archivo...");
// // Reemplazar todo el contenido del archivo (se crea si no existe)
// fs.writeFileSync("./main.html", "Contenido nuevo");
// console.log("Despues de reemplazar el contenido del archivo...");

// console.log("Antes de eliminar el archivo...");
// // Eliminar archivos
// fs.unlinkSync("./main.html");
// console.log("Despues de eliminar el archivo...");
