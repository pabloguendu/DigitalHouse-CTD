use musimundos;

select pais,count(*)
from clientes
where pais = "Brazil";

select id_genero, count(*)
from canciones
where id_genero=6;

SELECT SUM(total)
FROM FACTURAS;

select avg(milisegundos)
from canciones
where id_album = 4;

select min(bytes)
from canciones;

select id_cliente, sum(total)
from facturas
where id_cliente=6;













