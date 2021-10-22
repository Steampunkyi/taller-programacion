package pe.UTP;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Llamar al metodo de bienvenida
        darBienvenida();
        System.out.println("Ingrese numero 1: ");
        int num1 = Leer.nextInt();
        System.out.println("Ingrese numero 2: ");
        int num2 = Leer.nextInt();
        // Llamar al metodo calcularProducto
        int resp = calcularProducto(num1, num2);
        // Llamar al metodo verResultado
        verResultado(resp);
    }

    // Metodo que calcula un producto de dos numeros y retorna el resultado
    // Metodo con dos parametros
    static int calcularProducto(int v1, int v2) {
        int resp = v1 * v2;
        return resp;
    }

    // Metodo que permite mostrar resultado, sin retorno y con un parametro
    static void verResultado(int resul) {
        System.out.println("El resultado es: " + resul);
    }

    // Metodo sin retorno y sin parametro - procedimiento
    static void darBienvenida() {
        System.out.println("Bienvenidos al sistema");
    }
}
