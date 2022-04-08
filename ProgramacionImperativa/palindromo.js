function vuelta(x){
    let nuevaPalabra=x.split("").reverse().join("");
    
    if (nuevaPalabra===x) {
        return true;
    }
    else{
        return false;
    }
    
}
console.log(vuelta("salame"));
