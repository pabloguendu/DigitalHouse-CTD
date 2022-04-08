const prompt = require("prompt-sync")({ sigint: true });
function mostrarNombre(salame){
    return "hola "+ salame;
}
function suma(x,y){
    return x+y;
}
let numero1=parseInt(prompt("Ingrese su nro: "));
let numero2=parseInt(prompt("Ingrese su nro: "));
let sumando=suma(numero1,numero2);
console.log(sumando);
let nombre=prompt("Ingrese su nombre: ");
console.log(mostrarNombre(nombre));