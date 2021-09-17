package peUTP;

import java.util.Scanner;

public class examenPregunta2 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variables
        int lado, base, perimetro;
        String tipoTriangulo;
        // Ingreso de datos
        System.out.println("Ingrese el tipo de triángulo: Equilátero o Escaleno");
        tipoTriangulo = Leer.nextLine();
        // Proceso
        switch (tipoTriangulo.toLowerCase()) {
            case "equilatero":
                System.out.println("Ingrese el lado: ");
                lado = Leer.nextInt();
                perimetro = lado * 3;
                System.out.println("El perímetro es: " + perimetro);
                break;
            case "isosceles":
                System.out.println("Ingrese la base: ");
                base = Leer.nextInt();
                System.out.println("Ingrese el lado: ");
                lado = Leer.nextInt();
                perimetro = base + lado * 2;
                System.out.println("El perímetro es: " + perimetro);
                break;
            default:
                System.out.println("El tipo de triángulo ingresado no es correcto");
                break;
        }
    }
}