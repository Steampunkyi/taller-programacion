package peUTP;

public class tiposTriangulos {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String tipoTrianString;
        double lado, base, perimetro, acumEqui=0, acumIsos=0;
        int contEqui=0, contIsos=0;
        char resp = 'S';
        // Estructura repetitiva
        while (resp == 'S' || resp == 's') {
            System.out.println("Ingrese el tipo de triangulo: \nEquilatero / Isosceles");
            tipoTrianString = Leer.next().toLowerCase();
            // Condicionales
            if (tipoTrianString.equals("equilatero")) {
                System.out.println("Ingrese el lado del triangulo: ");
                lado = Leer.nextDouble();
                base = lado * 3;
                perimetro = lado * 3;
                acumEqui = acumEqui + perimetro;
                contEqui++;
            System.out.println("Desea continuar? [S/N]");
            resp = Leer.next().charAt(0);
}
