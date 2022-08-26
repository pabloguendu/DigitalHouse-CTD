public class Articulo {
    private String descripcion;
    private Double precioVenta;
    private Integer stock;

    public Articulo(String descripcion, Double precioVenta, Integer stock) {
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }
    public Boolean hayStock(){
        return stock>0;
    }

    public Double consultarPrecio(){
        return precioVenta;
    }
}
