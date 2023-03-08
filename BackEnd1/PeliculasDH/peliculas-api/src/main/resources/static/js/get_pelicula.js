window.addEventListener('load', function () {
  (function(){

    const url = "/peliculas"

    const settings = {
      method: 'GET',
    }

    fetch(url, settings)
    .then(response => response.json())
    .then(data => {
      console.log("ESTA ES LA INFO TRAIDA DESDE EL GET")
      console.log(data)

    for(pelicula of data){
      const table = document.querySelector('#peliculaTable');
      const peliculaRow = table.insertRow();
      let tr_id = 'tr_' + pelicula.id;
      peliculaRow.id = tr_id;

            let deleteButton = '<button'+
            ' id=' + '\"' + 'btn_delete_' + pelicula.id + '\"' +
            ' type="button" onclick="deleteBy('+pelicula.id+')" + class="btn btn-danger btn_delete">' +
            '&times' + 
            '</button>';

            let updateButton = '<button' +
            ' id=' + '\"' + 'btn_id_' + pelicula.id + '\"' +
            ' type="button" onclick="findBy('+pelicula.id+')" class="btn btn-info btn_id">' +
            pelicula.id +
            '</button>';

            peliculaRow.innerHTML = '<td>' + updateButton  + '</td>' +
                                    '<td>' + pelicula.titulo.toUpperCase() + '</td>'+
                                    '<td>' + pelicula.categoria.toUpperCase() + '</td>'+
                                    '<td>' + deleteButton  + '</td>'

                      }




    })





  })()
})