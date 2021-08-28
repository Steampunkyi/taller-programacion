package peUTP;

import java.util.Scanner;

public class entradas {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        double precio, ganancia = 0;
        String tipo;
        // Entrada de datos
        System.out.println("Ingrese el precio de la entrada: ");
        precio = Leer.nextDouble();
        System.out.println("Ingrese el tipo de la entrada: \n[Occidente, Oriente, Norte, Sur]");
        tipo = Leer.next();
        // Proceso
        if (tipo.equals("Occidente")) {
            ganancia = precio * 0.8;
        } else if (tipo.equals("Oriente")) {
            ganancia = precio * 0.5;
        } else if (tipo.equals("Norte") || tipo.equals("Sur")) {
            ganancia = precio * 0.3;
        } else {
            System.out.println("Error al ingresar dato");
        }
        // Reporte o salida
        System.out.println("La entrada es " + tipo + " y la ganancia es " + ganancia);
    }
}
