public class Cuenta {
    private Integer numeroDeCuenta;
    private Saldo saldo;

    public Cuenta(Integer numeroDeCuenta, Saldo saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public Integer getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    public Saldo getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }
}
