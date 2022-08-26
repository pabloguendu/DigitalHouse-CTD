import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{
    private List<Pizza> pizzaList;

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        pizzaList=new ArrayList<>();
    }
    public void agregarPizza(Pizza pizza){
        pizzaList.add(pizza);
    }

    @Override
    public Double calcularPrecio() {
        Double precioPizzaCombinada=0.0;
        for (Pizza pizza : pizzaList) {
            precioPizzaCombinada+=pizza.calcularPrecio();

        }
        return precioPizzaCombinada/pizzaList.size();

    }
}
