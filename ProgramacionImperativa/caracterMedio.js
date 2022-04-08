function caracterMedio (string){
    let valorMitad=null;
    valorMitad=(Math.floor((string.length)/2))
    if (string.length % 2 !== 0){
        return string[valorMitad];
    }
    else
        return string[valorMitad-1] + string[valorMitad] ;
    
}
console.log(caracterMedio("Hola"));