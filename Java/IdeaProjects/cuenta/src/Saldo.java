public class Saldo {
    private Double saldo;
    private String moneda;

    public Saldo(Double saldo, String moneda) {
        this.saldo = saldo;
        this.moneda = moneda;
    }

    public void depositar(Double cantDinero){
        saldo+=cantDinero;
    }
    public void retirar(Double cantDinero){
        if (cantDinero>=saldo){
            System.out.println("Usted no posee saldo suficiente");
        }else {
            saldo -= cantDinero;
        }
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getMoneda() {
        return moneda;
    }
}
