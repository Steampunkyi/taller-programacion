package utpPE;

import java.util.Scanner;

public class exam01 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variables para el area y longitud de la circunferencia
        double radio, area, longitud, acumArea = 0, acumLongitud = 0, promedioArea = 0, promedioLongitud = 0;
        int cont = 0;
        char resp = 'S';
        // Entrada de datos
        while (resp == 'S') {
            System.out.println("Ingrese el radio de la circunferencia: ");
            radio = Leer.nextDouble();
            // Calculo de area y longitud
            area = Math.PI * Math.pow(radio, 2);
            longitud = 2 * Math.PI * radio;
            // Contador
            cont++;
            // Acumulador
            acumArea += area;
            acumLongitud += longitud;
            // Salida de datos
            System.out.println("El area de la circunferencia es: " + area);
            System.out.println("La longitud de la circunferencia es: " + longitud);
            System.out.println("Desea ingresar otros datos? (S/N)");
            resp = Leer.next().toUpperCase().charAt(0);
        }
        // Calcular el promedio del area y longitud
        promedioArea = acumArea / cont;
        promedioLongitud = acumLongitud / cont;
        // Salida
        System.out.println("El promedio del area es: " + promedioArea);
        System.out.println("El promedio de la longitud es: " + promedioLongitud);
        Leer.close();
    }
}
