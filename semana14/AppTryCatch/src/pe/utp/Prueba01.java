package pe.utp;

import java.util.Scanner;

public class Prueba01 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        try {
            System.out.println("Ingrese el numero de ejercicios");
            int num = Leer.nextInt();
            int datos[] = new int[num];

            System.out.println("Ingrese numero 1: ");
            int nro1 = Leer.nextInt();
            System.out.println("Ingrese numero 2: ");
            int nro2 = Leer.nextInt();
            int resp = nro1 / nro2;
            System.out.println("Respuesta: " + resp);

        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Error: no se puede asignar un dato a una referencia inexistente");
        } catch (NegativeArraySizeException ex) {
            System.out.println("Error: no se puede crear un arreglo con un valor negativo");
        } catch (ArithmeticException ex) {
            System.out.println("No se puede dividir un entero entre 0.");
        } catch (Exception ex) {
            System.out.println("Error: verifique la entrada de datos.");
        } finally {
            System.out.println("Proceso concluido.");
        }
    }
}
