public class Main {
    public static void main(String[] args){
        UsuarioJuego usuario1 = new UsuarioJuego("Mari","1234");
        usuario1.aumentarPuntaje();
        usuario1.aumentarPuntaje();
        usuario1.bonus(500);
    }

}