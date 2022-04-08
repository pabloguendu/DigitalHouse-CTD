function menciona(texto,palabra){
    estaPalabra=texto.indexOf(palabra)
    if (estaPalabra !== -1){
        return true;
    }
    else{
        return false;
    }
}
let pepito=menciona("salamin tiene 2", "salamin");
console.log(pepito);
