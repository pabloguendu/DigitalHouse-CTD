import java.util.ArrayList;
import java.util.List;

public class CargaContenedor extends CargaBarco{
    private List<CargaBarco> cargaBarcoList;
    private Double pesoContendor;

    public CargaContenedor(String nombre, String descripcion, Double pesoContendor) {
        super(nombre, descripcion);
        this.cargaBarcoList=new ArrayList<>();
        this.pesoContendor = pesoContendor;
    }
    public void agregarCargaContenedor(CargaBarco cargaBarco){
        cargaBarcoList.add(cargaBarco);
    }

    @Override
    public Double calcularPeso() {
        Double pesoCargaContenedorFinal=0.0;
        for (CargaBarco cargaBarco : cargaBarcoList) {
            pesoCargaContenedorFinal+=cargaBarco.calcularPeso();
        }
        return pesoCargaContenedorFinal+pesoContendor;

    }
}
