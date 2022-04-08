use emarket;

select count(*)
from clientes;

select count(Ciudad),Ciudad
from clientes
group by Ciudad;

select count(*)
from facturas;

select count(EnvioVia)
from facturas;

select count(FacturaID) as cant_facturas, ClienteID
from facturas
group by ClienteID
order by cant_facturas desc;

select count(FacturaID) as cant_facturas, ClienteID
from facturas
group by ClienteID
order by cant_facturas desc
limit 5;

select count(FacturaID) as contador_pais, PaisEnvio
from facturas
group by PaisEnvio
order by contador_pais;

select count(FacturaID) as mayor_venta, EmpleadoID
from facturas
group by EmpleadoID
order by mayor_venta desc
limit 1;

select count(facturadetalle.ProductoID) as producto_mas, Productos.ProductoNombre
from facturadetalle
inner join productos on facturadetalle.ProductoID=productos.ProductoID
group by facturadetalle.ProductoID
order by producto_mas desc
limit 1;

select sum(PrecioUnitario)
from facturadetalle
where ProductoID between 30 and 50;

select avg(PrecioUnitario),ProductoID
from facturadetalle
group by PrecioUnitario;

select max(PrecioUnitario) as maximo,ProductoID
from facturadetalle
group by PrecioUnitario
order by maximo desc
limit 1;

select *
from facturas;

select facturas.FacturaID, empleados.Apellido
from facturas
inner join empleados on empleados.EmpleadoID=facturas.EmpleadoID
where empleados.Apellido ='Buchanan';

select *
from facturas
inner join correos on correos.CorreoID=facturas.EnvioVia
where correos.Compania="Speedy Express";

select *
from facturas
inner join empleados on empleados.EmpleadoID=facturas.EmpleadoID;


select *
from facturas
inner join clientes on clientes.ClienteID=facturas.ClienteID
where clientes.Titulo = "Owner" and clientes.Pais="USA"; 






















