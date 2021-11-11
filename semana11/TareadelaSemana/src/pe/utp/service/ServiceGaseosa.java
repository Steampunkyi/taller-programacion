package pe.utp.service;

public class ServiceGaseosa {
    // Evaluar la cantidad de gaseosa que se puede comprar, productos comprados y
    // monto de pago
    public double ventaGaseosa(String tipo, int cantidad, double ventas) {
        if (cantidad >= 6) {
            if (tipo.equals("A")) {
                ventas = ventas - ventas * 0.12;
            } else if (tipo.equals("B")) {
                ventas = ventas - ventas * 0.8;
            } else {
                ventas = ventas - ventas * 0.045;
            }
        } else {
            ventas = ventas * 1;
        }
        double ventaTotal = ventas * cantidad;
        return ventaTotal;
    }

    // Reporte de Ventas
    public void reporteVentas(String tipo, int cantidad, double ventaTotal) {
        System.out.println("***********************************");
        System.out.println("Tipo de producto: " + tipo);
        System.out.println("Cantidad comprada: " + cantidad);
        System.out.println("Monto de pago: " + ventaTotal);
    }

    // Mostrar monto acumulado por todas las ventas
    public void mostrarAcumulado(double acum) {
        System.out.println("*********************************");
        System.out.println("Monto acumulado: " + acum);
    }
}
