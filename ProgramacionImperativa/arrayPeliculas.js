const peliculas= ["star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"]
const pelisAnimadas=["toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"]
const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8, 5];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9, 4];
function todoMayuscula(x,y){
    let newArray=[];
    let newArray2=x.concat(y);
    let nuevaPalabra,elementoEliminado=null;
    for (let i = 0; i < newArray2.length; i++) {
        nuevaPalabra=newArray2[i].toUpperCase();
        newArray.push(nuevaPalabra);
    }
    elementoEliminado=newArray.pop();
    return newArray;
}
function calificaciones(x,y){
    if (x.length===y.length){
        for (let i = 0; i < x.length; i++) {
            if(x[i]!==y[i]){
                mensaje="Las calificaciones son diferentes"
                break;
            }
            else{
                mensaje="Las calificaciones son iguales"
            }
        }
    }
    return mensaje;

}
console.log(todoMayuscula(peliculas,pelisAnimadas));
console.log(calificaciones(asiaScores,euroScores));