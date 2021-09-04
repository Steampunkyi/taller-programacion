package peUTP;

import java.util.Scanner;

public class tarea01 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variables
        String sexo, talla, origen;
        double precio = 0, descuento = 0, precioFinal = 0;
        // Ingreso de datos
        System.out.println("Bienvenido a nuestra tienda.");
        System.out.println("Ingrese el monto comprado: ");
        precio = Leer.nextDouble();
        System.out.println("Ingrese el sexo de la prenda de vestir: Hombre o Mujer ");
        sexo = Leer.next();
        System.out.println("Ingrese la talla del cliente: S, M, L");
        talla = Leer.next();
        System.out.println("Ingrese el origen de la prenda de vestir: Nacional o Importado");
        origen = Leer.next();
        // Proceso
        switch (sexo.toLowerCase()) {
            case "Hombre":
                switch (talla.toLowerCase()) {
                    case "S":
                        switch (origen.toLowerCase()) {
                            case "Nacional":
                                descuento = 0.10;
                                break;
                            case "Importado":
                                descuento = 0.05;
                                break;
                            default:
                                System.out.println("Error en el origen de la prenda de vestir.");
                                break;
                        }
                        break;
                    case "M":
                        switch (origen.toLowerCase()) {
                            case "Nacional":
                                descuento = 0.12;
                                break;
                            case "Importado":
                                descuento = 0.07;
                                break;
                            default:
                                System.out.println("Error en el origen de la prenda de vestir.");
                                break;
                        }
                        break;
                    case "L":
                        switch (origen.toLowerCase()) {
                            case "Nacional":
                                descuento = 0.15;
                                break;
                            case "Importado":
                                descuento = 0.10;
                                break;
                            default:
                                System.out.println("Error en el origen de la prenda de vestir.");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Error en la talla de la prenda de vestir.");
                        break;
                }
                break;
            case "Mujer":
                switch (talla.toLowerCase()) {
                    case "S":
                        switch (origen.toLowerCase()) {
                            case "Nacional":
                                descuento = 0.15;
                                break;
                            case "Importado":
                                descuento = 0.07;
                                break;
                            default:
                                System.out.println("Error en el origen de la prenda de vestir.");
                                break;
                        }
                        break;
                    case "M":
                        switch (origen.toLowerCase()) {
                            case "Nacional":
                                descuento = 0.17;
                                break;
                            case "Importado":
                                descuento = 0.09;
                                break;
                            default:
                                System.out.println("Error en el origen de la prenda de vestir.");
                                break;
                        }
                        break;
                    case "L":
                        switch (origen.toLowerCase()) {
                            case "Nacional":
                                descuento = 0.20;
                                break;
                            case "Importado":
                                descuento = 0.12;
                                break;
                            default:
                                System.out.println("Error en el origen de la prenda de vestir.");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Error en la talla de la prenda de vestir.");
                        break;
                }
                break;
            default:
                break;
        }
        precioFinal = precio - (precio * descuento);
        // Reporte
        System.out.println("El monto comprado es: " + precio);
        System.out.println("El género de la prenda de vestir es: " + sexo);
        System.out.println("La talla de la prenda de vestir es: " + talla);
        System.out.println("El origen de la prenda de vestir es: " + origen);
        System.out.println("El descuento es: " + descuento);
        System.out.println("El precio final es: " + precioFinal);
    }
}
