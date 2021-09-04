package peUTP;

import java.util.Scanner;

public class tarea02 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variables
        String sexo;
        double estatura = 0, peso = 0, vitaminas = 0;
        // Ingreso de datos
        System.out.println("Ingrese el sexo del estudiante: ");
        sexo = Leer.next();
        System.out.println("Ingrese la estatura del estudiante: ");
        estatura = Leer.nextDouble();
        System.out.println("Ingrese el peso del estudiante: ");
        peso = Leer.nextDouble();
        // Proceso
        switch (sexo.toLowerCase()) {
            case "masculino":
                if (estatura > 1.60 || peso >= 150) {
                    vitaminas = 0.2 * estatura + 0.8 * peso;
                } else {
                    vitaminas = 0.3 * estatura + 0.7 * peso;
                }
                break;
            case "femenino":
                if (estatura > 1.50 || peso >= 130) {
                    vitaminas = 0.25 * estatura + 0.75 * peso;
                } else {
                    vitaminas = 0.35 * estatura + 0.65 * peso;
                }
                break;
            default:
                System.out.println("Sexo no valido");
                break;
        }
        // Reporte
        System.out.println("El valor de las vitaminas es: " + vitaminas);
    }
}
