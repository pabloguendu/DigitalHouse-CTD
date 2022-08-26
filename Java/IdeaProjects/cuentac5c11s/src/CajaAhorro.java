public class CajaAhorro extends Cuenta {
    private Double tasaInteres;


    public CajaAhorro(Cliente asociado,Double tasaInteres,Double saldo) {
        super(asociado,saldo);
        this.tasaInteres = tasaInteres;
    }
    public double informarSaldo(){
        return this.getSaldo();

    }

    public void cobrarInteres(){

    }

    @Override
    public void extraer(Double importe) {
        if (importe < getSaldo()){
            this.setSaldo(this.getSaldo()-importe);
        }else{
            System.out.println("No se puede realizar la operacion porque no posee saldo suficiente");
        }
    }


}
