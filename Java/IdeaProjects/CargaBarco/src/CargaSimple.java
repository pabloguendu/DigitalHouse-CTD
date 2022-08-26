public class CargaSimple extends CargaBarco {
    private Double pesoCargaSimple;
    private Boolean conRefrigeracion;

    public CargaSimple(String nombre, String descripcion, Double pesoCargaSimple, Boolean conRefrigeracion) {
        super(nombre, descripcion);
        this.pesoCargaSimple = pesoCargaSimple;
        this.conRefrigeracion = conRefrigeracion;
    }

    @Override
    public Double calcularPeso() {
        Double pesoCargaSimpleFinal=0.0;
        if (conRefrigeracion){
            pesoCargaSimpleFinal+=pesoCargaSimple+(pesoCargaSimple*0.10);
        }else{
            pesoCargaSimpleFinal=pesoCargaSimple;
        }
        return pesoCargaSimpleFinal;
    }
}
