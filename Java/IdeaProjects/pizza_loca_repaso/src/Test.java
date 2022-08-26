public class Test {
    public static void main(String[] args) {

        PizzaLoca pizzaLoca= new PizzaLoca();
        PizzaFactory pizzaFactory = PizzaFactory.getInstance();
        pizzaLoca.agregarPizza(pizzaFactory.crearPizza(PizzaFactory.CODIGO_MUZZARELA));
        pizzaLoca.agregarPizza(pizzaFactory.crearPizza(PizzaFactory.CODIGO_ESPECIAL));
        pizzaLoca.agregarPizza(pizzaFactory.crearPizza(PizzaFactory.CODIGO_ANANA));
        pizzaLoca.agregarPizza(pizzaFactory.crearPizza(PizzaFactory.CODIGO_COMBINADA));
        pizzaLoca.mostrarPizza();

    }
}