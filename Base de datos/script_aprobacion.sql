use la_aprobacion;
#1
select servicio_basico.nombre  from habitacion_x_servicio_basico
inner join servicio_basico on servicio_basico.id = habitacion_x_servicio_basico.servicio_basico_id
where habitacion_numero=25;
#Devuelve 4 filas
#2
SELECT servicio_basico.nombre, count(habitacion.numero)  from habitacion
inner join habitacion_x_servicio_basico on habitacion.numero = habitacion_x_servicio_basico.habitacion_numero
inner join servicio_basico on habitacion_x_servicio_basico.servicio_basico_id = servicio_basico.id
group by servicio_basico.nombre;
#Devuelve 10 filas
#3
select huesped.id, concat(huesped.apellido," ",huesped.nombre) as "Cliente", count(checkin.id)
from huesped
inner join checkin on huesped.id = checkin.huesped_id
group by huesped.id
having count(checkin.id) >= 3;
#Devuelve 23 filas
#4
select huesped.id, upper(concat(huesped.apellido, " ", huesped.nombre)) as "huésped sin check-in" from huesped
left join checkin on huesped.id = checkin.huesped_id
where checkin.id is null;
#Devuelve 16 filas
#5
select huesped.id, huesped.apellido, huesped.nombre, habitacion.numero, clase.nombre from huesped
inner join checkin on  huesped.id = checkin.huesped_id
inner join habitacion on checkin.habitacion_numero = habitacion.numero
inner join clase on clase.id = habitacion.clase_id 
where clase.nombre="Classic" 
group by huesped.id;
#Devuelve 33 filas
#6
select reserva.huesped_id, huesped.apellido, huesped.nombre, servicio_extra.nombre from reserva
inner join huesped on huesped.id = reserva.huesped_id
inner join servicio_extra on servicio_extra.id = reserva.servicio_extra_id
where huesped.apellido like "_u%";
#Devuelve 10 filas
#7
select pais.nombre, count(huesped.id) from huesped
inner join pais on huesped.pais_id = pais.id
group by pais.nombre;
#Devuelve 4 filas
#8
select huesped.apellido,sum(reserva.importe) as Importe, count(reserva.id) as "Cantidad Reservas" from reserva
inner join huesped on huesped.id = reserva.huesped_id
where fecha like "%-03-%"
group by huesped.apellido;
#Devuelve 9 filas
#9
select habitacion.numero, decoracion.nombre as "decoracion", clase.nombre as "clase", MONTHNAME(checkin.fecha_entrada) as "mes fecha entrada", sum(checkin.importe) as "importe total" from checkin
inner join habitacion on checkin.habitacion_numero = habitacion.numero
inner join decoracion on habitacion.decoracion_id = decoracion.id
inner join clase on habitacion.clase_id = clase.id
where habitacion.numero = 22
group by MONTHNAME(checkin.fecha_entrada);
#Devuelve 3 filas
#10
select pais.nombre, checkin.habitacion_numero, sum(importe) from checkin
inner join huesped on huesped.id = checkin.huesped_id
inner join pais on pais.id = huesped.pais_id
inner join habitacion on habitacion.numero = checkin.habitacion_numero
where checkin.habitacion_numero in (5, 10, 22)
group by pais.nombre , checkin.habitacion_numero;
#Devuelve 8 filas
#11
select forma_pago.nombre, sum(importe) from reserva
inner join forma_pago on forma_pago.id= reserva.forma_pago_id
group by forma_pago.nombre;
#Devuelve 4 filas
#12
select empleado.legajo,empleado.apellido,concat(left(empleado.nombre,1),"."),pais.nombre,sector.nombre from empleado
inner join pais on pais.id = empleado.pais_id
inner join sector on sector.id = empleado.sector_id
where sector.nombre= "administración" and pais.nombre="Argentina";
#Devuelve 3 filas
#13
select habitacion_x_servicio_basico.habitacion_numero,clase.nombre,servicio_basico.nombre from habitacion
inner join habitacion_x_servicio_basico on habitacion_x_servicio_basico.habitacion_numero = habitacion.numero
inner join servicio_basico on servicio_basico.id=habitacion_x_servicio_basico.servicio_basico_id
inner join clase on clase.id = habitacion.clase_id
where habitacion_x_servicio_basico.habitacion_numero between 20 and 24
order by habitacion_x_servicio_basico.habitacion_numero and servicio_basico.nombre desc;
#Devuelve 28 filas
#14
select * from decoracion
left join habitacion on habitacion.decoracion_id=decoracion.id
where habitacion.decoracion_id is null OR habitacion.decoracion_id= "";
#Devuelve 2 filas
#15
create view empleadoConEdad as 
select *, YEAR(CURRENT_TIMESTAMP) - YEAR(fecha_nacimiento)
   - (RIGHT(CURRENT_TIMESTAMP, 5) < RIGHT(fecha_nacimiento, 5)) as edad from empleado;

select apellido, nombre, edad, 
	case 
    when edad  <= 35 then 'Junior'
    when edad  > 35 and edad  <= 50 then 'Semi-senior'
    else 'senior' end as categoria
    from empleadoConEdad
    order by edad;
#Devuelve 25 filas
#16
select forma_pago.nombre, count(checkin.importe), format(avg(checkin.importe),2) from checkin
inner join forma_pago on forma_pago.id = checkin.forma_pago_id
group by forma_pago.nombre;
#Devuelve 4 filas
#17
select apellido, empleadoConEdad.nombre , edad, pais.nombre from empleadoConEdad
inner join pais on pais.id = empleadoConEdad.pais_id
where pais.nombre = 'Argentina';
#Devuelve 17 filas
#18
select huesped.nombre, huesped.apellido, pais.nombre, sum(importe)from checkin 
inner join huesped on huesped.id=checkin.huesped_id
inner join pais on pais.id=huesped.pais_id
where huesped.nombre = 'Joel' and huesped.apellido = 'Mercado'
group by huesped_id;
#Devuelve 1 filas
#19
select servicio_extra.nombre, forma_pago.nombre, count(*) as cantidad, sum(reserva.importe) as importe from reserva
inner join servicio_extra on servicio_extra.id= reserva.servicio_extra_id
inner join forma_pago on forma_pago.id= reserva.forma_pago_id  
group by servicio_extra.nombre, forma_pago.nombre;
#Devuelve 16 filas
#20
select huesped.id as numeroCliente, servicio_extra.nombre, forma_pago.nombre, sum(importe) from huesped
inner join reserva on reserva.huesped_id = huesped.id 
inner join servicio_extra on servicio_extra.id = reserva.servicio_extra_id
inner join forma_pago on forma_pago.id = reserva.forma_pago_id
where servicio_extra.nombre="Sauna"
group by huesped.id;
#Devuelve 22 filas





 





















