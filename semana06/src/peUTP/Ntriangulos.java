package peUTP;

import java.util.Scanner;

public class Ntriangulos {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variables
        double base, altura, area, promedio = 0, acum = 0;
        int cont = 0;
        char resp = 'S';
        // Entrada de datos
        while (resp == 'S') {
            System.out.println("Ingrese la base del triangulo: ");
            base = Leer.nextDouble();
            System.out.println("Ingrese la altura del triangulo: ");
            altura = Leer.nextDouble();
            // Proceso
            area = (base * altura) / 2;
            // Contador
            cont++;
            // Acumulador
            acum += area;
            // Salida
            System.out.println("El area del triangulo es: " + area);
            System.out.println("Desea ingresar otro triangulo? (S/N)");
            resp = Leer.next().toUpperCase().charAt(0);
        }
        // Calcular el promedio del area de los triangulos
        promedio = acum / cont;
        // Salida
        System.out.println("El promedio del area de los triangulos es: " + promedio);
        Leer.close();
    }
}
