const prompt = require("prompt-sync")({ sigint: true });
function abrirParacaidas(veloc,alt){
    if (veloc<1000 && ((alt>=2000) && (alt<3000))){
        return "Se abre Paracaidas"
    }
    else{
        return "Te haces bosta"
    }
}
console.log(abrirParacaidas(1000,3001));
