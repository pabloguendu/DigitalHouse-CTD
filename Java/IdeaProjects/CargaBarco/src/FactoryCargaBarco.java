public class FactoryCargaBarco {
    private static FactoryCargaBarco instance;

    public FactoryCargaBarco(){}

    public static FactoryCargaBarco getInstance() {
        if(instance == null){
            instance = new FactoryCargaBarco();
        }
        return instance;
    }

    public CargaBarco crearCargaBarco(Integer codigo){
        switch (codigo){
            case 1:
                return new CargaSimple("TV 32’ LCD","holis",3.0,false);
            case 2:
                return new CargaSimple("Caja Medicamentos","para cuidados",2.0,true);
            case 3:
                CargaContenedor cargaContenedor=new CargaContenedor("Contiene 2 cajas simples","Acá llevamos 2 cosas",100.0);
                cargaContenedor.agregarCargaContenedor(this.crearCargaBarco(1));
                cargaContenedor.agregarCargaContenedor(this.crearCargaBarco(2));
                return cargaContenedor;
        }
        return null;
    }
}
