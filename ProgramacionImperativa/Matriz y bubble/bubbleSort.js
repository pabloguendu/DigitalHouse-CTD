//const edades = [33, 27, 34, 30, 34, 25];
/*
function ordenarEdad(array) {
  for (let c = 0; c < array.length; c++) {
    for (let i = 0; i < array.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        let temporal = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temporal;
      }
    }
  }
  return array;
}

let arregloOrdenado = ordenarEdad(edades);
console.log(arregloOrdenado);

function ordenarEdadDescendente(array) {
  for (let c = 0; c < array.length; c++) {
    for (let i = 0; i < array.length - 1; i++) {
      if (array[i] < array[i + 1]) {
        let temporal = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temporal;
      }
    }
  }
  return array;
}

let arrayDescendente = ordenarEdadDescendente(edades);
console.log(arrayDescendente);


const letras = ["C", "A", "D", "E", "H", "Z"];

function ordenarLetras(array) {
  for (let c = 0; c < array.length; c++) {
    for (let i = 0; i < array.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        let temporal = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temporal;
      }
    }
  }
  return array;
}

let letrasOrdenadas = ordenarLetras(letras);
console.log(letrasOrdenadas);
*/

const arrayCuentas = [
    {
      titular: "Arlene Barr",
      estaHabilitada: false,
      saldo: 3253.4,
      edadTitular: 33,
      tipoCuenta: "sueldo"
    },
    {
      titular: "Roslyn Torres",
      estaHabilitada: false,
      saldo: 3229.45,
      edadTitular: 27,
      tipoCuenta: "sueldo"
    },
    {
      titular: "Cleo Lopez",
      estaHabilitada: true,
      saldo: 1360.19,
      edadTitular: 34,
      tipoCuenta: "corriente"
    },
    {
      titular: "Daniel Malone",
      estaHabilitada: false,
      saldo: 3627.12,
      edadTitular: 30,
      tipoCuenta: "sueldo"
    },
    {
      titular: "Ethel Leon",
      estaHabilitada: true,
      saldo: 1616.52,
      edadTitular: 34,
      tipoCuenta: "sueldo"
    },
    {
      titular: "Harding Mitchell",
      estaHabilitada: true,
      saldo: 1408.68,
      edadTitular: 25,
      tipoCuenta: "corriente"
    }
  ];
  function ordenarPorSaldo(array) {
    for (let c = 0; c < array.length; c++) {
      for (let i = 0; i < array.length - 1; i++) {
        if (array[i].saldo > array[i + 1].saldo) {
          let temporal = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temporal;
        }
      }
    }
    return array;
  }
  
  let ordenadoPorSaldo = ordenarPorSaldo(arrayCuentas);
  
  for (let i = 0; i < ordenadoPorSaldo.length; i++) {
    console.log(ordenadoPorSaldo[i]);
  }
  */
  
  function ordenarPorEdad(array) {
    for (let c = 0; c < array.length; c++) {
      for (let i = 0; i < array.length - 1; i++) {
        if (array[i].edadTitular > array[i + 1].edadTitular) {
          let temporal = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temporal;
        }
      }
    }
    return array;
  }
  
  let ordenadoPorEdad = ordenarPorEdad(arrayCuentas);
  
  for (let i = 0; i < ordenadoPorEdad.length; i++) {
    console.log(ordenadoPorEdad[i]);
  }

