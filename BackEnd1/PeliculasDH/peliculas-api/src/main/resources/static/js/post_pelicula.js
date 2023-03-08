window.addEventListener('load', function () {

    const formulario = document.querySelector('#add_new_pelicula');

    formulario.addEventListener('submit', function(event){

        event.preventDefault();

        const formData = {
            titulo: document.querySelector('#titulo').value,
            categoria: document.querySelector('#categoria').value,
            premios: document.querySelector('#premios').value
        };

        const url= '/peliculas';
        
        const settings = {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(formData)
        }

        fetch(url, settings)
        .then(response => response.json()) //parseo
        .then(data => {
            console.log("ESTA ES LA INFO TRAIDA DESDE EL POST")
            console.log(data)

            let div = `<button class="btn-success"> Pelicula agregada  - ${data.titulo} </button>`;
            let divResponse = document.querySelector('#response');

            divResponse.innerHTML = div;
            divResponse.style.display = "block";

            resetUploadForm()
        })

        function resetUploadForm(){
            document.querySelector('#titulo').value = "";
            document.querySelector('#categoria').value = "";
             document.querySelector('#premios').value = "";
    
        }


    })


})