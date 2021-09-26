package peUTP;

import java.util.Scanner;

public class numerosPositivos {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int num1, num2;
        do {
            System.out.println("Ingrese numero 1: ");
            num1 = Leer.nextInt();
            System.out.println("Ingrese numero 2: ");
            num2 = Leer.nextInt();
        } while (num1 < 0 || num2 < 0);
        if (num1 != num2) {
            if (num1 > num2) {
                System.out.println("El numero mayor es: " + num1);
                System.out.println("El numero menor es: " + num2);
            } else {
                System.out.println("El numero mayor es: " + num2);
                System.out.println("El numero menor es: " + num1);
            }
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
}
