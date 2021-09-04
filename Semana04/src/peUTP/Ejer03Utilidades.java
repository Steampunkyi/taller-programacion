package peUTP;

import java.util.Scanner;

public class Ejer03Utilidades {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variables
        double salario, utilidad;
        int tiempo;
        // Ingreso de datos
        System.out.println("Ingrese el salario del empleado: ");
        salario = Leer.nextDouble();
        System.out.println("Elija entre las opciones el tiempo de servicio en la empresa: ");
        System.out.println("1. Menos de 2 año");
        System.out.println("2. Entre 2 y menos de 5 años");
        System.out.println("3. Entre 5 y menos de 8 años");
        System.out.println("4. Entre 8 y menos de 10 años");
        System.out.println("5. Mas de 10 años");
        tiempo = Leer.nextInt();
        // Proceso
        switch (tiempo) {
            case 1:
                utilidad = salario * 12 * 0.05;
                break;
            case 2:
                utilidad = salario * 12 * 0.07;
                break;
            case 3:
                utilidad = salario * 12 * 0.10;
                break;
            case 4:
                utilidad = salario * 12 * 0.15;
                break;
            default:
                utilidad = salario * 12 * 0.20;
        }
        // Reporte
        System.out.println("Salario: " + salario);
        System.out.println("Utilidad: " + utilidad);
    }
}
