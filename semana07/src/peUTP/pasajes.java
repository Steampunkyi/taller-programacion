package peUTP;

import java.util.Scanner;

public class pasajes {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int vehiculo, turno, contOmni = 0, contMini = 0, contCombi = 0;
        double acumOmManana = 0, acumOmTarde = 0, acumOmNoche = 0;
        double acumMiniManana = 0, acumMiniTarde = 0, acumMiniNoche = 0;
        double acumCombiManana = 0, acumCombiTarde = 0, acumCombiNoche = 0;
        char resp = 'S';
        do {
            do {
                System.out.println("Seleccione tipo de vehiculo");
                System.out.println("1. Omnibus \t2. Minivan \t3. Combi: ");
                vehiculo = Leer.nextInt();
            } while (!(vehiculo < 4 && vehiculo > 0));
            do {
                System.out.println("Seleccione turno");
                System.out.println("1. Mañana \t2. Tarde \t3. Noche: ");
                turno = Leer.nextInt();
            } while (!(turno < 4 && turno > 0));
            // Condicionar el tipo de vehiculo
            switch (vehiculo) {
                case 1:
                    if (turno == 1) {
                        acumOmManana += 15;
                    } else if (turno == 2) {
                        acumOmTarde += 15;
                    } else {
                        acumOmNoche += 15;
                    }
                    contOmni++;
                    break;
                case 2:
                    if (turno == 1) {
                        acumMiniManana += 8;
                    } else if (turno == 2) {
                        acumMiniTarde += 8;
                    } else {
                        acumMiniNoche += 8;
                    }
                    contMini++;
                    break;
                case 3:
                    if (turno == 1) {
                        acumCombiManana += 10;
                    } else if (turno == 2) {
                        acumCombiTarde += 10;
                    } else {
                        acumCombiNoche += 10;
                    }
                    contCombi++;
                    break;
            }
            System.out.println("Desea continuar? [S/N]: ");
            resp = Leer.next().charAt(0);
        } while (resp == 'S');
        // Reportes
        System.out.println("\nReporte de pasajes");
        System.out.println("Omnibus \t\tMinivan \t\tCombi");
        System.out.println("Manana \t\t" + acumOmManana + "\t\t" + acumMiniManana + "\t\t" + acumCombiManana);
        System.out.println("Tarde \t\t" + acumOmTarde + "\t\t" + acumMiniTarde + "\t\t" + acumCombiTarde);
        System.out.println("Noche \t\t" + acumOmNoche + "\t\t" + acumMiniNoche + "\t\t" + acumCombiNoche);
        System.out.println("Total \t\t" + (acumOmManana + acumOmTarde + acumOmNoche) + "\t\t"
                + (acumMiniManana + acumMiniTarde + acumMiniNoche) + "\t\t"
                + (acumCombiManana + acumCombiTarde + acumCombiNoche));
        System.out.println("Total de pasajes \t\t" + (contOmni + contMini + contCombi));
    }
}
