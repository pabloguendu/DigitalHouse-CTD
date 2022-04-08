function sumatoria (numero){
    let sumando=null;
    for (let i = 1; i <= numero; i++) {
        sumando=sumando+i;
    }
    return sumando;

}
console.log(sumatoria(4));