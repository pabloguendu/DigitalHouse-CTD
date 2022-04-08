/*
PRACTICAMOS FOR, ARREGLOS, OBJETOS Y CONDIICIONALES
1) DADO EL SIGUIENTE ARREGLO
*/
let numeros = [5,9,12,25,6,7,18,1,24,4]
/*
DETERMINAR LA SUMA TOTAL DE ELLOS, SOLAMENTE SUMANDO LOS NUMEROS IMPARES
Y GUARDARLO EN UNA VARIABLE QUE SE LLAME RESULTADO. PISTA:
(RECORDA QUE PODEMOS GUARDAD LA EJECUCION DE UNA FUNCION
Y LO QUE RETORNE SERA ASIGNADO A LA VARIABLE)
*/
console.log("este es el ejercicio 1");

function ejercicio1(array){
    let suma=0
    for(let i=0; i< array.length; i++){
        if ( array[i]%2 != 0){
            suma= suma +array[i]
        }

    } return suma
}
let resultado= ejercicio1(numeros);
console.log(resultado)

/*
2)DADO EL SIGUIENTE ARREGLO...
*/
const arrayNumeros = [ 7,16,32,27,45,27,51,12,19,21]
/*
CREAR UNO NUEVO EL CUAL CONTENDRA LOS NUMEROS DE ESTE ARREGLO
PERO SOLO LOS NUMEROS QUE SEAN MAYORES QUE 15 Y MENORES O IGUALES QUE 30
*/
console.log("*")
console.log("*")
console.log("*")
console.log ("este es el ejercicio 2")
function menoreIguales (array){
    let arrayResultado= []
    for (let i=0; i< array.length; i++){
        if (array[i]> 15 && array[i]<= 30){

            arrayResultado.push(array[i])
        }
    } return arrayResultado
}
 let resultadoEj2= menoreIguales(arrayNumeros)
 console.log(resultadoEj2)
/*
3) DADO EL SIGUIENTE ARREGLO...
*/
let profesionales = [
  {
	nombre:"juancito",
	profesion:"progamador"	
},
 {
	nombre:"maria",
	profesion:"comerciante"	
},
 {
	nombre:"pepito",
	profesion:"docente"	
}
]

/*
crear una funcion para que le agregue un metodo a cada objeto
lo que debe hacer el metodo es retonar un string con el nombre y su profesion
por ejemplo, "mi nombre es juancito y soy programador"

LUEGO NOS DIMOS CUENTA QUE NO LE AGREGAMOS LA EDAD A NINGUNA PERSONA
DEBEMOS CREAR OTRA FUNCION QUE LE AGREGUE ESA PROPIEDAD A TODOS LOS OBJETOS
DATO DE COLOR (LA EDAD DE LAS PERSONAS ES UN AÑO MAS CADA UNA Y LA MAS JOVEN TIENE 41)
*/
console.log("* ")
console.log("* ")
console.log("* ")
console.log ("este es el ejercicio 3")
console.log("*******************primera posibilidad de saludar*******************************")
function agregarMetodo(array){

    for(let i=0 ; i<array.length;i++){
        array[i].saludar = function(){console.log("mi nombre es " + array[i].nombre +" y soy " +array[i].profesion)}
        
    } return array
}

let metodoSaludar=agregarMetodo(profesionales);
console.log(metodoSaludar);

/*console.log("*******************segunda posibilidad de saludar*******************************")

function agregarMetodo(array){

    for(let i=0 ; i<array.length;i++){
        array[i].saludar = "mi nombre es " + array[i].nombre +" y soy " +array[i].profesion
    } return array
}

let metodoSaludar2=agregarMetodo(profesionales);
console.log(metodoSaludar2);*/

console.log("******************agregar Edad****************")
// agregar edad menor41 sumando de a uno
function agregarEdad(array){
    let anios=40
    for(let i = 0; i<array.length;i++){
        anios= anios+1
        array[i].edad= anios

    }return array
}
let edadAgregada= agregarEdad(profesionales);
console.log(edadAgregada)
profesionales[1].saludar();