const pelisAnimadas=["toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"]
function imprimirInverso (x){
    let i=x.length-1;
    while (i>=0) {
        console.log(x[i])
        i--
    }
}
function inversor (x){
    let newArray=[];
    newArray=x.reverse();
return newArray
}
imprimirInverso(pelisAnimadas);
console.log(inversor(pelisAnimadas));