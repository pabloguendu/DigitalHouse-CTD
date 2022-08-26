// let array = [1,2,4,8,16];
// let fibonacci = 0;

// array = array.map(number => {
//     fibonacci += number;
//     return fibonacci;
// })

// alert(array)


var numLlamadas = 0;
function calculaBinomio(a, b)
{
var cuadradoDeA = a*a;
var cuadradoDeB = b*b;
numLlamadas++;
return cuadradoDeA + cuadradoDeB + 2*a*b;
}
alert(calculaBinomio(2, 3));
alert(calculaBinomio(4, 5));
alert(numLlamadas);
alert(typeof(cuadradoDeA));