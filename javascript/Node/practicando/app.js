const http = require("http");
const { cursos } = require("./cursos");

const server = http.createServer((req, res) => {
  let { method } = req;
  switch (method) {
    case "GET":
      return manejarSolicitudGET(req, res);
    case "POST":
      return manejarSolicitudPOST(req, res);
    default:
      res.end(`NO SE PUEDE MANEJAR EL METODO ${method}`);
  }
});

const manejarSolicitudPOST = (req, res) => {
  let path = req.url;

  if (path === "/cursos/programacion") {
    req.on("data", (contenido) => {
      console.log(contenido.toString());
    });

    req.on("end", () => {
      res.end("Cargado exitosmente.");
    });
  }
};

const manejarSolicitudGET = (req, res) => {
  let path = req.url;

  if (path === "/") {
    res.end(
      "DIRECCIONES: \n" +
        "/ \n" +
        "/CURSOS\n" +
        "/CURSOS/PROGRAMACION\n" +
        "/CURSOS/MATEMATICA"
    );
  } else if (path === "/cursos") {
    res.end(JSON.stringify(cursos));
  } else if (path === "/cursos/programacion") {
    res.setHeader("Content-Type", "Application/json");
    res.end(JSON.stringify(cursos.programacion));
  } else if (path === "/cursos/matematica") {
    res.end(JSON.stringify(cursos.matematica));
  } else {
    res.end(`Rescurso no encontrando.`);
  }
};

let PUERTO = 3000;

server.listen(PUERTO, () => {
  console.log(`El servidor esta escuchando en el puerto ${PUERTO}.`);
});
