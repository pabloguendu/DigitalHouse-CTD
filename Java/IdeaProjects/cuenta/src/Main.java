public class Main {
    public static void main(String[] args){
        Cuenta cliente1=new Cuenta(1212,new Saldo(15.00,"Dolares"));
        System.out.println("El numero de cuenta: "+cliente1.getNumeroDeCuenta());
        cliente1.getSaldo().depositar(500.00);
        System.out.println("Su saldo es de: "+cliente1.getSaldo().getSaldo());
        cliente1.getSaldo().retirar(510.00);
        System.out.println("Con su retiro su saldo es de: "+cliente1.getSaldo().getSaldo());


    }
}