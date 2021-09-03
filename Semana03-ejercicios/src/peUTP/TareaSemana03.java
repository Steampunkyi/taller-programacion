package peUTP;

import java.util.Scanner;

public class TareaSemana03 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int impBruto, estCivil;
        double bonif, impNeto;
        // Entrada
        System.out.println("Ingrese el importe bruto: ");
        impBruto = Leer.nextInt();
        System.out.println("Elija entre las siguientes opciones:");
        System.out.println("1: Viudo o Divorciado.");
        System.out.println("2: Casado.");
        System.out.println("3: Soltero.");
        estCivil = Leer.nextInt();
        // Proceso
        if (estCivil == 1) {
            bonif = 0.20 * impBruto;
        } else if (estCivil == 2) {
            bonif = 0.12 * impBruto;
        } else {
            bonif = 0.08 * impBruto;
        }
        System.out.println("El importe bruto es: " + impBruto);
        System.out.println("La bonificacion es: " + bonif);
        System.out.println("El importe neto es: " + (impBruto + bonif));
    }
}
