import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scannerNro1;
        Scanner scannerNro2;
        Scanner scannerSigno;
        scannerNro1 = new Scanner(System.in);
        System.out.println("ingrese un numero");
        Integer num1 = scannerNro1.nextInt();
        scannerNro2 = new Scanner(System.in);
        System.out.println("ingrese otro numero");
        Integer num2 = scannerNro2.nextInt();
        scannerSigno = new Scanner(System.in);
        System.out.println("ingrese un signo");
        String signo = scannerNro1.next();
        System.out.println(calculadora(signo,num1,num2));



    }
    public static Integer suma(Integer a, Integer b){
        return a+b;
    }
    public static Integer resta(Integer a, Integer b){
        return a-b;
    }
    public static Integer multiplicacion(Integer a, Integer b) {
        return a * b;
    }
    public static Double division(int a, int b){
        return (double) a / b;
    }
    public static Double calculadora(String signo, Integer a, Integer b){
        switch (signo){
            case "/":
                return division(a,b);
            case "*":
                return (double) multiplicacion(a,b);
            case "+":
                return (double) suma(a,b);
            case "-":
                return (double) resta(a,b);
            default:
                return (double) 0;
        }
    }



}