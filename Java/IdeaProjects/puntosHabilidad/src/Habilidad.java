public abstract class Habilidad {
    private String nombre;
    private String descripcion;

    public Habilidad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public abstract Double calcularPuntajeHabilidad();

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "El nombre es: " +nombre+ " Puntaje: "+calcularPuntajeHabilidad();
    }
}
