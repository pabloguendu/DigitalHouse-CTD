const arrayCuentas =
[
{
titular: "Arlene Barr",
estaHabilitada: false,
saldo: "$3,253.40",
edadTitular: 33,
tipoCuenta: "sueldo"
},
{
titular: "Roslyn Torres",
estaHabilitada: false,
saldo: "$3,229.45",
edadTitular: 27,
tipoCuenta: "sueldo"
},
{
titular: "Cleo Lopez",
estaHabilitada: true,
saldo: "$1,360.19",
edadTitular: 34,
tipoCuenta: "corriente"
},
{
titular: "Daniel Malone",
estaHabilitada: false,
saldo: "$3,627.12",
edadTitular: 30,
tipoCuenta: "sueldo"
},
{
    titular: "Ethel Leon",
    estaHabilitada: true,
    saldo: "$1,616.52",
    edadTitular: 34,
    tipoCuenta: "sueldo"
    },
    {
    titular: "Harding Mitchell",
    estaHabilitada: true,
    saldo: "$1,408.68",
    edadTitular: 28,
    tipoCuenta: "corriente"
    }
    ]

    function titularJoven(array){
        let titularMasJoven={};
        let edadNuevo=null;
        let arrayEdadMenor=[];
        for (let i = 0; i < array.length; i++) {
            arrayEdadMenor.push(array[i].edadTitular)
            edadNuevo=Math.min(...arrayEdadMenor)
            if (array[i].edadTitular===edadNuevo) {
                titularMasJoven=array[i];
            }
        }
        return titularMasJoven;
    }
    let prueba1=titularJoven(arrayCuentas);
    console.log(prueba1);