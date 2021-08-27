package peUTP;

import java.util.Scanner;

public class CondicionalSimple {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variables
        int edad;
        String mensaje = "No es mayor de edad";
        // Entrada de datos
        System.out.println("Ingrese su edad: ");
        edad = Leer.nextInt();
        // Proceso
        if (edad >= 18) {
            mensaje = "Es mayor de edad";
        }
        // Reporte o salida
        System.out.println(mensaje);
    }
}
