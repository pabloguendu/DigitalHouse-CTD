const prompt = require("prompt-sync")({ sigint: true });
function numeroSecreto (nro){
    let min = 0;
    let max = 10;
    let nroRandom= Math.floor(Math.random()*(max - min)+min);
    mensaje=(nro===nroRandom)?"Felicitaciones": "Vos podes campeon";
    console.log(nroRandom);
    return mensaje;

}
console.log(numeroSecreto(5));