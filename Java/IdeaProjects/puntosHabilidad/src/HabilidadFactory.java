public class HabilidadFactory {
    private static HabilidadFactory instance;
    public  static final String CODIGO_HABILIDAD_SALTAR="SALTAR";
    public  static final String CODIGO_HABILIDAD_DISPARAR="DISPARAR";
    public  static final String CODIGO_HABILIDAD_DISPARO_AL_SALTAR="DISPARO_AL_SALTAR";

    public HabilidadFactory(){}

    public static HabilidadFactory getInstance() {
        if(instance == null){
            instance = new HabilidadFactory();
        }
        return instance;
    }

    public Habilidad crearHabilidad(String codigoHabilidad){
        switch (codigoHabilidad){
            case CODIGO_HABILIDAD_SALTAR:
                return new HabilidadSimple("SALTAR","Hacemos un salto",7.5);
            case CODIGO_HABILIDAD_DISPARAR:
                return new HabilidadSimple("DISPARAR","Disparamos",10.0);
            case CODIGO_HABILIDAD_DISPARO_AL_SALTAR:
                HabilidadCombinada habilidadCombinada=new HabilidadCombinada("DISPARO_AL_SALTAR","Saltamos disparando pium pium",3);
                habilidadCombinada.agregarHabilidad(this.crearHabilidad(CODIGO_HABILIDAD_SALTAR));
                habilidadCombinada.agregarHabilidad(this.crearHabilidad(CODIGO_HABILIDAD_DISPARAR));
                return habilidadCombinada;
        }
        return null;
    }
}
