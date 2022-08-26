public class Velero  extends Embarcacion{
    private Integer mastiles;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer mastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.mastiles = mastiles;
    }

    public void esGrande(){
        if(mastiles>4){
            System.out.println("Es grande");
        }
    }

}
