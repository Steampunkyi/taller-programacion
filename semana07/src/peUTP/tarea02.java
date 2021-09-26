package peUTP;

import java.util.Scanner;

public class tarea02 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String nombre;
        int trabajador = 1, trabajadorCant = 0, horas = 0, salarioBruto = 0, horasExtras = 0;
        double salarioNeto = 0, salarioExtra = 0, salarioTotal = 0, acumSalarioTotal = 0;
        System.out.println("Ingrese la cantidad de trabajadores: ");
        trabajadorCant = Leer.nextInt();
        while (trabajador <= trabajadorCant) {
            System.out.println("Ingrese el nombre del trabajador: ");
            nombre = Leer.next();
            System.out.println("Ingrese las horas trabajadas: ");
            horas = Leer.nextInt();
            if (horas <= 40) {
                salarioBruto = horas * 15;
            } else {
                salarioBruto = 40 * 15;
                horasExtras = horas - 40;
                salarioExtra = horasExtras * 20;
                salarioNeto = salarioBruto + salarioExtra;
            }
            salarioTotal = salarioNeto;
            acumSalarioTotal = acumSalarioTotal + salarioTotal;
            System.out.println("El trabajador " + nombre + " tiene un salario bruto de " + salarioBruto
                    + " y un salario neto de " + salarioNeto + " y un salario total de " + salarioTotal);
            trabajador++;
        }
        System.out.println("El total de trabajadores es: " + trabajadorCant);
        System.out.println("El total de salarios brutos es de " + acumSalarioTotal);
    }
}