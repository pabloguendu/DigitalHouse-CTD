import java.util.ArrayList;
import java.util.List;

public class Barco {
    private List<CargaBarco> cargaBarcoList;

    public Barco() {
        this.cargaBarcoList = new ArrayList<>();
    }

    public void agregarCargaContenedor(CargaBarco cargaBarco) {
        cargaBarcoList.add(cargaBarco);
    }
    public void mostrarCarga(){
        for (CargaBarco cargaBarco : cargaBarcoList) {
            System.out.println(cargaBarco);
        }

    }
}
