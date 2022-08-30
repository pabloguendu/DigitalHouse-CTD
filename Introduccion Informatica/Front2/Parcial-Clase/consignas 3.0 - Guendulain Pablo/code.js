/* --------------------------- NO TOCAR DESDE ACÁ --------------------------- */
let datosPersona = {
  nombre: "",
  edad: 0,
  ciudad: "",
  interesPorJs: "",
};

const listado = [{
    imgUrl: "https://huguidugui.files.wordpress.com/2015/03/html1.png",
    lenguajes: "HTML y CSS",
    bimestre: "1er bimestre",
  },
  {
    imgUrl: "https://jherax.files.wordpress.com/2018/08/javascript_logo.png",
    lenguajes: "Javascript",
    bimestre: "2do bimestre",
  },
  {
    imgUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/React.svg/1200px-React.svg.png",
    lenguajes: "React JS",
    bimestre: "3er bimestre",
  },
];

const profileBtn = document.querySelector("#completar-perfil");
const materiasBtn = document.querySelector("#obtener-materias");
const cambiarTema = document.querySelector('#cambiar-tema');

profileBtn.addEventListener("click", renderizarDatosUsuario);
materiasBtn.addEventListener("click", recorrerListadoYRenderizarTarjetas);
cambiarTema.addEventListener("click", alternarColorTema);
/* --------------------------- NO TOCAR HASTA ACÁ --------------------------- */

function obtenerDatosDelUsuario() {
  /* --------------- PUNTO 1: Escribe tu codigo a partir de aqui --------------- */
  let diaHoy = new Date();
  let nombre=prompt("Ingrese su nombre");
  let anioNacimiento=prompt("Ingrese su año de nacimiento");
  let ciudad=prompt("Ingrese ciudad");
  let interesJs=confirm("Le interesa JavaScript??");
  if ( isNaN(nombre) && isNaN(ciudad) && (anioNacimiento>0 && anioNacimiento.length===4 )) {
    datosPersona.nombre=nombre;
    datosPersona.edad=diaHoy.getFullYear()-parseInt(anioNacimiento);
    datosPersona.ciudad=ciudad;
    datosPersona.interesPorJs=interesJs;
  }else{
    alert("No se ingresaron valores validos");

  }
  
}

function renderizarDatosUsuario() {
  /* ------------------- NO TOCAR NI ELIMINAR ESTA FUNCION. ------------------- */
  obtenerDatosDelUsuario();
  document.getElementById("nombre").innerHTML = datosPersona.nombre;
  datosPersona.edad !=0 ? document.getElementById("edad").innerHTML = datosPersona.edad : datosPersona.edad="";
  document.getElementById("ciudad").innerHTML = datosPersona.ciudad;
  if (datosPersona.interesPorJs === true){
    document.getElementById("javascript").innerHTML = "Si";
  }else if (datosPersona.interesPorJs===false){
    document.getElementById("javascript").innerHTML = "No";
  }
  
}

function recorrerListadoYRenderizarTarjetas() {
  /* ------------------ PUNTO 3: Escribe tu codigo desde aqui ------------------ */
  let cajaContenedora=document.getElementById("fila");
  listado.forEach(element => {
    cajaContenedora.innerHTML+=
    `
    <div class="caja">
      <img src=${element.imgUrl} alt=${element.lenguajes}>
      <p class="lenguajes">${element.lenguajes}</p>
      <p class="bimestre">${element.bimestre}</p>
    </div>
    
    `
    materiasBtn.removeEventListener("click", recorrerListadoYRenderizarTarjetas);
    materiasBtn.style.opacity="0.50";
  });
  
}

function alternarColorTema() {
  /* --------------------- PUNTO 4: Escribe tu codigo aqui --------------------- */
  let cambiarColorSitio=document.getElementById("sitio");
  cambiarColorSitio.classList.toggle("dark");
}

/* --------------------- PUNTO 5: Escribe tu codigo aqui --------------------- */
window.addEventListener("keypress",function(f){
  console.log("La teclado presiona fue: "+f.key)
  if (f.key==="f" || f.key==="F"){
    let mostrartexto=document.getElementById("sobre-mi");
    mostrartexto.classList.remove("oculto");
  }
})