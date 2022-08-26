
import java.lang.*;

public class Yate extends Embarcacion implements Comparable {
    private Integer cantCamarotes;

    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer cantCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantCamarotes = cantCamarotes;
    }

    public Integer getCantCamarotes() {
        return cantCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        Yate a = (Yate) o;
        Integer respuesta=0;
        if (this.cantCamarotes>a.getCantCamarotes()){
            respuesta=1;
        }else if (this.cantCamarotes<a.getCantCamarotes()) {
            respuesta=-1;
        }else{
            respuesta=0;
        }
        return respuesta;
    }
}
