import java.util.ArrayList;
import java.util.List;

public class HabilidadCombinada extends Habilidad{
    private Integer comboMultiplicador;
    private List<Habilidad> habilidadList;

    public HabilidadCombinada(String nombre, String descripcion, Integer comboMultiplicador) {
        super(nombre, descripcion);
        this.comboMultiplicador = comboMultiplicador;
        this.habilidadList=new ArrayList<>();
    }
    public void agregarHabilidad(Habilidad habilidad){
        habilidadList.add(habilidad);
    }

    @Override
    public Double calcularPuntajeHabilidad() {
        Double puntajeHabilidad=0.0;
        for (Habilidad habilidad : habilidadList) {
            puntajeHabilidad+=habilidad.calcularPuntajeHabilidad();
        }
        return puntajeHabilidad*comboMultiplicador;

    }
}
