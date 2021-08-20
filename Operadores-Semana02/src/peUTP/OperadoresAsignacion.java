package peUTP;

public class OperadoresAsignacion {

    public static void main(String[] args) {
        // Variables
        int v1 = 10;
        int v2 = 5;
        int v3 = 8;
        int v4 = 4;
        int v5 = 30;
        int v6 = 40;
        // Proceso
        v2 += v1; // v2 = v2 + v1;
        v3 -= v1;
        v4 *= v1;
        v5 /= v1;
        v6 %= v1;
        // Resultado o salida
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);
        System.out.println("v4 = " + v4);
        System.out.println("v5 = " + v5);
        System.out.println("v6 = " + v6);
    }
}
