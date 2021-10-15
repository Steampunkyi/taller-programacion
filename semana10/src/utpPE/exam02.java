package utpPE;

import java.util.Scanner;

public class exam02 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Variables de venta para farmacia
        int hora, cantVenta, cantidad, cont = 0;
        double acum = 0, precio, descuento, total, neto, promedio = 0;
        String dia;
        // for para capturar datos e ingresar las variables
        System.out.println("Cuantas veces va a comprar usted?: ");
        cantVenta = Leer.nextInt();
        for (int i = 0; i < cantVenta; i++) {
            System.out.println("Ingrese el dia de la venta");
            dia = Leer.next();
            System.out.println("Ingrese la hora de la venta");
            hora = Leer.nextInt();
            System.out.println("Ingrese la cantidad de medicamentos vendidos");
            cantidad = Leer.nextInt();
            System.out.println("Ingrese el precio del medicamento");
            precio = Leer.nextDouble();
            // Condicional para determinar el descuento
            if (dia.equals("miercoles") && hora >= 12 && hora <= 24) {
                descuento = precio * 0.15;
            } else {
                descuento = 0;
            }
            neto = precio * cantidad;
            // Contador
            cont++;
            // Total
            total = neto - descuento;
            // Acumulador
            acum += total;
        }
        // Calcular el promedio de venta
        promedio = acum / cont;
        // Imprimir resultados
        System.out.println("La cantidad de compras fue: " + cont);
        System.out.println("El promedio de venta es: " + promedio);
    }
}