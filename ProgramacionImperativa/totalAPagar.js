const prompt = require("prompt-sync")({ sigint: true });
function totalAPagar(vehiculo,litrosConsumidos){
    let totalPago=null;
    switch (vehiculo) {
        case "coche":
            totalPago=86;
            break;
        case "moto":
            totalPago=70;
            break;
        case "autobús":
            totalPago=55;
        default:
            break;
    }
    if (litrosConsumidos>0 && litrosConsumidos<=25){
        totalPago=(totalPago*litrosConsumidos)+50;
    }
    else if (litrosConsumidos>25){
        totalPago=(totalPago*litrosConsumidos)+25;
    }
return totalPago;
}
console.log(totalAPagar("coche",50));