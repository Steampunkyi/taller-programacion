package pe.utp.test;

import java.util.Scanner;

import pe.utp.service.ServiceMueble;

public class tarea02 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de ventas: ");
        int nro = Leer.nextInt();
        String nombreMueble[] = new String[nro], cliente;
        double ventas[][] = new double[nro][4];
        // Crear la instancia de ServiceMueble
        ServiceMueble sm = new ServiceMueble();
        // Estructura de la repeticion
        for (int i = 0; i < nro; i++) {
            System.out.println("Ingrese el nombre del cliente: ");
            cliente = Leer.next();
            System.out.println("Ingrese el nombre del mueble: ");
            nombreMueble[i] = Leer.next();
            System.out.println("Ingrese la cantidad de muebles que comprara: ");
            ventas[i][0] = Leer.nextDouble();
            System.out.println("Ingrese el precio del mueble: ");
            ventas[i][1] = Leer.nextDouble();
            // Acceder al metodo descuentoMueble
            ventas[i][2] = sm.descuentoMueble(ventas[i][0], ventas[i][1]);
            // Acceder al metodo ventaMueble
            ventas[i][3] = sm.ventaMueble(ventas[i][0], ventas[i][1], ventas[i][2]);
            // Reporte
            sm.reporteUnaVenta(cliente, nombreMueble[i], ventas[i][0], ventas[i][2], ventas[i][3]);
        }
        Leer.close();
    }
}
