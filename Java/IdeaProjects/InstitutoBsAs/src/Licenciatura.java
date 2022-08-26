import java.util.Date;

public class Licenciatura extends Titulo implements Comparable{
    private String temaTesis;
    private Date fechaEntregaTesis;
    private Integer cantidadTrabajosInvestigacion;

    public Licenciatura(Persona persona, Integer cantMaterias, Date fechaInicio, Date fechaFin, Boolean selloMinisterio, Boolean selloInstituto, String temaTesis, Date fechaEntregaTesis, Integer cantidadTrabajosInvestigacion) {
        super(persona, cantMaterias, fechaInicio, fechaFin, selloMinisterio, selloInstituto);
        this.temaTesis = temaTesis;
        this.fechaEntregaTesis = fechaEntregaTesis;
        this.cantidadTrabajosInvestigacion = cantidadTrabajosInvestigacion;
    }

    @Override
    public int compareTo(Object o) {
        cantidadTrabajosInvestigacion
    }
}
