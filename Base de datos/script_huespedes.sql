use la_aprobacion;

select id as "Numero de huesped",apellido,nombre
from huesped
where nombre like "S%";

select legajo
from empleado
where domicilio="Av. Rosalind Franklin 600";

select max(importe)
from reserva;

SELECT * FROM reserva
WHERE id IN (15,19,21,35);

select habitacion_numero as "Numero de habitacion",sum(importe) as "Importe total"
from checkin
group by habitacion_numero
having habitacion_numero=40;

select *
from empleado
where fecha_nacimiento >= "1986-7-11" and fecha_nacimiento <= "1989-3-9" and sector_id<>3
order by fecha_nacimiento;

select *
from reserva
where importe between 10499.50 and 12000.00
order by importe desc;

SELECT importe, COUNT(importe) FROM checkin
GROUP BY importe
ORDER BY importe
LIMIT 1
OFFSET 5;

select id, fecha_entrada, importe, max(importe)
from checkin;

select id, importe, servicio_extra_id, min(importe)
from reserva
group by importe
limit 10;

select fecha
from reserva
where fecha >= "2021-07-14" and fecha <= "2021-08-15"
order by fecha desc;

select *
from checkin
where  importe>="34125.00" and fecha_salida < "2020-06-26";














