const imagenes = document.querySelectorAll("img");
const urlImagenes = [];

imagenes.forEach((_, index) => {
  const url =
    "https://cf.ltkcdn.net/gatos/images/std/236641-800x515r1-etapas-desarrollo-gatitos.jpg"; /*prompt(`Ingresa la url para la imagen ${index + 1}`);*/
  urlImagenes.push(url);
});

urlImagenes.forEach((url, index) => {
  const nodoImagen = document.querySelector(`#imagen-${index + 1}`);
  nodoImagen.setAttribute("src", url);
  nodoImagen.parentElement.setAttribute(
    "href",
    "https://cf.ltkcdn.net/gatos/images/std/236641-800x515r1-etapas-desarrollo-gatitos.jpg"
  );
  nodoImagen.parentElement.setAttribute("target", "blank");
  nodoImagen.src = url;
});
