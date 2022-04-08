function suma (numero){
    let sumatoria=null;
    for (let i = 0; i < 10; i++) {
        sumatoria=numero+i
        if (sumatoria % 2 === 0) {
            console.log(sumatoria+" Es par")
        }
        else{
            console.log(sumatoria);
        }
    }
}
suma(5);
