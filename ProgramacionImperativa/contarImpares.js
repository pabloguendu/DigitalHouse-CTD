const prompt = require("prompt-sync")({ sigint: true });
function noParesDeContarImparesHasta(x){
    let total=null;
    for (i=1 ; i <= x; i++){
        if ((i % 2) !== 0){
            total++;
        }
    }
    return total;
}
let numero=prompt("Ingrese el numero:")
console.log(noParesDeContarImparesHasta(numero));