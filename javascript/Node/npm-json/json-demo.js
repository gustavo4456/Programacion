
//Cundo se importa o incluye con requite ya lo convierte en Object
const curso = require("./curso.json");

// console.log(curso);

let infoCurso = {
  titulo: "Aprende Node.js",
  numVistas: 445424,
  numLikes: 21323,
  temas: ["JavaScript", "Node.js"],
  esPublico: true,
};

// Objeto -> cadena de caracteres
let infoCursoJSON = JSON.stringify(infoCurso);

console.log(infoCursoJSON);
console.log(typeof infoCursoJSON);

// cadena de string -> Objeto
let infoCursoObjeto = JSON.parse(infoCursoJSON);

console.log("El titulo:" + infoCursoObjeto);
console.log(typeof infoCursoObjeto);


/** 
 * Crear un paquete
 * 
 * npm init
 * 
 * Instalar un paquete 
 * 
 * npm install express
 * 
 * Desinstalar un paquete
 * 
 * npm uninstall express
 * 
 * Instalar una version especifica
 * 
 * npm install express@4.15.1
 * 
 * 
 * Guardar paquetes que solo se van a usar para el desarrollo
 * npm install express --save-dev
 * 
 * 
*/