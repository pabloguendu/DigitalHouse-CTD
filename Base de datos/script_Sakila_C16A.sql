use sakila;

select first_name as Nombre, last_name as Apellido from actor
limit 5;

select first_name as Nombre, last_name as Apellido, email as Correo_Electronico from customer
where active = 0;

select * from film;

select title as titulo, release_year as año, description as descripcion from film
where rental_duration>5
order by rental_duration asc;

select * from rental
where rental_date between '2005-05-01 00:00:00' and '2005-05-31 23:59:59';

select count(rental_id) as cantidad from rental;

select sum(amount) as TOTAL, count(payment_id) as Cantidad, avg(amount) as Importe_Promedio from payment;

select sum(amount),customer_id from payment
group by customer_id
order by sum(amount) desc;

select * from payment;

select customer_id, count(customer_id),sum(amount) from payment
group by customer_id
having sum(amount)>150;

select rental.rental_date,count(rental.rental_id),sum(payment.amount) from payment
inner join rental on rental.rental_id=payment.rental_id;

select * from rental;

SELECT inventory.inventory_id, count(rental_id) from rental
INNER JOIN inventory ON rental.inventory_id = inventory.inventory_id
group by inventory.inventory_id
having count(rental_id) = 5
order by count(rental.rental_id) desc
limit 5;











