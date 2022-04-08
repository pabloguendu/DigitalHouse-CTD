const peliculas= ["star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"]

function todoMayuscula(x){
    let newArray=[];
    let nuevaPalabra=null;
    for (let i = 0; i < x.length; i++) {
        nuevaPalabra=x[i].toUpperCase();
        newArray.push(nuevaPalabra);
        

    }
    return newArray;
}
console.log(todoMayuscula(peliculas))

