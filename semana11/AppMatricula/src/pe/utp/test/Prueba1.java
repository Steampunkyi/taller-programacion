package pe.utp.test;

import java.util.Scanner;

import pe.utp.service.ServiceMatricula;

public class Prueba1 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        char resp = 'S';
        double importe = 1000, acum = 0;
        // Crear la instancia de ServiceMatricula
        ServiceMatricula sm = new ServiceMatricula();
        while (resp == 'S') {
            System.out.println("Ingrese el promedio: ");
            double prom = Leer.nextDouble();
            // Acceder al metodo calcularIPago para obtener el importe de pago
            double ipago = sm.calcularIPago(importe, prom);
            // Acumular el importe de pago
            acum += ipago;
            // Mostrar el importe de pago
            System.out.println("Importe de pago: " + ipago);
            System.out.println("Desea continuar? [S/N]: ");
            resp = Leer.next().toUpperCase().charAt(0);
        }
        // Resultados finales
        System.out.println("========================================================");
        System.out.println("Importe recaudado por todas las matriculas: " + acum);
    }
}