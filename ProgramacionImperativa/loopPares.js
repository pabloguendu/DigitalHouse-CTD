function loopDePares (numero,palabra){
    let sumaNumero=null;
    for (let i = 0; i <=50; i++) {
        sumaNumero= numero+i;
        if (sumaNumero % 2 === 0) {
            console.log(`${sumaNumero} es par`);
        }
        else{
            console.log(palabra);
        }
    }
}
loopDePares(10,"la pifiaste");