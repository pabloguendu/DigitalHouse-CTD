
const Form = ({nombre,apellido,dni,children}) =>{
    return(
    <>
    <div class="formulario">
        <form class="formulario2">

        <label for="nombre">{nombre} </label>
        <input type="text" id="nombre" placeholder="Ingresar el nombre" required/>

        <label for="apellido">{apellido} </label>
        <input type="text" id="mail" placeholder="e-mail" required />

        <label for="dni"> {dni} </label>
        <textarea name="" id="" rows="7"></textarea>
        {children}
        </form>
        

    
    </div>
    </>
)}

export default Form;


