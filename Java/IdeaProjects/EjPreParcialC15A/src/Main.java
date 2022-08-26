public class Main {
    public static void main(String[] args) {
        Capitan capitan1=new Capitan("Pablo","Guendulain","soyFeliz");
        Velero velero1=new Velero(capitan1,500.00,200.00,2021,1700.00,5);
        Yate yate1=new Yate(capitan1,500.00,544.00,2021,1900.00,10);
        Yate yate2=new Yate(capitan1,500.00,800.00,2020,1900.00,25);
        yate2.montoAlquiler();
        System.out.println("------------------------------------------");
        System.out.println("Usted consulta por Velero");
        velero1.montoAlquiler();
        System.out.println(velero1.toString());
        velero1.esGrande();
        System.out.println("------------------------------------------");
        System.out.println("Usted consulta por yate1");
        yate1.montoAlquiler();
        System.out.println(yate1.toString());
        System.out.println("------------------------------------------");
        System.out.println("Usted consulta por yate2");
        yate1.montoAlquiler();
        System.out.println(yate2.toString());
        System.out.println("Comparacion de lujos de yate segun sus camarotes");
            if (yate1.compareTo(yate2)==1) {
                System.out.println("El primer Yate es más lujoso");
            } else if (yate1.compareTo(yate2)==-1) {
                System.out.println("El segundo Yate es más lujoso");
            } else if (yate1.compareTo(yate2)==0) {
                System.out.println("Sus lujos son iguales");
            }

    }
}