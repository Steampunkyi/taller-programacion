package pe.utp.test;

import java.util.Scanner;

import pe.utp.service.ServiceMedicamento;

public class Pregunta01 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int cantidad;
        double precio, ventaTotal = 0, acum = 0;
        System.out.println("Ingrese la cantidad de compra: ");
        int nro = Leer.nextInt();
        // Crear la instancia de ServiceMedicamento
        ServiceMedicamento servicio = new ServiceMedicamento();
        for (int i = 0; i < nro; i++) {
            System.out.println("Ingrese el precio del medicamento: ");
            precio = Leer.nextDouble();
            System.out.println("Ingrese la cantidad de compra: ");
            cantidad = Leer.nextInt();
            // Acceder al metodo ventaMedicamento
            ventaTotal = servicio.ventaMedicamento(cantidad, precio);
            // Acumulador
            acum += ventaTotal;
            // Mostrar el resultado
            servicio.reporteVenta(ventaTotal);
        }
    }
}
