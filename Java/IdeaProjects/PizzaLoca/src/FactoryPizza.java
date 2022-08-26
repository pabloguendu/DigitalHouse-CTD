public class FactoryPizza {
    private static FactoryPizza instance;
    private static final String PIZZA_MUZZARELLA="Muzzarela";
    private static final String PIZZA_ESPECIAL="Especial";
    private static final String PIZZA_ANANA="Anana";
    private static final String PIZZA_COMBINADA="Combinada";

    private FactoryPizza(){

    };
    public static FactoryPizza getInstance() {
        if(instance == null){
            instance = new FactoryPizza();
        }
        return instance;
    }
    public Pizza crearPizza(String tipoPizza) {
        switch (tipoPizza){
            case PIZZA_MUZZARELLA:
                return new PizzaMuzzarela();
            case PIZZA_ESPECIAL:
                return new PizzaEspecial();
            case PIZZA_ANANA:
                return new PizzaAnana();
            case PIZZA_COMBINADA:
                return new PizzaCombinada();
        }
        return null;
    }
}
