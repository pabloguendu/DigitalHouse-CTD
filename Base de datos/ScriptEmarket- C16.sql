use emarket;

select facturas.FacturaID, facturas.fechaFactura, correos.Compania,clientes.Compania,categorias.CategoriaNombre,productos.ProductoNombre,productos.PrecioUnitario,productos.CantidadPorUnidad from facturas
inner join correos on correos.CorreoID=facturas.EnvioVia
inner join clientes on clientes.ClienteID=facturas.ClienteID
inner join facturadetalle on facturadetalle.FacturaID=facturas.FacturaID
inner join productos on productos.ProductoID= facturadetalle.ProductoID
inner join categorias on categorias.CategoriaID=productos.CategoriaID;

select clientes.Contacto,facturas.facturaID from clientes
inner join facturas on facturas.ClienteID = clientes.ClienteID
where facturas.facturaID is null;

select productos.ProductoNombre,categorias.CategoriaNombre,proveedores.Contacto from productos
left join categorias on categorias.CategoriaID=productos.ProductoID
inner join proveedores on proveedores.ProveedorID=productos.ProductoID;

select avg(productos.PrecioUnitario), categorias.CategoriaNombre from categorias
inner join productos on productos.ProductoID=categorias.CategoriaID
group by categorias.CategoriaNombre;

SELECT clientes.ClienteID,max(FechaFactura) as ultima_factura FROM clientes
LEFT JOIN facturas ON facturas.ClienteID = clientes.ClienteID
GROUP BY clientes.ClienteID;

select correos.Compania, count(facturas.FacturaID) from facturas
right join correos on correos.CorreoID=facturas.EnvioVia
group by correos.Compania;









