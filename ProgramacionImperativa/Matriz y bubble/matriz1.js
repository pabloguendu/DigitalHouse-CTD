// /**
//  * Declara una variable que contenga una matriz
//  * de 5x5 llena de puros numeros enteros y positivos
//  */
//  let matriz = [[5,4,3,2,1],[1,2,3,4,5],[1,2,3,4,5],[1,2,3,4,5],[1,2,3,4,5]];

//  /**
//   * Luego, escribe un algoritmo para sumar todos
//   * los numeros en la matriz.
//   */
 
//   function sumatoriaMatriz(matriz) {
//    let suma = 0; 
//    for(let i=0; i<matriz.length; i++) {
//       for(let j=0; j<matriz[i].length; j++) {
//          suma += matriz[i][j];
//       }
//     }
//    return suma;
//   }


  function generarMatrizDe100(){
    let matriz = [];
    for(i=0;i<10;i++) {
        let fila = [];
        for(j=1; j<=10; j++) {  // i maneja Decenas, j las Unicdades
            fila.push(j+i*10);
        }
        matriz.push(fila)
    }
    return matriz;
  }
 
// console.log(sumatoriaMatriz(matriz));
// let matriz100 = generarMatrizDe100();

// console.log(matriz100)
 
// function sumatoriaIdentidadMatriz(matriz) {
//     let suma = 0; 
//     for(let i=0; i<matriz.length; i++) {
//         suma += matriz[i][i];               // Como la matriz es cuadrada sabemos que [i][i] siempre existe
//      }
//     return suma;
//    }
 
//    console.log(sumatoriaIdentidadMatriz(matriz100));

    
  function sumatoriaAntiIdentidadMatriz(matriz) {
    let suma = 0; 
    for(let i=0; i<matriz.length; i++) {
          suma += matriz[i][matriz.length-1-i];     // analogo al anterior
     }
    return suma;
   }

//    console.log(sumatoriaAntiIdentidadMatriz(matriz100));

     //Repaso matrices
function crearMatriz() {
  let resultado = []; //las matrices son un arreglo que dentro tiene màs arreglos

  for (let i = 0; i <= 90; i += 10) {
    //for que corresponde a las filas

    let aux = [];

    for (let j = 1; j <= 10; j++) {
      //for que correponde a las columnas

      aux.push(i + j);
    }
    resultado.push(aux);
  }

  return resultado;
}

let matriz = crearMatriz();
console.table(matriz);