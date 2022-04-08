function menciona(texto,palabra){
    estaPalabra=texto.indexOf(palabra)
    if (estaPalabra !== -1){
        return true;
    }
    else{
        return false;
    }
}
console.log (menciona("Hola mundo","Hola"));