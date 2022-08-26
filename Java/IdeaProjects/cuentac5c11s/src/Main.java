public class Main {
    public static void main(String[] args) {
        Cliente cliente1=new Cliente(12,"Pablo","366666","123123123");
        Cuenta cuenta1=new CajaAhorro(cliente1,12.00,60.00);
        System.out.println(cuenta1.getSaldo());
        cuenta1.depositar(100.00);
        cuenta1.extraer(10.00);
        System.out.println(cuenta1.getSaldo());

    }
}