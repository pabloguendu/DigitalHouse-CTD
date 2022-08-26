const alumnos = [
    {
      id: 0,
      nombre: "Leandro",
      apellido: "Borrelli",
      legajo: 20210308,
      notas: [],
    },
    {
      id: 1,
      nombre: "Esteban",
      apellido: "Piazza",
      legajo: 20210211,
      notas: [],
    },
    {
      id: 2,
      nombre: "Martin",
      apellido: "Cejas",
      legajo: 20210218,
      notas: [],
    },
    {
      id: 3,
      nombre: "Karina",
      apellido: "Borgna",
      legajo: 20210516,
      notas: [],
    },
    {
      id: 5,
      nombre: "Javier",
      apellido: "Riera",
      legajo: 20220125,
      notas: [],
    },
  ];
//   Ejercicio 1

//   A. ¿Qué tipo de dato contiene la variable ‘alumnos’?
//   -Contiene datos de tipo integer(id,legajo),string(nombre,apellido),arreglo(alumnos,notas).
  
//   B.¿Qué propiedades tiene la estructura definida en el archivo final.js?
//   -Contiene unos objetos dentro de un arreglo.

//   Ejercicio 2
function agregarValorNotas(array){
    for (let i = 0; i < array.length; i++) {
        if (array[i].id===5){
            array[i].notas=[10,9,8,7,9] 
        } 
    }
    return array
}
let capturandoAgregarNotas=agregarValorNotas(alumnos)
console.log(capturandoAgregarNotas);
// Crear un método que retorne el promedio de notas. (*)
function promedioNotas(array){
    let suma = 0;
    for(let i=0; i< array[4].notas.length; i++){
        suma +=  array[4].notas[i]; 
    }
return suma/array[4].notas.length; 
}
let promedioFinal=promedioNotas(alumnos);
console.log(promedioFinal);
// Crear una función que ordene las notas del alumno de forma descendente. (*)
function ordenarNotasAsc(array) {
    for (let c = 0; c < array.length; c++) {
        for (let i = 0; i < array.length - 1; i++) {
            if (array[4].notas[i]<array[4].notas[i + 1]) {
                let temporal = array[4].notas[i];
                array[4].notas[i] = array[4].notas[i + 1];
                array[4].notas[i + 1] = temporal;
            }
        }
    }
return array;
}
let capturandoOrdenarNotas=ordenarNotasAsc(alumnos);
console.log(capturandoOrdenarNotas);



//   Ejercicio 3
// Crea una matriz de 3x3, cuadrada, con números enteros positivos en cada una de sus posiciones.
function crearMatriz() {
    let matrizCompleta=[];
    for (let i = 0; i <= 3; i++) {
        let fila=[];
        for (let j = 0; j <= 3; j++) {
            fila.push(j+i+2);
        }
    matrizCompleta.push(fila);
    }
return matrizCompleta;
}
let capturandoMatrizCompleta=crearMatriz()
console.table(capturandoMatrizCompleta);
// Crear una función que retorne la suma de todos los números dentro de la matriz que sean múltiplos de 3.
function multiploDe3(array) {
    let suma=0;
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array[i].length; j++) {
            if (array[i][j]%3===0) {
                suma+=array[i][j];
            }
        }
    }
return suma;
}
let capturandoMultiplo3=multiploDe3(capturandoMatrizCompleta);
console.log(capturandoMultiplo3);
// Crear una función que retorne un valor booleano dependiendo si la suma de todos los valores de la matriz es par.
function valorBooleano(array) {
    mensaje=false;
    suma=0;
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array.length; j++) {
            suma+=array[i][j];
        }
    }
    if (suma%2===0) {
        mensaje=true;
    }
return mensaje;
}
let capturandoBooleano=valorBooleano(capturandoMatrizCompleta);
console.log(capturandoBooleano);

// Crear una función que retorne la suma de las diagonales de la matriz.

function sumaDiagonalPrimaria(array){
    let suma=0;
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array[i].length; j++) {
            if (i===j) {
                suma+=array[i][j];
            }
        }    
    }
return suma;
}
function sumaDiagonalSecundaria(array) {
    let suma = 0; 
    for(let i=0; i<array.length; i++) {
        suma+= array[i][array.length-1-i];
    }
return suma;
}
function sumandoAmbasDiagonales(a,b) {
    return a+b;
}
let capturandoDiagonalPrimaria=sumaDiagonalPrimaria(capturandoMatrizCompleta);
let capturandoDiagonalSecundaria=sumaDiagonalSecundaria(capturandoMatrizCompleta);
let capturandoSumaDiagonales=sumandoAmbasDiagonales(capturandoDiagonalPrimaria,capturandoDiagonalSecundaria);
console.log(capturandoSumaDiagonales);








