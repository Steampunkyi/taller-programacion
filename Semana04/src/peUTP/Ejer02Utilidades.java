package peUTP;

import java.util.Scanner;

public class Ejer02Utilidades {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variables
        double salario, utilidad;
        int tiempo;
        // Ingreso de datos
        System.out.println("Ingrese el salario del empleado: ");
        salario = Leer.nextDouble();
        System.out.println("Ingrese el tiempo del trabajador en la empresa: ");
        tiempo = Leer.nextInt();
        // Proceso
        if (tiempo < 2) {
            utilidad = salario * 12 * 0.05;
        } else if (tiempo >= 2 && tiempo < 5) {
            utilidad = salario * 12 * 0.07;
        } else if (tiempo >= 5 && tiempo < 8) {
            utilidad = salario * 12 * 0.10;
        } else if (tiempo >= 8 && tiempo < 10) {
            utilidad = salario * 12 * 0.15;
        } else {
            utilidad = salario * 12 * 0.20;
        }
        // Reporte
        System.out.println("Salario: " + salario);
        System.out.println("Tiempo: " + tiempo + " años");
        System.out.println("Utilidades: " + utilidad);
    }
}
