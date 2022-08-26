console.log("****** ej 1******");
let estudiante={
    nombre: "Pablo",
    apellido: "Guendulain",
    camada: 5,
    esParcial:true
}

function nota (nota){
    let mensaje=null;
    if (nota<=10) {
        if (nota<4) {
            mensaje=`El alumno obtuvo una nota igual a ${nota} por lo tanto su condición es DESAPROBADO`;
        }
        else if (nota>=4 && nota<7){
            mensaje=`El alumno obtuvo una nota igual a ${nota} por lo tanto su condición es DEBE RENDIR EXAMEN FINAL`; 
        }
        else{
            mensaje=`El alumno obtuvo una nota igual a ${nota} por lo tanto su condición es PROMOCIONADO`;
        }
    }
    else{
        mensaje="No se ingreso una nota valida";
    }
    
return mensaje;
}
let mensajeNota=nota(10);
console.log(mensajeNota);

console.log("****** ej 2******");

let clase=[{
    nombre: "Lorena",
    apellido: "Montaldo",
    bimestre: 2
},
{
    nombre: "Sofia",
    apellido: "Lazatera",
    bimestre: 2
},
{
    nombre: "Maria",
    apellido: "Bruno",
    bimestre: 2
}]
console.log(clase);

function siguienteCursada(array){
    for (let i = 0; i < array.length; i++) {
        array[i].bimestre=array[i].bimestre+1;
    }
return array;
}
console.log(siguienteCursada(clase));

console.log("****** ej 3******");


function asistencias(asistencias,condicion){
    const asistenciaMinima=23;
    if (asistencias>=asistenciaMinima && condicion===true) {
        mensaje="Aprobado";
    }
    else{
        mensaje="Desaprobado"
    }
return mensaje;
}
let primeraPrueba=asistencias(23,true);
console.log("****PRIMER ALUMNO****")
console.log(primeraPrueba)
let segundaPrueba=asistencias(22,true);
console.log("****SEGUNDO ALUMNO****")
console.log(segundaPrueba);






