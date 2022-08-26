public abstract class Embarcacion {
    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private Integer anioFabricacion;
    private Double eslora;

    public Embarcacion(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }
    public void montoAlquiler(){
        if (anioFabricacion>2020) {
            precioBase += valorAdicional;
            valorAdicional=0.0;
        }
    }

    @Override
    public String toString() {
        return  "capitan=" + capitan.getNombre() +"\n"+
                "Valor a pagar=" + precioBase +"\n"+
                "anioFabricacion=" + anioFabricacion +"\n"+
                "eslora=" + eslora +"\n";
    }
}
