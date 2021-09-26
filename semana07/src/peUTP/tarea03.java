package peUTP;

import java.util.Scanner;

public class tarea03 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int trabajador = 1, nTrabajadores = 0, horas = 0, precioHoras = 0, sueldo = 0;
        double descuento = 0, sueldoNeto = 0, acumSueldoNeto = 0, promedioSueldoNeto = 0;
        String nombre, apellido;
        System.out.println("Ingrese la cantidad de trabajadores: ");
        nTrabajadores = Leer.nextInt();
        do {
            System.out.println("Ingrese el nombre del trabajador " + trabajador);
            nombre = Leer.next();
            System.out.println("Ingrese el apellido del trabajador " + trabajador);
            apellido = Leer.next();
            System.out.println("Ingrese las horas trabajadas del trabajador " + trabajador);
            horas = Leer.nextInt();
            System.out.println("Ingrese el precio por hora del trabajador " + trabajador);
            precioHoras = Leer.nextInt();
            sueldo = horas * precioHoras;
            descuento = sueldo * 0.12;
            sueldoNeto = sueldo - descuento;
            acumSueldoNeto = acumSueldoNeto + sueldoNeto;
            System.out.println("El trabajador " + nombre + " " + apellido + " tiene un sueldo neto de: " + sueldoNeto);
            trabajador++;
        } while (trabajador <= nTrabajadores);
        promedioSueldoNeto = acumSueldoNeto / nTrabajadores;
        System.out.println("La suma de los sueldos es:" + acumSueldoNeto);
        System.out.println("El promedio de sueldo neto es " + promedioSueldoNeto);
    }
}