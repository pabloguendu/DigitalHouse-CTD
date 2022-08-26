public abstract class CargaBarco {
    private String nombre;
    private String descripcion;

    public CargaBarco(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPeso();

    @Override
    public String toString() {
        return "Nombre " + nombre + "Peso total: "+calcularPeso();
    }
}
