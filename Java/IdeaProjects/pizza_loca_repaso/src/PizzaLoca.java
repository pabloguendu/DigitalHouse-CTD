import java.util.ArrayList;
import java.util.List;

public class PizzaLoca {
    private List<Pizza> pizzaList;

    public PizzaLoca() {
        this.pizzaList = new ArrayList<>();
    }

    public void agregarPizza(Pizza pizza){
        pizzaList.add(pizza);
    }
    public void mostrarPizza(){
        for (Pizza pizza : pizzaList) {
            System.out.println(pizza);
        }

    }
}
