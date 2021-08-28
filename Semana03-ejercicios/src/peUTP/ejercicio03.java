package peUTP;

import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int num, numFinal = 0;
        // Entrada
        System.out.println("Ingrese el número de hasta 2 cifras: ");
        num = Leer.nextInt();
        // Proceso
        if (num > 0 && num < 10) {
            numFinal = 10 - num;
            System.out.println("Al numero " + num + " le falta " + numFinal + " para llegar a 10.");
        } else if (num > 10 && num < 100) {
            numFinal = 100 - num;
            System.out.println("Al numero " + num + " le falta " + numFinal + " para llegar a 100.");
        } else {
            System.out.println("Número fuera de rango.");
        }
        Leer.close();
    }
}
