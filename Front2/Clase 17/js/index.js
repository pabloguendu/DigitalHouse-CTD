const btn = document.querySelector('#random');
const imgDog = document.querySelector('main img')

const apiUrl = 'https://dog.ceo/api/breeds/image/random';

async function peticion() {
   try {
       let api = await fetch(apiUrl)
       let respuesta = await api.json()
       console.log(respuesta)
       imgDog.setAttribute("src", respuesta.message)
   } 
   catch(err) {
     console.log(err)
   }
   finally {
    console.log("peticion terminada")
   }
}

// function peticion() {
//     let api = fetch(apiUrl)
//     api
//     .then( respuesta => {
//         console.log(respuesta);
//         return respuesta.json()
//     })
//     .then( datos => {
//         console.log(datos.message);
//         imgDog.setAttribute("src", datos.message)
//     })
//     .catch( error => {
//         console.log(error);
//     });
// }

btn.addEventListener('click', peticion)