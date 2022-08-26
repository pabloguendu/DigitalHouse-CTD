public abstract class Cuenta {
    private Cliente asociado;
    private Double saldo;


    public Cuenta(Cliente asociado,Double saldo) {
        this.asociado = asociado;
        this.saldo=saldo;
    }
    public void depositar(Double importe) {
        this.saldo=this.saldo+importe;
    }

    public abstract void extraer(Double importe);

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
