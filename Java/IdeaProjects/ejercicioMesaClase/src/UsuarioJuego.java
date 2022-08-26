public class UsuarioJuego {
    private String nombre;
    private String clave;
    private Double puntaje;
    private Integer nivel;

    private static final int maxLevel  = 110;

    public UsuarioJuego(String nombre, String clave) {//constructor
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje=0.0;
        this.nivel=0;
    }
    public void aumentarPuntaje(){
        System.out.println(puntaje);
        puntaje++;
        System.out.println(puntaje);
    }
    public void aumentarNivel(){
        if(nivel<maxLevel) {
            nivel++;
        }
    }
    public void bonus(int valor){
        puntaje+=valor;
        System.out.println(puntaje);
    }

    public Double getPuntaje() {
        return puntaje;
    }
}



