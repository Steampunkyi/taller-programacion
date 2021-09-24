package peUTP;

import java.util.Scanner;

public class DosNumeros {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variables
        int num1, num2;
        System.out.println("Ingrese Nro. 01: ");
        num1 = Leer.nextInt();
        System.out.println("Ingrese Nro. 02: ");
        num2 = Leer.nextInt();
        // Estructura repetitiva
        while (num1 < num2 - 1) {
            num1++;
            System.out.print(num1 + "-");
        }
    }
}
