import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        Integer num = scanner.nextInt();
        mostrarNumerosPrimos(num);

    }
    public static void mostrarNumerosPrimos(Integer a){
        Integer i;
        Integer cantidadNro=0;
        for (i=0;cantidadNro<a;i++ ){
            if (i%2!=0){
                cantidadNro++;
                System.out.println(i);
            }
        }
    }

}