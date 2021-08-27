package peUTP;

import java.util.Scanner;

public class CondicionalMultiple {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variable
        int edad;
        String etapa;
        // Entrada de datos
        System.out.println("Ingrese su edad: ");
        edad = Leer.nextInt();
        // Proceso
        if (edad >= 65) {
            etapa = "Adulto(a) mayor";
        } else if (edad < 65 && edad >= 30) {
            etapa = "Adulto(a)";
        } else if (edad < 30 && edad >= 18) {
            etapa = "Joven";
        } else if (edad < 18 && edad >= 13) {
            etapa = "Adolescente";
        } else {
            etapa = "Niño(a)";
        }
        // Reporte o salida
        System.out.println("Usted tiene " + edad + " años y es " + etapa);
        Leer.close();
    }
}
