/**
 *
 * INSTALANDO nodemon para actualizar los cambios automticamente
 *
 * npm install -g nodemon
 *
 */

const http = require("http");

const PUERTO = 3000;

const server = http.createServer((req, res) => {
  res.end("Hola Mundo!");
});

server.listen(PUERTO, () => {
  console.log(`Escuchando en el puerto ${PUERTO}`);
});
