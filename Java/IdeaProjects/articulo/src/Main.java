public class Main {
    public static void main(String[] args){
        Articulo articulo1=new Articulo("Desodorante",500.0,5);
        if (articulo1.hayStock()){
            System.out.println("Hay stock disponible");
        }
        System.out.println("El precio de venta es de:"+articulo1.consultarPrecio());

    }

}