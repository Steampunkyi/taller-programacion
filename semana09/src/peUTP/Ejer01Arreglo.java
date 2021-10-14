package peUTP;

public class Ejer01Arreglo {
    public static void main(String[] args) {
        // Declarar un arreglo
        String espec[] = new String[5];
        // Asignar datos
        espec[0] = "Pediatría";
        espec[1] = "Mediciona General";
        espec[2] = "Odontología";
        espec[3] = "Otorrinolaringología";
        espec[4] = "Cardiología";
        // Acceder al arreglo para mostrar los datos
        System.out.println("Indice 0, elemento " + espec[0]);
        System.out.println("==============================");
        // Usar una estructura repetitiva para recorrer el arreglo y mostrar los datos
        for (int i = 0; i < espec.length; i++) {
            System.out.println("Indice " + i + ", elemento " + espec[i]);
        }
    }
}
