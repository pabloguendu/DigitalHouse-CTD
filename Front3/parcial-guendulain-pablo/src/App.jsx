import { useState } from 'react'
import './App.css'
import Card from './component/Card'
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  const [userMail, setUserMail] = useState("")
  const [userPassword, setUserPassword] = useState("")
  let [validationMail, setValidationMail] = useState("false")
  let [validationPassword, setValidationPassword] = useState("false")

  const onChangeUserMail=(e)=>setUserMail(e.target.value);
  const onChangeUserPassword=(e)=>setUserPassword(e.target.value);

  function validationInputEmail(){
    const isValid = / /;
    let hasSpace=null;
    

    if(userMail[0]==undefined){
      hasSpace=true
    }else{
      hasSpace=false
    }
    console.log(userMail[0])
    if(userMail.length>3 && hasSpace){
      return false;
    }else{
      return true;
    }
  }

  function signUpUser(e) {
    e.preventDefault();
  }

  return (
    <><form>
      <div class="form-group">
        <label for="exampleInputEmail1">Email address</label>
        <input onChange={onChangeUserMail} type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" value={userMail}/>
          {validationInputEmail() &&<small id="emailHelp" class="form-text text-muted">Mail no cumple con los parametros establecidos</small>}
        </div>
      <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input onChange={onChangeUserPassword} type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" value={userPassword}/>
      </div>
      <button type="submit" class="btn btn-primary" disabled={validationMail && validationPassword}>Submit</button>
    </form><Card /></>
  )
}

export default App
