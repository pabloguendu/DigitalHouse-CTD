// ARRAY, OBJETOS, IF ELSE, Y CICLO FOR

// CREAR UN ARRAY DE PERSONAS CON LAS SIGUIENTES PROPIEDADES CADA UNA:
// NOMBRE, APELLIDO, EDAD, PROFESION, cantidadHermanos Y ADEMAS UN METODO QUE NOS RETORNE EL
// NOMBRE COMPLETO DE LA PERSONA
// LUEGO CON UN BUCLE O CICLO INCREMENTAR LA CANTIDAD DE HERMANOS DE CADA PERSONA EN 3

personas=[
    {
        nombre:"Pablo",
        apellido:"Guendulain",
        edad:30,
        profesion: "Futuro Programador",
        cantHermanos:1,
        nombreCompleto:function(){
            return this.nombre + this.apellido;
        }
    },  
    {
        nombre:"Lore",
        apellido:"Montaldo",
        edad:48,
        profesion: "Futura Programadora",
        cantHermanos:2,
        nombreCompleto:function(){
            return this.nombre + this.apellido;
        }
    },
    {
        nombre:"Sofi",
        apellido:"Lazatera",
        edad:30,
        profesion: "Futura Programadora",
        cantHermanos:1,
        nombreCompleto:function(){
            return this.nombre + this.apellido;
        }
    }
]
function multiplicarHermanos(array){
    for (let i = 0; i < array.length; i++) {
        array[i].cantHermanos=array[i].cantHermanos+3
    }
return array;
}

let incrementoHermanos=multiplicarHermanos(personas);
console.log(incrementoHermanos)

// MATRICES
// DADA LA SIGUIENTE MATRIZ 

let matriz = [
    [5, 1, 12, 24],
    [19, 2, 7, 11],
    [10, 3, 14, 27]
]

// CALCULAR LA SUMA TOTAL DE LA COLUMNA EN LA POSICION 1 ( RECORDA QUE EMPIEZA EN LA POSICION 0)
function sumaColPos1(array) {
    let suma= 0;
    for (let i = 0; i < array.length; i++) {
        suma=suma+array[i][1];
    }
return suma;    
}
let capturandoSumaPos1=sumaColPos1(matriz);
console.log(capturandoSumaPos1);
// CALCULAR EL RESULTADO DE MULTIPLICAR TODO LOS ELEMENTOS DE LA FILA EN LA POSICION 2 ( RECORDA QUE EMPIEZA EN LA POSICION 0)
function multFilaPos2(array) {
    let mult= 1;
    for (let i = 0; i < array[2].length; i++) {
        mult*=array[2][i];
    }
return mult;    
}
let capturandomultPos2=multFilaPos2(matriz);
console.log(capturandomultPos2);
// CALCULAR EL TOTAL DE LA SUMA DE TODO LOS ELEMENTOS DE LA MATRIZ
function sumaTodo(array) {
    let suma= 0;
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array[i].length; j++) {
            suma+=array[i][j];
            
        }
    }
return suma;    
}
let capturandoTodoSuma=sumaTodo(matriz);
console.log(capturandoTodoSuma); 
// CREAR UNA MATRIZ DE 5 X 5 CON LOS VALORES QUE TU QUIERAS
function crearMatriz() {
    let matrizCompleta=[];
    for (let i = 0; i <= 5; i++) {
        let fila=[];
        for (let j = 0; j <= 5; j++) {
            fila.push(j+i+2);
        }
    matrizCompleta.push(fila);
    }
return matrizCompleta;
}
let matrizCreada=crearMatriz();
console.table(matrizCreada);
// CREAR UNA FUNCION QUE NOS RETORNE EL TOTAL DE MULTIPLICAR TODOS LOS NUMEROS
function multTodosNros(array){
    let mult=1;
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array[i].length; j++) {
            mult*=array[i][j];
        }    
    }
return mult;
}
let capturandoMult=multTodosNros(matrizCreada);
console.log(capturandoMult);
// DE LA DIAGONAL PRINCIPAL
function multDiagonal(array){
    let mult=1;
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array[i].length; j++) {
            if (i===j) {
                mult*=array[i][j];
            }
        }    
    }
return mult;
}
let capturandoDiagonal=multDiagonal(matrizCreada);
console.log(capturandoDiagonal);

// CREAR UNA FUNCION QUE NOS RETORNE EL TOTAL DE SUMAR TODOS LOS NUMEROS DE LA DIAGONAL SECUNDARIA
function diagonalSecundaria(array) {
    let mult = 1; 
    for(let i=0; i<array.length; i++) {
          mult*= array[i][array.length-1-i];
     }
    return mult;
   }
let capturandoDiagonalSec=diagonalSecundaria(matrizCreada);
console.log(capturandoDiagonalSec);

// EN UNA VARIABLE GUARDAR EL RESULTADO DE DIAGONALPRINCIPAL MENOS DIAGONALSECUNDARIA
let diferenciaDiagonales= capturandoDiagonal-capturandoDiagonalSec;
console.log(diferenciaDiagonales);

// ALGORITMO BUBBLE SORT
// DADO EL SIGUIENTE ARRAY DE NUMEROS, ORDENARLO DE FORMA ASCENDENTE Y LUEGO DESCENDETE
let numerosParaOrdenar = [ 12, 15, 2, 19, 4, 13, 22, 1]
function ordenarNumerosAsc(array) {
    for (let c = 0; c < array.length; c++) {
      for (let i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          let temporal = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temporal;
        }
      }
    }
return array;
}

function ordenarNumerosDesc(array) {
    for (let c = 0; c < array.length; c++) {
      for (let i = 0; i < array.length - 1; i++) {
        if (array[i] < array[i + 1]) {
          let temporal = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temporal;
        }
      }
    }
return array;
}
let capturandoOrdenNumerosAsc=ordenarNumerosAsc(numerosParaOrdenar);
console.log(capturandoOrdenNumerosAsc);
let capturandoOrdenNumerosDesc=ordenarNumerosDesc(numerosParaOrdenar);
console.log(capturandoOrdenNumerosAsc);

// AHORA DEBERAS ORDENAR EL ARRAY DE PERSONAS QUE CREASTE AL INICIO DE FORMA ASCENDENTE// EN BASE A LA CANTIDAD DE HERMANOS E IMPRIMIRLO POR CONSOLA PARA VERIFICAR
function ordenarObjetosAsc(array) {
    for (let c = 0; c < array.length; c++) {
      for (let i = 0; i < array.length - 1; i++) {
        if (array[i].cantHermanos > array[i + 1].cantHermanos) {
          let temporal = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temporal;
        }
      }
    }
return array;
}
let capturandoObjetosAsc=ordenarObjetosAsc(personas);
console.log(capturandoObjetosAsc);
// LUEGO DEBERAS ORDENARLO DE FORMA DESCENDENTE EN BASE A LA PROPIEDAD NOMBRE
function ordenarObjetosDesc(array) {
    for (let c = 0; c < array.length; c++) {
      for (let i = 0; i < array.length - 1; i++) {
        if (array[i].nombre > array[i + 1].nombre) {
          let temporal = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temporal;
        }
      }
    }
return array;
}
let capturandoObjetosDesc=ordenarObjetosDesc(personas);
console.log(capturandoObjetosDesc);
