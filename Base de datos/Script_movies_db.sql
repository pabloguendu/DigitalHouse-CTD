use movies_db;

select count(*)
from movies;

select count(awards)
from movies
where (awards>=3 and awards<=7) and rating>=7;

select genre_id as Genero,count(id) as Cantidaddepelis, sum(awards)
from movies
group by genre_id
having sum(awards)>5;






