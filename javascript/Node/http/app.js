const http = require("http");

// PRIMER SERVIDOR HOLA MUNDO

// const servidor = http.createServer((req, res) => {
//   console.log("Solicitud nueva");
//   res.end("Hola Mundo!");
// });

// const puerto = 3000;

// servidor.listen(puerto, () => {
//   console.log(`El servidor esta escuchando en http://localhost:${puerto}...`);
// });

// REQUEST Y RESPONSE

const servidor = http.createServer((req, res) => {
  // SOLICITUD

  // console.log("===> req (solicitud)");
  // console.log(req.url);
  // console.log(req.headers);
  // console.log(req.method);
  // res.end("Hola Mundo!");

  // RESPUESTA
  console.log("===> res (respuesta)");
  // console.log(res.statusCode); // 200 OK
  // res.statusCode =404;
  // console.log(res.statusCode)   // 404 Not found

  res.setHeader("Content-Type", "application/json");

  console.log(res.getHeaders());

  res.end("Hola Mundo!");
});

const puerto = 3000;

servidor.listen(puerto, () => {
  console.log(`El servidor esta escuchando en el puerto ${puerto}...`);
});
