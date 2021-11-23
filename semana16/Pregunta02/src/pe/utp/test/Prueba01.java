package pe.utp.test;

import java.util.Scanner;

import pe.utp.model.Laptop;

public class Prueba01 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        try {
            System.out.println("Ingrese el numero de computadoras: ");
            int nro = Leer.nextInt();
            Laptop lpt[] = new Laptop[nro];
            for (int i = 0; i < nro; i++) {
                System.out.println("Ingrese el codigo: ");
                String codigo = Leer.next();
                System.out.println("Ingrese la marca: ");
                String marca = Leer.next();
                System.out.println("Ingrese el precio: ");
                double precio = Leer.nextDouble();
                System.out.println("Ingrese el tamaño de la pantalla: ");
                double tamaño = Leer.nextDouble();
                System.out.println("Ingrese el el tipo de teclado: ");
                String teclado = Leer.next();
                // Crear datos del tipo Laptop
                Laptop lpt1 = new Laptop(tamaño, teclado, codigo, marca, precio);
                // Guardar el objeto en el arreglo
                lpt[i] = lpt1;
            }
            // Mostrar datos los objetos del arreglo
            for (int i = 0; i < lpt.length; i++) {
                System.out.println(lpt[i].verDatos());
                lpt[i].mostrarPrecio();
                System.out.println("=================================");
            }
        } catch (Exception ex) {
            System.out.println("Error en el ingreso de datos");
        } finally {
            System.out.println("Proceso terminado");
            ;
        }
    }
}