package peUTP;

import java.util.Scanner;

public class numerosImpares {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int num, cont = 0, acum = 0;
        System.out.println("Ingrese un numero");
        num = Leer.nextInt();
        do {
            cont++;
            num++;
            if (num % 2 == 1) {
                acum += num;
                System.out.println(num + " " + acum);
            }
        } while (cont < 30);
    }
}
