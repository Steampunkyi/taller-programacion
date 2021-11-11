package pe.utp.test;

import java.util.Scanner;

import pe.utp.service.ServiceGaseosa;

public class tarea01 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int cantidad;
        double precio, ventaTotal = 0, acum = 0;
        String tipo;
        System.out.println("Ingrese la cantidad de compra: ");
        int nro = Leer.nextInt();
        // Crear la instancia de ServiceGaseosa
        ServiceGaseosa sg = new ServiceGaseosa();
        for (int i = 0; i < nro; i++) {
            System.out.println("Ingrese el tipo de producto: ");
            tipo = Leer.next();
            System.out.println("Ingrese la cantidad de producto: ");
            cantidad = Leer.nextInt();
            System.out.println("Ingrese el precio del producto: ");
            precio = Leer.nextDouble();
            // Acceder al metodo ventaGaseosa
            ventaTotal = sg.ventaGaseosa(tipo, cantidad, precio);
            // Acumulador
            acum += ventaTotal;
            // Mostrar el resultado
            sg.reporteVentas(tipo, cantidad, ventaTotal);
        }
        // Mostrar el acumulado
        sg.mostrarAcumulado(acum);
        Leer.close();
    }
}
