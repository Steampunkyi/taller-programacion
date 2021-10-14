package peUTP;

import java.util.Scanner;

public class Ejer04SmartPhones {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int nro, contBaja = 0, contMedia = 0, contAlta = 0;
        double acum = 0;
        System.out.println("Ingrese el nro de telefono: ");
        nro = Leer.nextInt();
        double precio[] = new double[nro];
        String gama[] = new String[nro];
        // For para capturar datos e ingresar al arreglo
        for (int i = 0; i < nro; i++) {
            do {
                System.out.println("Ingrese el precio del telefono" + (i + 1) + ": ");
                precio[i] = Leer.nextDouble();
            } while (precio[i] < 550 || precio[i] > 8000);
            // Condicionar el precio para identificar la gama
            if (precio[i] >= 500 && precio[i] <= 1000) {
                gama[i] = "Gaman Baja";
                contBaja++;
            } else if (precio[i] > 1000 && precio[i] <= 2500) {
                gama[i] = "Gama Media";
                contMedia++;
            } else {
                gama[i] = "Gama Alta";
                contAlta++;
            }
            // Acumular todos los precios
            acum += precio[i];
        }
        // Mostrar resultados
        System.out.println("Precio \tGama");
        for (int i = 0; i < nro; i++) {
            System.out.println(precio[i] + "\t" + gama[i]);
        }
        System.out.println("===========================");
        System.out.println("Nro. de telefonos de gama baja: " + contBaja);
        System.out.println("Nro. de telefonos de gama media: " + contMedia);
        System.out.println("Nro. de telefonos de gama alta: " + contAlta);
        System.out.println("Importe general: " + (acum));
    }
}
