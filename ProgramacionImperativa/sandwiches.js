const prompt = require("prompt-sync")({ sigint: true });
function prueba(sandwiches,tipoDePan,queso,tomate,lechuga,cebolla,mayonesa,mostaza){
    switch (sandwiches) {
        case "pollo":
            totalAPagar=150;
            break;
        case "carne":
            totalAPagar=200;
            break;
        case "veggie":
            totalAPagar=100;
            break;
        default:
            break;
    }
    switch (tipoDePan) {
        case "blanco":
            totalAPagar=totalAPagar+50;
            break;
        case "negro":
            totalAPagar=totalAPagar+60;
            break;
        case "sin gluten":
            totalAPagar=totalAPagar+75;
            break;
        default:
            break;
    }
    if (queso) totalAPagar= totalAPagar+20;
    if (tomate) totalAPagar=totalAPagar+15;
    if (lechuga) totalAPagar=totalAPagar+10;
    if (cebolla) totalAPagar=totalAPagar+15;
    if (mayonesa) totalAPagar=totalAPagar+5;
    if (mostaza) totalAPagar=totalAPagar+5;
    return totalAPagar;
}
console.log(prueba("pollo","negro",true,true,false,false,false,false));