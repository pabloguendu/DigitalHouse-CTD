use musimundos;

select canciones.nombre,generos.nombre, canciones.compositor
from canciones
inner join generos on canciones.id_genero=generos.id
where canciones.compositor like "Willie Dixon" and generos.nombre="Blues";

