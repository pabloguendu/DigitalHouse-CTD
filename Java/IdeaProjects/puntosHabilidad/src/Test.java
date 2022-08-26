public class Test {
    public static void main(String[] args) {
        Juego juego=new Juego();
        HabilidadFactory habilidadFactory= HabilidadFactory.getInstance();
        juego.agregarHabilidad(habilidadFactory.crearHabilidad(HabilidadFactory.CODIGO_HABILIDAD_SALTAR));
        juego.agregarHabilidad(habilidadFactory.crearHabilidad(HabilidadFactory.CODIGO_HABILIDAD_DISPARAR));;
        juego.agregarHabilidad(habilidadFactory.crearHabilidad(HabilidadFactory.CODIGO_HABILIDAD_DISPARO_AL_SALTAR));
        juego.mostrarHabilidad();
    }
}