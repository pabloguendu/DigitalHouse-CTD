let persona=[
    {
        nombre:"pablo",
        apellido:"Guendulain",
        saldo:"$5000",
        profesion:"programador",
        saludo:function(){
            return (`Hola ${this.nombre} ${this.apellido} como estas?`)
        }
    },
    {   
        nombre:"roberto",
        apellido:"gomez bolainos",
        saldo:"$300000",
        profesion:"ciruja",
        saludo:function(){
            return (`Hola ${this.nombre} ${this.apellido} como estas?`)
        }
    },
    {   
        nombre:"salame",
        apellido:"milan",
        saldo:"$30000000",
        profesion:"tornero",
        saludo:function(){
            return (`Hola ${this.nombre} ${this.apellido} como estas?`)
        }
    }

]
function masPlata(array){
    let sinSigno=null;
    arraySinSigno=[];
    menorSaldo=null;
    for (let i = 0; i < array.length; i++) {
        sinSigno=array[i].saldo.replace("$","")
        arraySinSigno.push(sinSigno)
        menorSaldo=Math.max(...arraySinSigno)
        valorComparar="$"+menorSaldo
    }
    for (let i = 0; i < array.length; i++) {
        if (array[i].saldo==valorComparar){
            return array[i].nombre +" "+ "Tiene el saldo más grande"
        }
    }
}
function agregarPropiedad(array){
    for (let i = 0; i < array.length; i++) {
        array[i].suNombre=function(){
          console.log(`su nombre es ${array[i].nombre} con profesion de ${array[i].profesion}`)
        }
    }

}
function sumarEdad (array){
    let anios=41;
    for (let i = 0; i < array.length; i++) {
        anios=anios+1;
        array[i].edad =anios;
    }
return array
}

sumatoriaEdad=sumarEdad(persona)
console.log(sumatoriaEdad)
agregarPropiedad(persona)
persona[1].suNombre()



