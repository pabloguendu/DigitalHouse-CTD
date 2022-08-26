public class PizzaFactory {
    private static PizzaFactory instance;
    public static final String CODIGO_MUZZARELA = "MUZZARELLA";
    public static final String CODIGO_ESPECIAL = "ESPECIAL";
    public static final String CODIGO_ANANA = "ANANA";
    public static final String CODIGO_COMBINADA = "COMBINADA";

    public PizzaFactory(){}

    public static PizzaFactory getInstance() {
        if(instance == null){
            instance = new PizzaFactory();
        }
        return instance;
    }

    public Pizza crearPizza(String codigo){
        switch (codigo){
            case CODIGO_MUZZARELA:
                return new PizzaSimple("Pizza Muzzarela","Riquisima",700.0,false);
            case CODIGO_ESPECIAL:
                return new PizzaSimple("Pizza Especial","Igual que muzza pero con pimimientos",850.0,false);
            case CODIGO_ANANA:
                return new PizzaSimple("Pizza Anana","Mezcla de salado y dulce",950.0,false);
            case CODIGO_COMBINADA:
                PizzaCombinada pizzaCombinada=new PizzaCombinada("Pizza Combinada Loca","Mitad Especial y Mitad Anana");
                pizzaCombinada.agregarPizza(this.crearPizza(CODIGO_ESPECIAL));
                pizzaCombinada.agregarPizza(this.crearPizza(CODIGO_ANANA));
                return pizzaCombinada;
        }
        return null;


    }
}
