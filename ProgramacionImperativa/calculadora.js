const prompt = require("prompt-sync")({ sigint: true });
let sumar = (num1,num2) =>num1+num2;
let restar = (num1,num2) =>num1-num2;
let multiplicar = (num1,num2) =>num1*num2;
let dividir = (num1,num2) =>num1/num2;

function cuadradoDeUnNumero (num1){
    let multiplicacionCuadrado=multiplicar(num1,num1);
    return multiplicacionCuadrado;
}
function promedioDeTresNumeros(num1,num2,num3){
    let sumaPromedio=num1+num2+num3;
    let divdirPromedio=dividir(sumaPromedio,3)
    return divdirPromedio;
}
function calcularPorcentaje(num1,num2){
    let multiplicarPorcentaje= multiplicar(num1,num2);
    let dividirPorcentaje=dividir(multiplicarPorcentaje,100)
    return dividirPorcentaje;
}
function generadorDePorcentajes(num1,num2){
    let calculardivision= dividir(num1,num2);
    let multiplicarPorcentaje= multiplicar(calculardivision,100)
    return multiplicarPorcentaje + "%";
}

console.log ("---------testeo--------")
console.log(sumar(5,20));
console.log(restar(40,20));
console.log(multiplicar(5,20));
console.log(dividir(5,0));
console.log (cuadradoDeUnNumero(5));
console.log(promedioDeTresNumeros(5,7,10));
console.log(calcularPorcentaje(300,15));
console.log(generadorDePorcentajes(2,200));









