function conversor(string){
    let nuevaString;
    for(let i = 0; i < string.length; i++){
    if(string[i] === "-"){
        string[i].replace("-","");
        string[i + 1].toUpperCase;
        console.log(string);
    }
    else if(string[i] === '_'){
        nuevaString = string[i].replace('_','');
        string[i + 1].toUpperCase;
    }
}
// return string;
}

console.log(conversor("hola-salame-milan-queso"))
