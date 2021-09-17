package peUTP;

import java.util.Scanner;

public class condicionAnidada {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variables
        double a, b, cal1 = 0, cal2 = 0;
        int n;
        // Ingreso de datos
        System.out.println("Ingrese el valor de A: ");
        a = Leer.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        b = Leer.nextDouble();
        System.out.println("Ingrese el valor de N: ");
        n = Leer.nextInt();
        // Proceso
        if (b != 0) {
            cal1 = Math.pow(a / b, n);
            cal2 = (Math.pow(a, n)) / (Math.pow(b, n));
            if (cal1 == cal2) {
                System.out.println("Se comprueba la igualdad");
            } else {
                System.out.println("No son iguales");
            }
        } else {
            System.out.println("Error, el valor de B no puede ser 0");
        }
        // Imprimir resultados
        System.out.println("Calculo1: " + cal1);
        System.out.println("Calculo2: " + cal2);
        Leer.close();
    }
}