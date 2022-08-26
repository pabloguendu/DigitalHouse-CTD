
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Port{
    private List<Container> container;

    public Port() {

        this.container = new ArrayList<>();
    }

    public void addContainer(Container e) {
        this.container.add(e);
    }
    public List<Container> getContainer()throws Exception{
        if (container.isEmpty())throw new RuntimeException("No hay container");
        Collections.sort(container);
        return container;

    }
    public Integer countMaterialDanger(){
        Integer count=0;
        count = Math.toIntExact(container.stream()
                .filter(container -> container.getDangerousMaterials() && container.getCountryOfOrigin().equalsIgnoreCase("Desconocida"))
                .count());
        return count;
    }
}


