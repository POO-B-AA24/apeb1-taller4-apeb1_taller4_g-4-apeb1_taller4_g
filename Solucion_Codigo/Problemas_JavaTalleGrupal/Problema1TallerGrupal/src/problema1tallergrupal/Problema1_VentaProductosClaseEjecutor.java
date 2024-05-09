package problema1tallergrupal;

import java.util.Scanner;

public class Problema1_VentaProductosClaseEjecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la CANTIDAD de PRODUCTOS: ");
        int cantidad = entrada.nextInt();
        System.out.println("Ingrese el PRECIO por UNIDAD del PRODUCTO: ");
        double precio = entrada.nextDouble();

        Problema1_VentaProductosClaseBase venta = new Problema1_VentaProductosClaseBase(cantidad, precio);
        venta.calcularDescuento();
        venta.calcularPrecioFinal();
        System.out.println(venta);
    }

}
