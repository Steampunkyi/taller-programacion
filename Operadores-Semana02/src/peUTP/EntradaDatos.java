package peUTP;

import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        // Clase externa Scanner
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = Leer.next();
        System.out.println("Ingrese edad: ");
        int edad = Leer.nextInt();
        System.out.println("Ingrese sueldo: ");
        double sueldo = Leer.nextDouble();
        // Proceso
        double desc = sueldo * 0.15;
        double neto = sueldo - desc;
        // Reporte
        System.out.println("Trabajador: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sueldo bruto: " + sueldo);
        System.out.println("Descuento: " + desc);
        System.out.println("Neto a cobrar: " + neto);
    }
}
