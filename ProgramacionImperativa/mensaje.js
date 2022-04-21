let nombres = ["Lucas", "Martin", "Lucrecia", "Gabriela", "Mina", "Javier"];
function mostrarMsj(array){
    return "\nEstimado " + array + ", vote por mí";
}
for (let i = 0; i < nombres.length; i++) {
    capturandoMsj=mostrarMsj(nombres[i]);
    console.log(capturandoMsj);   
}

