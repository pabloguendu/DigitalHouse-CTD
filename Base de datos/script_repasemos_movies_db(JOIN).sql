USE movies_db;
SELECT series.title,genres.name
from series
inner join genres on series.genre_id=genres.id;

select episodes.title, actors.first_name,actors.last_name
from episodes
inner join actor_episode on  actor_episode.episode_id=episodes.id
inner join actors on actor_episode.actor_id=actors.id;

select actors.first_name, actors.last_name,movies.title
from actors
inner join movies on actors.favorite_movie_id= movies.id
where movies.title like "La Guerra de las galaxias%";

select count(*),genres.name
from movies
inner join genres on movies.genre_id=genres.id
group by genres.name



