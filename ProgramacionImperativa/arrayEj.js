function elemento(array){
    if (array.length<3){
        return -1;
    }
    else{
        return array[2];
    }
}
let array=["pablo","cabeza"];
let dato3=elemento(array);
console.log(dato3);
