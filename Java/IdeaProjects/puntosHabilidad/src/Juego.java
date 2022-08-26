import java.util.ArrayList;
import java.util.List;

public class Juego {
    private List<Habilidad> habilidadList;

    public Juego() {
        this.habilidadList = new ArrayList<>();
    }

    public void agregarHabilidad(Habilidad habilidad){
        habilidadList.add(habilidad);
    }

    public void mostrarHabilidad(){
        for (Habilidad habilidad : habilidadList) {
            System.out.println(habilidad);
        }

    }
}
