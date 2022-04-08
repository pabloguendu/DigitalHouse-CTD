function nuevoArray(numero){
    let newArray=[];
    for (let i = 1; i <= numero; i++) {
        newArray.push(i);
    }
    return newArray;
}
console.log(nuevoArray(10))