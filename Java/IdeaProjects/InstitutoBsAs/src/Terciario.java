import java.util.Date;

public class Terciario extends Titulo{
    private String validacion;

    public Terciario(Persona persona, Integer cantMaterias, Date fechaInicio, Date fechaFin, Boolean selloMinisterio, Boolean selloInstituto, String validacion) {
        super(persona, cantMaterias, fechaInicio, fechaFin, selloMinisterio, selloInstituto);
        this.validacion = validacion;
    }

    public void esNacional(){
        if (this.validacion.equals("Nacional")){
            System.out.println("Es valido a nivel nacional");
        }else {
            System.out.println("No es valido a nivel nacional");
        }
    }
}
