package pe.utp.service;

public class ServiceMueble {
    // Evaluar el descuento de muebles
    public double descuentoMueble(double dato0, double dato1) {
        double dato2 = 0;
        if (dato0 >= 6) {
            dato2 = dato0 * dato1 * 0.10;
        } else {
            dato2 = 0;
        }
        return dato2;
    }

    // Evaluar la venta de muebles
    public double ventaMueble(double dato0, double dato1, double dato2) {
        double dato3;
        dato3 = (dato0 * dato1) - dato2;
        return dato3;
    }

    // Reporte de unica venta
    public void reporteUnaVenta(String cliente, String producto, double dato0, double dato2, double dato3) {
        System.out.println("***********************************");
        System.out.println("Cliente: " + cliente);
        System.out.println("Tipo de producto: " + producto);
        System.out.println("Cantidad comprada: " + dato0);
        System.out.println("Monto del descuento: " + dato2);
        System.out.println("Monto de pago: " + dato3);
    }

    // Acumulador
    public double acumulador(double nro, double dato3) {
        double acumulador = 0;
        for (int i = 0; i < nro; i++) {
            acumulador += dato3;
        }
        return acumulador;
    }

    // Mostrar datos de los arreglos
    public void mostrar(String cliente, String nombre[], int nro, double ventas[][]) {
        System.out.println("***********************************");
        System.out.println("Cliente: " + cliente);
        System.out.println("Nombre \t Cant \t Prec \t Desc \t P.Total");
        for (int i = 0; i < nro; i++) {
            System.out.println(nombre[i] + " \t " + ventas[i][0] + " \t " + ventas[i][1] + " \t " + ventas[i][2]
                    + " \t " + ventas[i][3]);
        }
    }

    // Mostrar monto acumulado por todas la ventas
    public void mostrarAcumulado(double acum) {
        System.out.println("***********************************");
        System.out.println("Monto acumulado: " + acum);
    }
}
