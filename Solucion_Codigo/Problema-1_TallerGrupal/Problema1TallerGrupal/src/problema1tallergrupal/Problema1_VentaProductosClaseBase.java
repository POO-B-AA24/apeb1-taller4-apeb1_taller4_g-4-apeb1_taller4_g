package problema1tallergrupal;

public class Problema1_VentaProductosClaseBase {

    private double precio;
    private int cantidad;
    private double precioFin;
    private double descuento;

    public Problema1_VentaProductosClaseBase(int cantidad,double precio) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void calcularDescuento() {

        if (this.precio >= 1000 && this.cantidad >= 10) {
            this.descuento=(this.cantidad*this.precio)*0.1;
        }else{
            this.descuento=(this.cantidad*this.precio)*0.05;
        }
    }
    
    public void calcularPrecioFinal(){
        this.precioFin=(this.cantidad*this.precio)-this.descuento;
    }

    @Override
    public String toString() {
        return "Problema1_VentaProductosClaseBase{" + "precio=" + precio + ", cantidad=" + cantidad + ", descuento=" + descuento + ", precioFin=" + precioFin + '}';
    }
    
    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
