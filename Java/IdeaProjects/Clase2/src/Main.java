import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        Integer num = scanner.nextInt();
        System.out.println(esPrimo(num));
    }

    public static Boolean esPrimo(Integer numero) {
        Integer bandera = 0;
        for (Integer i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                bandera++;
            }
        }
        if (bandera > 2) {
            return false;
        } else {
            return true;
        }
    }

    public static Boolean esDivisible(Integer numeroA, Integer numeroB) {
        return numeroA % numeroB == 0;
    }
}
