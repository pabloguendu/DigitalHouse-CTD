import java.util.Date;

public abstract class Titulo {
    private Persona persona;
    private Integer cantMaterias;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean selloMinisterio;
    private Boolean selloInstituto;

    public Titulo(Persona persona, Integer cantMaterias, Date fechaInicio, Date fechaFin, Boolean selloMinisterio, Boolean selloInstituto) {
        this.persona = persona;
        this.cantMaterias = cantMaterias;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        selloMinisterio = selloMinisterio;
        selloInstituto = selloInstituto;
    }

    public void Boolean (){
        if (this.selloMinisterio && this.selloInstituto){
            System.out.println("Puede ejercer");
        }else{
            System.out.println("No puede ejercer");
        }
    }
}
