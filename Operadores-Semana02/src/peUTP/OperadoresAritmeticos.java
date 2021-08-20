package peUTP;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        // Variables
        int valor1 = 12;
        int valor2 = 4;
        int suma, resta, multi, divi, modulo;
        // Proceso
        suma = valor1 + valor2;
        resta = valor1 - valor2;
        multi = valor1 * valor2;
        divi = valor1 / valor2;
        modulo = valor1 % valor2;
        // Imprimir resultados
        System.out.println("RESULTADOS OBTENIDOS");
        System.out.println("Suma de " + valor1 + " y " + valor2 + " es " + suma);
        System.out.println("Resta de " + valor1 + " y " + valor2 + " es " + resta);
        System.out.println("Multiplicación de " + valor1 + " y " + valor2 + " es " + multi);
        System.out.println("División de " + valor1 + " y " + valor2 + " es " + divi);
        System.out.println("Módulo de " + valor1 + " y " + valor2 + " es " + modulo);
    }
}
