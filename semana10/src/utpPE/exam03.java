package utpPE;

import java.util.Scanner;

public class exam03 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Ingreso de variables de notas de alumnos
        int nro, contRegular = 0, contBuen = 0, contExcelente = 0;
        double acum = 0;
        System.out.println("Ingrese la cantidad de alumnos: ");
        nro = Leer.nextInt();
        double nota[] = new double[nro];
        String calificativo[] = new String[nro];
        // for para capturar datos e ingresar al arreglo
        for (int i = 0; i < nro; i++) {
            do {
                System.out.println("Ingrese la nota del alumno " + (i + 1) + ": ");
                nota[i] = Leer.nextDouble();
            } while (nota[i] <= 0 || nota[i] >= 20);
            // Condicionar la nota para identificar a los alumnos
            if (nota[i] >= 17) {
                calificativo[i] = "Alumno excelente";
                contExcelente++;
            } else if (nota[i] >= 14 && nota[i] < 17) {
                calificativo[i] = "Buen alumno";
                contBuen++;
            } else {
                calificativo[i] = "Alumno regular";
                contRegular++;
            }
        }
        // Mostrar resultados
        System.out.println("Nota \tCalificativo");
        for (int i = 0; i < nro; i++) {
            System.out.println(nota[i] + "\t" + calificativo[i]);
        }
    }
}
