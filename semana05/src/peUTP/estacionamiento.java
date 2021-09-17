package peUTP;

import java.util.Scanner;

public class estacionamiento {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variables
        int horas, minutos;
        String dia;
        double mpago = 0, mfraccion = 0;
        // Ingreso de datos
        System.out.println("Ingrese el dia de la semana: ");
        dia = Leer.next();
        System.out.println("Ingrese la hora de entrada: ");
        horas = Leer.nextInt();
        System.out.println("Ingrese los minutos de entrada: ");
        minutos = Leer.nextInt();
        // Proceso
        switch (dia.toLowerCase()) {
            case "lunes":
            case "martes":
            case "miercoles":
                if (minutos > 5) {
                    mfraccion = 3;
                }
                mpago = horas * 3 + mfraccion;
                break;
            case "jueves":
            case "viernes":
                if (minutos > 5) {
                    mfraccion = 3.50;
                }
                mpago = horas * 3.50 + mfraccion;
                break;
            case "sabado":
            case "domingo":
                if (minutos > 5) {
                    mfraccion = 5;
                }
                mpago = horas * 5 + mfraccion;
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }
        // Salida de datos
        System.out.println("Dia de la semana: " + dia);
        System.out.println("Tiempo de estacionamiento: " + horas + " horas y " + minutos + " minutos");
        System.out.println("Monto a pagar: " + mpago);
        Leer.close();
    }
}
