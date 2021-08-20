package peUTP;

public class TiposDatos {
    public static void main(String[] args) {
        // Variables
        // Tipos de datos numéricos enteros
        byte a;
        short b;
        int c;
        long d;
        // Tipos de datos numericos reales
        float e;
        double f;
        // Tipos de datos de carater simple
        char g;
        // Tipos de dato booleano
        boolean h;
        // Asignar datos a cada una de las variables
        a = 127;
        b = 32767;
        c = 2147483647;
        d = 9223372036854775807L;
        e = 3.1416F;
        f = 3.141685454455141;
        g = '\u00e1';
        h = true;
        // Mostrar datos de variables
        System.out.println("TIPOS DE DATOS Y SUS CONTENIDOS");
        System.out.println("Tipo de dato Byte: " + a);
        System.out.println("Tipo de dato Short: " + b);
        System.out.println("Tipo de dato Int: " + c);
        System.out.println("Tipo de dato Long: " + d);
        System.out.println("Tipo de dato Float: " + e);
        System.out.println("Tipo de dato Double: " + f);
        System.out.println("Tipo de dato Char: " + g);
        System.out.println("Tipo de dato Boolean: " + h);
    }
}
