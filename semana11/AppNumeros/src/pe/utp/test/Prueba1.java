package pe.utp.test;

import java.util.Scanner;

import pe.utp.service.ServiceCuadCubo;

public class Prueba1 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Crear una instancia del tipo ServiceCuadCubo
        ServiceCuadCubo scc = new ServiceCuadCubo();
        scc.mostrarBienvenida();
        System.out.println("Ingrese la cantidad de numeros: ");
        int nro = Leer.nextInt();
        for (int i = 0; i < nro; i++) {
            System.out.println("Ingrese el numero: " + (i + 1));
            int num = Leer.nextInt();
            // Hacer uso de los metodos de ServiceCuadCubo
            int cuadrado = scc.calcularCuadrado(num);
            int cubo = scc.calcularCubo(num);
            // Mostrar los resultados
            System.out.println("El cuadrado de " + num + " es: " + cuadrado);
            System.out.println("El cubo de " + num + " es: " + cubo);
        }
    }
}
