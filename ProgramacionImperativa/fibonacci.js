function fibo(numero){
    let n1=0;
    let n2=1;
    let sigTermino=null
    for (let i = 1; i <= numero; i++) {
        console.log(n1);
        sigTermino = n1 + n2;
        n1 = n2;
        n2 = sigTermino;
    }
}
fibo(5);