function conversor2(string) {
    let nuevaString = [];
  
    for (let i = 0; i < string.length; i++) {
      if (string[i] === "-") {
        if (i + 1 <= string.length && string[i + 1] !== "-") {
          let firstSubString = string.substring(0, i+1)
          let secondSubString = string.substring(i+1, string.length)
          string = firstSubString + secondSubString.replace(string[i+1], string[i+1].toUpperCase())
        }
      }
    }
    nuevaString = string.replaceAll("-", "");
    return nuevaString;
  }
  console.log(conversor2("hola-papa-pola"))