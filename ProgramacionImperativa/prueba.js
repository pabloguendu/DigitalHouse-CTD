const prompt = require("prompt-sync")({ sigint: true });
function convertir (x){
    return x*2.54;
}
let calculo= prompt("Ingrese la cantidad de pulgadas: ");
console.log(convertir(calculo));
