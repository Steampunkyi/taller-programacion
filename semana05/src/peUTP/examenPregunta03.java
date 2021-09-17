package peUTP;

import java.util.Scanner;

public class examenPregunta03 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variables
        String marcas;
        double precio, descuento, precioFinal;
        int cantidad;
        // Ingreso de datos
        System.out.println("Ingrese la marca de la computadora que quiera comprar: ");
        marcas = Leer.nextLine();
        System.out.println("Ingrese el precio de la computadora: ");
        precio = Leer.nextDouble();
        System.out.println("Ingrese la cantidad de computadoras que quiere comprar: ");
        cantidad = Leer.nextInt();
        // Proceso
        if (cantidad < 6) {
            System.out.println("No se le aplica descuento");
            System.out.println("El precio final es: " + precio * cantidad);
        } else {
            if (cantidad >= 6 && cantidad < 20) {
                switch (marcas.toLowerCase()) {
                    case "hp":
                    case "toshiba":
                        descuento = precio * 0.5;
                        precioFinal = precio - descuento;
                        System.out.println("El precio final de cada computadora es: " + precioFinal);
                        System.out.println("El precio total es: " + precioFinal * cantidad);
                        break;
                    case "samsung":
                    case "advance":
                        descuento = precio * 0.25;
                        precioFinal = precio - descuento;
                        System.out.println("El precio final de cada computadora es: " + precioFinal);
                        System.out.println("El precio total es: " + precioFinal * cantidad);
                        break;
                    case "otros":
                        descuento = precio * 0.1;
                        precioFinal = precio - descuento;
                        System.out.println("El precio final de cada computadora es: " + precioFinal);
                        System.out.println("El precio total es: " + precioFinal * cantidad);
                        break;
                    default:
                        System.out.println("La marca ingresada no es correcta");
                }
            } else {
                System.out.println("Ha sobrepasado el límite de equipos");
            }
        }
    }
}
