const http = require("http");
const { infoCursos } = require("./cursos.js");

const servidor = http.createServer((req, res) => {
  // Desestructurar
  const { method } = req;

  switch (method) {
    case "GET":
      return manejarSolicitudGET(req, res);

    case "POST":
      return manejarSolicitudPOST(req, res);

    default:
      res.statusCode = 501;
      console.log(
        `El metodo usado no puede ser manejado por el servidor: ${method}`
      );
      res.end(
        `El metodo usado no puede ser manejado por el servidor: ${method}`
      );
  }
});

const manejarSolicitudGET = (req, res) => {
  const path = req.url;

  console.log(res.statusCode);

  if (path === "/") {
    res.writeHead(200, { "Content-Type": "application/json" });
    res.end("Bienvenidos a mi primier servidor y API creados con Node.js");
  } else if (path === "/cursos") {
    res.end(JSON.stringify(infoCursos));
  } else if (path === "/cursos/programacion") {
    res.end(JSON.stringify(infoCursos.programacion));
  } else {
    res.statusCode = 404; //Solo cuando falla porque si sale todo bien ya es 200 OK por defecto
    res.end("El recurso solicitado no exite...");
  }
};

const manejarSolicitudPOST = (req, res) => {
  const path = req.url;

  if (path === "/cursos/programacion") {
    let cuerpo = "";
    req.on("data", (contenido) => {
      cuerpo += contenido.toString();
    });

    req.on("end", () => {
      console.log(cuerpo);
      console.log(typeof cuerpo);

      // Convertir a un objeto de JavaScript
      cuerpo = JSON.parse(cuerpo);
      console.log(cuerpo.titulo);
      console.log(typeof cuerpo);
      res.end(
        "El servidor recibio una solicitud POST para /cursos/programacion"
      );
    });

    // res.end("El servidor recibio una solicitud POST para /cursos/programacion");
  } else {
    res.statusCode = 404;
    res.end("El recurso solicitado no existe...");
  }
};

const PUERTO = 3000;

servidor.listen(PUERTO, () => {
  console.log(`El servidor esta escuchando en el puerto ${PUERTO}...`);
});
