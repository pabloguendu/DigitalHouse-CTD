let array=[1,2,3,4]
let array2= ["h","o","l","a"]
function arrayHandler(x,y){
    for (let i = 0; i < x.length; i++) {
        console.log(`Soy ${x[i]} y yo soy ${y[i]}`);
    } 
}
arrayHandler(array,array2);