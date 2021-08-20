package peUTP;

public class OperadoresRelacionales {

    public static void main(String[] args) {
        // Variables
        int v1 = 25;
        int v2 = 10;
        int v3 = 10;
        // Proceso y reporte
        System.out.println("v1 es igual a v2?: " + (v1 == v2));
        System.out.println("v1 es diferente a v2?: " + (v1 != v2));
        System.out.println("v3 es menor que v2?: " + (v3 < v1));
        System.out.println("v3 es mayor que v2?: " + (v3 > v2));
        System.out.println("v2 es menor igual que v1?: " + (v2 <= v1));
        System.out.println("v1 es mayor igual que v3?: " + (v1 >= v3));

    }
}
