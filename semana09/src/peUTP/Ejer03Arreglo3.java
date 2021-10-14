package peUTP;

import java.util.Scanner;

public class Ejer03Arreglo3 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int nro;
        System.out.println("Ingrese un numero: ");
        nro = Leer.nextInt();
        double sueldo[] = new double[nro];
        String trabs[] = new String[nro];
        // Usar for para llenar datos al arreglo
        for (int i = 0; i < nro; i++) {
            System.out.println("Ingrese el nombre del trabajador: ");
            trabs[i] = Leer.next();
            System.out.println("Ingrese el sueldo de trabajo: ");
            sueldo[i] = Leer.nextDouble();
        }
        // Usar for para mostrar datos al arreglo
        System.out.println("Trabajado \t\tSueldo");
        for (int i = 0; i < trabs.length; i++) {
            System.out.println(trabs[i] + " \t\t" + sueldo[i]);
        }
    }
}
