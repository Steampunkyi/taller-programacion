package pe.UTP;

public class ejerForBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Valor de i: " + i);
        }
    }
}
