package peUTP;

import java.util.Scanner;

public class Ejer01SwitchCase {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variables
        int num;
        String mensaje = "";
        // Entrada de datos
        System.out.println("Ingrese un numero: ");
        num = Leer.nextInt();
        // Proceso
        switch (num) {
            case 1:
                mensaje = "Open JDK11, version LTS";
                break;
            case 2:
                mensaje = "Python 3.8.3, ultima version";
                break;
            case 3:
                mensaje = "PHP 7.4, ultima version";
                break;
            case 4:
                mensaje = "Go 1.14.1, lenguaje de programacion de Google";
                break;
            default:
                System.out.println("Error al ingresar datos...");
        }
        // Reporte o salida
        System.out.println(mensaje);
    }
}
