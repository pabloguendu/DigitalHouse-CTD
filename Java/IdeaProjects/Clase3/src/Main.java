import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre del jugador 1");
        String jugador1 = scanner.nextLine();
        System.out.println("Ingrese nombre del jugador 2");
        String jugador2 = scanner.nextLine();

    }
    public static String QuienGana (String jugador1,String jugador2){
        Integer totalPuntosJug1=0;
        Integer totalPuntosJug2=0;
        while (!jugador1.equals("*")){
            Scanner scanner;
            scanner=new Scanner(System.in);
            System.out.println("Jugador 1: Elegí Piedra,Papel o Tijera");
            String jugadasJug1 = scanner.nextLine().toUpperCase();
            System.out.println("Jugador 2: Elegí Piedra,Papel o Tijera");
            String jugadasJug2 = scanner.nextLine().toUpperCase();
            if (jugadasJug1.equals("TIJERA") && jugadasJug2.equals("PAPEL")){
                totalPuntosJug1++;
            } else if (jugadasJug1.equals("TIJERA")) && {

            }


        }
    }


}