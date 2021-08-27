package peUTP;

import java.util.Scanner;

public class CondicionalDoble {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variable
        int edad;
        // Entrada
        System.out.println("Inrese su edad>:");
        edad = Leer.nextInt();
        // Proceso
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
