// variables globales
const form = document.querySelector('form');
const busqueda = document.querySelector('#busqueda');
const listadoBusquedas = document.querySelector('#busquedas-realizadas');

let busquedasRealizadas = []

renderizarBusquedas(busquedasRealizadas);

//frenamos la accion por defecto del formulario
//disparamos la logica
form.addEventListener('submit', (e)=>{
    e.preventDefault();


    //almaceamos las busquedas en localStorage

    
    //ejecutamos la busqueda
});



//tomamos los datos ingresados en el buscador
function captarData(){


}

//renderizar busquedas almacenadas
function renderizarBusquedas(listado) {
    listado.forEach(element => {
        let nodo = document.createElement('p');
        let texto = document.createTextNode(element);
        nodo.appendChild(texto);
        listadoBusquedas.appendChild(nodo);
    });
    
}

//Redireccionamos la location a google con la url parseada
// `https://www.google.com/search?q=${PALABRA BUSCADA}`
function realizarBusqueda(texto) {

}