const prompt = require("prompt-sync")({ sigint: true });

nro1=prompt("Ingrese un numero: ");
nro2=prompt("Ingrese otro numero: ");
multi= nro1!==nro2 ? nro1*nro2 : "sos de la b";
console.log(`la multiplicacion de los numeros es ${multi}`);
