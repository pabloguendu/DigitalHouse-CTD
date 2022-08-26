public abstract class Pizza {
    private String nombre;
    private String descripcion;
    private Boolean esGrande;
    private Double precio;

    public Pizza(String nombre, String descripcion, Boolean esGrande, Double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.esGrande = esGrande;
        if(esGrande) {
            this.precio = precio*2;
        }else{
            this.precio=precio;
        }
    }

    public Double getPrecio() {
        return precio;
    }
}
