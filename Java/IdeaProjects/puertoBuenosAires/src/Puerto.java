import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private List<Contenedor> contendedores;

    public Puerto(List<Contenedor> contendedores) {
        this.contendedores = new ArrayList<>();
    }

    public void agregarContenedores(Contenedor c){
        this.contendedores.add(c);
    }
}




