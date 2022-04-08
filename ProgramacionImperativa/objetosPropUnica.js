const arrayO=[{nombre:"Lean", edad:27},{nombre:"Eze", edad:49}]
function propiedades(str, arrayO) {
    let newArrayObj=[{}];
    if(str==="edad"){
        newArrayObj= [{edad: arrayO[0].edad},{edad:arrayO[1].edad}]
    }
    else if (str==="nombre"){
        newArrayObj= [{nombre: arrayO[0].nombre},{nombre:arrayO[1].nombre}]
    }
return newArrayObj;
}
console.log(propiedades("nombre", arrayO))
