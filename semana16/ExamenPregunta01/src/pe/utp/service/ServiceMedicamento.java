package pe.utp.service;

public class ServiceMedicamento {
    // Calcular el descuento del medicamento y la venta total
    public double ventaMedicamento(int cantidad, double precio) {
        double venta = cantidad * precio * 0.035;
        return venta;
    }

    // Reporte de Ventas
    public void reporteVenta(double venta) {
        System.out.println("*******************************************");
        System.out.println("Descuento: 3.5%");
        System.out.println("Venta Total del medicamento: " + venta);
    }
}
