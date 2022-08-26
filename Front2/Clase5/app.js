let boton = document.querySelector('button');

boton.addEventListener('click', () => {
            
                    let body = document.querySelector('body');
                    let i = document.querySelector('i');


                    if(body.classList.contains("modoClaro")){

                    boton.innerText = "Modo Claro";
                    boton.style.color="white";
                    boton.style.backgroundColor="#1F252C";
                    boton.style.border="2px solid white";
                    boton.style.borderRadius="5px";

                    let h1 = document.querySelector('h1');
                    h1.style.color="white";
                    h1.style.backgroundColor="#1F252C";

                    body.style.backgroundColor= "#3E3938";
                    body.style.color="white";

                    let div = document.querySelectorAll('.item');
                    div.forEach(divInd => {
                    divInd.style.backgroundColor="#1F252C";
                    })

                    body.classList.add("modoOscuro");
                    body.classList.remove("modoClaro")   

            } else {
                        
                    boton.innerText = "Modo Nocturno";
                    boton.style.color=null;
                    boton.style.backgroundColor=null;
                    boton.style.border="2px solid black";
                    boton.style.borderRadius="5px";

                    let h1 = document.querySelector('h1');
                    h1.style.color=null;
                    h1.style.backgroundColor=null;

                    body.style.backgroundColor= null;
                    body.style.color=null;

                    let div = document.querySelectorAll('.item');
                    div.forEach(divInd => {
                    divInd.style.backgroundColor=null;
                    })

            
                    body.classList.add("modoClaro");
                    body.classList.remove("modoOscuro")   
                

            }

});