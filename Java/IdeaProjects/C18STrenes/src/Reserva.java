public class Reserva {
    private Integer codigo;
    private Recorrido recorrido;
    private Integer cantPersonas;
    private Double precioBoleto;

    public Reserva(Integer codigo, Recorrido recorrido, Integer cantPersonas) {
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.cantPersonas = cantPersonas;
        this.precioBoleto=50.00;
    }

}
