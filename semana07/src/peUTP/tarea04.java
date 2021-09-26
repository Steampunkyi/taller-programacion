package peUTP;

import java.util.Scanner;

public class tarea04 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int turnos, dia, horas = 0;
        double sueldo = 0;
        char resp = 'S';
        do {
            do {
                System.out.println("Seleccione el dia que labora: \n1. L-S\n2. Domingo");
                dia = Leer.nextInt();
            } while (!(dia < 3 && dia > 0));
            do {
                System.out.println("Ingrese el turno que labora: \n1. Mañana\n2. Tarde");
                turnos = Leer.nextInt();
            } while (!(turnos < 3 && turnos > 0));
            System.out.println("Ingrese el numero de horas trabajadas");
            horas = Leer.nextInt();
            switch (dia) {
                case 1:
                    if (turnos == 1) {
                        sueldo = horas * 9;
                    } else {
                        sueldo = horas * 12;
                    }
                    break;
                case 2:
                    if (turnos == 1) {
                        sueldo = horas * 13.5;
                    } else {
                        sueldo = horas * 18;
                    }
                    break;
            }
            System.out.println("El jornal diario del trajador es: " + sueldo);
            System.out.println("Desea continuar? [S/N]: ");
            resp = Leer.next().charAt(0);
        } while (resp == 'S');
    }
}