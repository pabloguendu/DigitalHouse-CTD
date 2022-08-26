public class CuentaCorriente extends Cuenta {
    private Double montoAutorizado;

    public CuentaCorriente(Cliente asociado, Double saldo, Double montoAutorizado) {
        super(asociado, saldo);
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void extraer(Double importe) {
        System.out.println("No anda");
    }
}
