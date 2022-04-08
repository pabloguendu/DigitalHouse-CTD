use proyecto_spotify;

select titulo
from cancion
where titulo like "%z%";

select titulo
from cancion
where titulo like "_a%s";

select titulo as Titulo,cantcanciones as Cant_canciones, Fechacreacion as Fecha_creacion, Fechaeliminada as Fecha_eliminada 
from playlist
order by Cant_canciones desc
limit 1;

select *
from usuario
order by fecha_nac desc
limit 10
offset 5;

select *
from cancion
order by cantreproduccion desc;

select *
from album
order by titulo;

select *
from album
where imagenportada is null
order by titulo;

insert into usuario (idUsuario,nombreusuario,fecha_nac,sexo,CP,password,Pais_idPais)
values (20,'nuevousuariodespotify@gmail.com','1991-11-15',"M","B4129ATF","S4321m",2);

delete from generoxcancion
where IdGenero=9;

SET SQL_SAFE_UPDATES = 0;

update artista
set imagen="Imagen Faltante"
where imagen is null;

















