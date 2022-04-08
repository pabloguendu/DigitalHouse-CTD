const prompt = require("prompt-sync")({ sigint: true });

let nombre = prompt("Ingrese su nombre:");
let edad = prompt("Ingrese su edad:");
let totalPagar= prompt("Ingrese el monto total a pagar:");
let abonar= prompt("Desea dividir en 6 cuotas con 10% de interes?Responda si o no :")
if (abonar.toUpperCase()==="SI")
    totalPagar=(totalPagar/6)*1.10;
console.log (`hola ${nombre} con edad ${edad} tiene un total a pagar de $ ${totalPagar}`);


