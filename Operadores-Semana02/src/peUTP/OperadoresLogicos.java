package peUTP;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Variables
        int v1 = 25;
        int v2 = 10;
        int v3 = 10;
        // Proceso y reporte
        System.out.println("v1 es igual a v2 Y v2 es mayor que v3?: " + ((v1 == v2) && (v2 > v3)));
        System.out.println("v2 es distinto a v3 O v2 es igual a v1?: " + ((v2 != v3) || (v2 == v1)));
        System.out.println("v1 es mayor que v2, pero es negado, entonces es: " + !(v1 > v2));
    }
}
