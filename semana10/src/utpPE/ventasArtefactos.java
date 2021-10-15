package utpPE;

import java.util.Scanner;

public class ventasArtefactos {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        double acum = 0;
        System.out.println("Ingrese el Nro. de ventas: ");
        int nro = Leer.nextInt();
        // Crear arreglos
        String prod[] = new String[nro]; // unidimensional
        int cant[] = new int[nro]; // unidimensional
        double importe[][] = new double[nro][3]; // bidimensional
        // Usar for para guardar los datos en el arreglo
        for (int i = 0; i < nro; i++) {
            System.out.println("Ingrese el nombre del producto: ");
            prod[i] = Leer.next();
            System.out.println("Ingrese la cantidad a comprar: ");
            cant[i] = Leer.nextInt();
            System.out.println("Ingrese el precio del producto: ");
            importe[i][0] = Leer.nextDouble();
            // Calcular el descuento
            importe[i][1] = cant[i] * importe[i][0] * 0.1;
            // Calcular el importe de pago
            importe[i][2] = cant[i] * importe[i][0] - importe[i][1];
            // Acumular los importes de pago
            acum += importe[i][2];
        }
        // Mostrar los resultados
        System.out.println("===================================================");
        System.out.println("Prod \tCant \tPrecio \tDesc \tImporte");
        for (int i = 0; i < importe.length; i++) {
            System.out.println(
                    prod[i] + " \t" + cant[i] + " \t" + importe[i][0] + " \t" + importe[i][1] + " \t" + importe[i][2]);
        }
        System.out.println("===================================================");
        System.out.println("Importe general: " + acum);
    }
}
