function factorial(numero){
    let multi=1;
    for (let i = 1; i <= numero ; i++) {
        multi=multi*i;
    }
    return multi; 
}
console.log(factorial(7));