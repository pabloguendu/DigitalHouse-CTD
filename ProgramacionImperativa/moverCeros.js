function moverCeros (array){
    newArraySinCero=[];
    newArrayConCero=[];
    arrayCompleto=[];
    for (let i = 0; i < array.length; i++) {
        if (array[i]===0) {
            newArrayConCero.push(array[i])
        }
        else{
            newArraySinCero.push(array[i])
        }
    }
    arrayCompleto=newArraySinCero.concat(newArrayConCero);
    return arrayCompleto;
    
    

}
let array1=[1,2,0,1,0,1,0,3,0,1]
console.log(moverCeros(array1));