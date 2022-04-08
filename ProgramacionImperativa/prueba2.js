const prompt = require("prompt-sync")({ sigint: true });
function url(x){
    return "www."+ x + ".com";
}
let prueba=prompt("Ingrese algo: ");
console.log(url(prueba));