use extra_joins;
select * from pelicula;


select artista.apellido,artista.nombre,count(pelicula_id) from artista_x_pelicula
inner join artista on artista_x_pelicula.artista_id= artista.id
group by artista_id;

select pelicula.titulo,count(artista_x_pelicula.artista_id) from pelicula
inner join artista_x_pelicula on artista_x_pelicula.artista_id= pelicula.id
group by pelicula.titulo;

select distinct artista.apellido, count(artista_x_pelicula.pelicula_id) from artista
left join artista_x_pelicula on artista_x_pelicula.artista_id=artista.id
group by artista.apellido;

select pelicula.titulo from pelicula
left join artista_x_pelicula on artista_x_pelicula.artista_id= pelicula.id
where artista_x_pelicula.artista_id is null;

select distinct artista.apellido, count(artista_x_pelicula.pelicula_id) from artista
left join artista_x_pelicula on artista_x_pelicula.artista_id=artista.id
group by artista.apellido
having count(artista_x_pelicula.pelicula_id)= 0 ;

select artista.apellido,artista.nombre,count(pelicula_id) as cantidad_peliculas from artista_x_pelicula
inner join artista on artista_x_pelicula.artista_id= artista.id
group by artista_id
having cantidad_peliculas>=2;

select * from artista_x_pelicula
right join pelicula on pelicula.id=artista_x_pelicula.pelicula_id;


































