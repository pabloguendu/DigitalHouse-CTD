const prompt = require("prompt-sync")({ sigint: true });
let altura= prompt("Ingrese su altura en metros: ");
let peso= prompt("Ingrese su peso en KG: ");
let calculadorIMC=(altura,peso) =>peso / Math.pow(altura,2);
let masaMuscu=calculadorIMC(altura,peso);
console.log(masaMuscu.toFixed(2));