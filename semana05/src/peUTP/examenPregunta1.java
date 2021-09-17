package peUTP;

import java.util.Scanner;

public class examenPregunta1 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variables
        double sueldo, bonificacion, descuento, total;
        // Ingreso de datos
        System.out.println("Ingrese el sueldo del empleado");
        sueldo = Leer.nextDouble();
        // Calculo de datos
        bonificacion = sueldo * 0.20;
        descuento = sueldo * 0.05;
        total = sueldo + bonificacion - descuento;
        // Salida de datos
        System.out.println("El sueldo del empleado es: " + sueldo);
        System.out.println("La bonificacion es: " + bonificacion);
        System.out.println("El descuento es: " + descuento);
        System.out.println("El total es: " + total);
    }
}