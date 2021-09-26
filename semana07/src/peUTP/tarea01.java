package peUTP;

import java.util.Scanner;

public class tarea01 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int nota = 1, cali = 0;
        double promedio = 0, suma = 0;
        while (nota <= 3) {
            System.out.println("Ingrese la nota: " + nota);
            cali = Leer.nextInt();
            nota++;
            suma += cali;
        }
        promedio = suma / 3;
        System.out.println("El promedio es: " + promedio);
        if (promedio <= 10) {
            System.out.println("Alumno deficiente");
        } else if (promedio > 10 && promedio <= 14) {
            System.out.println("Alumno regular");
        } else {
            System.out.println("Buen alumno");
        }
    }
}