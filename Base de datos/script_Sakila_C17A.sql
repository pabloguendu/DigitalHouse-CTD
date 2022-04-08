use sakila;

CREATE VIEW vista_mostrar_pais AS
SELECT country 
from country;

select * from vista_mostrar_pais;

create view devolver_nombre_apellido as
select concat(last_name," ",first_name) as Artista,count(film_actor.film_id) as cant_film from actor
inner join film_actor on film_actor.actor_id=actor.actor_id
group by film_actor.actor_id
having cant_film>25
order by Artista asc;

select * from devolver_nombre_apellido;

select lower(Artista) as Artista,cant_film from devolver_nombre_apellido
where Artista like "a%"
having cant_film<33;

drop view devolver_nombre_apellido;

create view yo_puedo_siempre as
select lower(concat(actor.last_name," ",actor.first_name)) as Artista, film.title,film.replacement_cost from actor
inner join film_actor on actor.actor_id = film_actor.actor_id
inner join film on film.film_id=film_actor.film_id
where film.replacement_cost between 15 and 27
order by film.replacement_cost desc;

drop view yo_puedo_siempre;

select * from yo_puedo_siempre
where title like "b%";

select Artista,replacement_cost as Costo from yo_puedo_siempre
where Artista like "_%a";

















