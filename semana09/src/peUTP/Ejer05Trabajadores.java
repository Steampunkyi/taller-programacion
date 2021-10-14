package peUTP;

import java.util.Scanner;

public class Ejer05Trabajadores {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int nro, edadAlto = 0;
        double sueldoAlto = 0;
        String nombreAlto = "";
        double acum = 0;
        System.out.println("Ingrese el numero de trabajadores: ");
        nro = Leer.nextInt();
        double sueldo[] = new double[nro];
        String nombre[] = new String[nro];
        int edad[] = new int[nro];
        // For para capturar datos e ingresar al arreglo
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Ingrese el nombre del trabajador " + (i + 1) + ": ");
            nombre[i] = Leer.next();
            System.out.println("Ingrese la edad del trabajador " + (i + 1) + ": ");
            edad[i] = Leer.nextInt();
            System.out.println("Ingrese el sueldo del trabajador " + (i + 1) + ": ");
            sueldo[i] = Leer.nextDouble();
            // Capturar el trabajador con el sueldo mas alto
            if (sueldo[i] > sueldoAlto) {
                sueldoAlto = sueldo[i];
                nombreAlto = nombre[i];
                edadAlto = edad[i];
            }
        }
        // Mostrar resultados
        System.out.println("Nombre \tEdad \tSueldo");
        for (int i = 0; i < edad.length; i++) {
            System.out.println(nombre[i] + "\t" + edad[i] + "\t" + sueldo[i]);
        }
        System.out.println("=====================================");
        System.out.println("Trabajador con el sueldo mas alto");
        System.out.println("Nombre: " + nombreAlto + "\tEdad: " + edadAlto + "\tSueldo: " + sueldoAlto);
    }
}
