let returnedArray = [];
numero = 1
for(let i=0; i<10; i++) {
    returnedArray[i] = [];
    for (j=0 ; j<10 ; j++){
    returnedArray[i][j] = numero+j
    }
    numero+= j
} 
function diagonal(array){
    let suma=0;
    let indice=0;
    for (let i = 0; i < array.length; i++) {
        for (let j =array.length ; j >= 0; j--) {
            if (j===array.length-indice) {
                suma=suma+array[i][j];
                console.log(suma);
                indice--
            }
        }  
    }
    console.log(suma);
   return suma;     
}

// console.log(returnedArray);
let resultado=diagonal(returnedArray);
// console.log(resultado);

// resultado=diagonal(returnedArray);
// console.log(resultado);
// for (let i = 0; i < returnedArray.length; i++) {
//     for (let j = 0; j < returnedArray.length; j++) {
//         console.log(returnedArray[i][j])
        
//     }  
// }

// let resultadoFinal=diagonal(returnedArray);
// console.table(returnedArray)