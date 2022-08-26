public class Test {
    public static void main(String[] args) {
        Barco barco=new Barco();
        FactoryCargaBarco factoryCargaBarco= FactoryCargaBarco.getInstance();
        barco.agregarCargaContenedor(factoryCargaBarco.crearCargaBarco(1));
        barco.agregarCargaContenedor(factoryCargaBarco.crearCargaBarco(2));
        barco.agregarCargaContenedor(factoryCargaBarco.crearCargaBarco(3));
        barco.mostrarCarga();

    }
}