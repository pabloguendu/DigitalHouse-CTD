import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Port puerto=new Port();
        Container c1=new Container(1,"Argentina",true);
        Container c2=new Container(7,"Argentina",false);
        Container c3=new Container(14,"Desconocida",true);
        Container c4=new Container(2,"Argentina",false);
        Container c5=new Container(3,"Argentina",true);
        puerto.addContainer(c1);
        puerto.addContainer(c2);
        puerto.addContainer(c3);
        puerto.addContainer(c4);
        puerto.addContainer(c5);
        try {
            System.out.println(puerto.getContainer());
            System.out.println(puerto.countMaterialDanger());
        }catch (Exception e){
            System.err.println(e);
        }




    }
}