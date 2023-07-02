//Registra codigo, nombre, año de cursada(1 a 5), precios, cupo (valor entero que representa la cantidad máxima de alumnos a inscribir), y cantidad
//de inscriptos actuales.

//Lista de materias
//[codigo, nombre, año, cantidadmax, precio, inscripto]
let m1 = [1001, "FISICA1", 1, 30, 1000, 30];
let m2 = [1002, "ALGEBRA1", 1, 30, 1000, 5];
let m3 = [1003, "ALGEBRA2", 2, 25, 200, 5];
let m4 = [1004, "PROBABILIDAD", 2, 25, 2000, 0];
let m5 = [1005, "ECONOMIA", 3, 15, 3000, 0];

let listaA = [m1, m2, m3, m4, m5];

// Lista de inscripto
// [codmateria, dni, nombre]
let alum1 = [1001, 42555222, "Juan Perez"];
let alum2 = [1002, 42555111, "Sofia Cruz"];
let alum3 = [1003, 40655222, "Gustavo Lopez"];
let alum4 = [1004, 40222555, "Lucas Arias"];
let listaB = [alum1, alum2, alum3, alum4];

/*
1)_(30 PUNTOS) Realizar la inscripción de un alumno en una materia. Para ello, se debe
solicitar y guardar el código de materia, DNI y nombre de alumno en la lista B. Para hacer
la inscripción se debe validar que el código de materia exista en la lista A y que el cupo
máximo de la misma no se haya superado; en caso contrario en caso contrario informar con
el mensaje correspondiente. A medida que se realiza una nueva inscripción es necesario
actualizar la cantidad de inscriptos de la materia en la lista A
*/

// console.log("Ingresar codigo de materia: ");
// console.log("Ingresar dni: ");
// console.log("Ingresar nombre: ");

let alum5 = [1002, 39888555, "María Escobar"];
let existeMateria = false;
let cupoLLeno = true;

for (let i = 0; i < listaA.length; i++) {
  const element = listaA[i];

  if (element[0] === alum5[0] && element[5] < element[3]) {
    listaB.push(alum5);
    element[5]++;
  }
}

/*
2)_ (15 PUNTOS) A partir de la información de la lista A, Mostrar el importe total recaudado por
una materia Dando su código. Para el cálculo se debe considerar la cantidad total de
alumnos que se inscribieron en la misma.
*/

// console.log("Ingrese codigo de la materia: ");
let totalRecaudadoMateria = 0;
let codigoMateriaAbuscar = 1002;
let materiaNombre = "";

for (let i = 0; i < listaA.length; i++) {
  const element = listaA[i];

  if (element[0] === codigoMateriaAbuscar) {
    totalRecaudadoMateria = element[4] * element[5];
    materiaNombre = element[1];
  }
}

console.log(
  "La materia ",
  materiaNombre,
  " de codigo ",
  codigoMateriaAbuscar,
  " tiene una recaudacion total de: ",
  totalRecaudadoMateria
);

/*
3)_ (20 PUNTOS) crear una lista C que contenga la información de las materias cuyo precio sea
menor al precio promedio de todas las materias.

*/

let acu = 0;
let prom = 0;
let listaC = [];

for (let i = 0; i < listaA.length; i++) {
  const element = listaA[i];

  acu += acu + element[4];
}

prom = acu / listaA.length;

for (let i = 0; i < listaA.length; i++) {
  const element = listaA[i];

  if (element[4] < prom) {
    listaC.push(element);
  }
}

console.log(listaC);

/*
4)_ (15 PUNTOS) Informar la cantidad de alumnos cuyo nombre contenga las subcadena
“María”
*/

let subcadena = "María";
let contador = 0;

for (let i = 0; i < listaB.length; i++) {
  const element = listaB[i];

  if (element[2].includes(subcadena)) {
    contador++;
  }
}

console.log("La cantidad de alumnos con la subcadena María es de: ", contador);

/*
5)_ (20 PUNTOS) Disminuir el precio de todas las materias de primer año en un 5%
*/

for (let i = 0; i < listaA.length; i++) {
  const element = listaA[i];

  if (element[2] === 1) {
    element[4] = element[4] - element[4] * 0.5;
  }
}

console.log(listaA);
