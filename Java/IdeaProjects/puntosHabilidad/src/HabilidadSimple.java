public class HabilidadSimple extends Habilidad{
    private Double puntaje;

    public HabilidadSimple(String nombre, String descripcion, Double puntaje) {
        super(nombre, descripcion);
        this.puntaje = puntaje;
    }

    @Override
    public Double calcularPuntajeHabilidad() {
        Double puntajeHabilidadSimple=0.0;
        if (getNombre().equals(HabilidadFactory.CODIGO_HABILIDAD_DISPARAR)) {
            puntajeHabilidadSimple = puntaje + (puntaje * 0.10);
        }else{
            puntajeHabilidadSimple=puntaje;
        }
        return puntajeHabilidadSimple;

    }
}
