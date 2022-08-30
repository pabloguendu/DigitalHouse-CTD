const registerBtn = document.querySelector(".register-btn");
const objetoADevolver={
  email:"",
  pass:"",
  legalAge:"",
  tycAccepted:""

}
registerBtn.addEventListener("click", (a) => {
  a.preventDefault();
  // Escribe tu código aquí, siguiendo los siguientes lineamientos paso a paso:
  // 1. Obtenemos el valor ingresado en el input de email
  let emailInput=document.getElementById("email-input").value;
  objetoADevolver.email=emailInput;
  // 2. Obtenemos los datos ingresados en el input de password
  let passwordInput=document.getElementById("password-input").value;
  objetoADevolver.pass=passwordInput;
  // 3. Obtenemos el valor del input radio
  let ageRadio=document.getElementsByName("legalAge");
  ageRadio.forEach(function(age){
    if(age.checked){
      objetoADevolver.legalAge=false;
    }else{
      objetoADevolver.legalAge=true;
    }
  })
  // 4. Obtenemos el valor del input checkbox
  let checkTerminos=document.getElementById("tyc-input")
  objetoADevolver.tycAccepted=checkTerminos.checked


  // 5 Validamos si el usuario es mayor de edad. Si no, mostramos
  // un mensaje de error: "Debes ser mayor de edad para registrarte en el sitio"
  function validarEdad(edad){
    if (edad===false){
      alert("Debes ser mayor de edad para registrarte en el sitio");
    }

  }
  validarEdad(objetoADevolver.legalAge);
  // 6 Vaidamos si el usuario aceptó los términos y condiciones. Si no, mostramos
  // un mensaje de error: "Debes aceptar los TyCs para registrarte en el sitio"
  function validarTerminos(edad){
    if (edad===false){
      alert("Debes aceptar los TyCs para registrarte en el sitio");
    }

  }
  validarTerminos(objetoADevolver.validarTerminos);
  // 7 Si todo esta correcto, mostramos por consola un objeto con la información
  // ingresada por el usuario.
  console.log(objetoADevolver)
});
