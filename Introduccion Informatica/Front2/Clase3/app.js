// 1-
const premioTotal = 2500;


const casilla = 5;
function calculandoAciertos(){
  let acierto=0;
  for (let i = 0; i < casilla; i++) {
    const numero = Math.round(Math.random() * casilla);
    if (numero===i) {
      acierto++;
    }
  }
  return acierto;
}

function calcular(aciertos) {
  return parseInt((2500 / casilla)* aciertos);
}
let cantidadDeAciertos=calculandoAciertos();
let cantidadPuntos=calcular(cantidadDeAciertos);

alert("Ganaste " + cantidadPuntos + " con ésta cantidad de aciertos " + cantidadDeAciertos);

// 2-Loteria
// const resultLoteria={
//     0:1000,
//     1:10000,
//     2:10000,
//     3:100000
// }

// function resultadoLoteria2() {
//     const valor = Math.round(Math.random() * 3);
//     const premio = resultLoteria[valor];
  
//     let printResult= `Te ha tocado el nro:  ${valor}, ganaste: $ ${premio}`;
//     alert(printResult);
//   }
// resultadoLoteria2();

// // 3-Ruleta
// const finalRuleta=25;
// function sortearNumeroRandom(){
//     let numeroRandom=Math.round(Math.random()*25);
//     return numeroRandom;
// }
// function recorrerRuleta(numero){
//     for (let i = 0; i <= finalRuleta; i++) {
//         if (numero===i){
//             alert("Numero ganador!!" + i);
//         }else{
//             console.log ("Numero de iteraciones: "+i);
//         }
//     }
    
// }
// let numeroSorteado=sortearNumeroRandom();
// recorrerRuleta(numeroSorteado);


// 4-
// var numero = 20;
// while( numero>0 ) {
//   resto = numero%10;
//   numero = parseInt(numero/10);
//   console.log(resto);
// }
// Ejecuta una división en la que, mientras el número ingresado sea mayor a 0, imprimirá por consola el valor del resto. 




