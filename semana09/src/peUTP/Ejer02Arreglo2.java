package peUTP;

public class Ejer02Arreglo2 {
    public static void main(String[] args) {
        // Inicialización de un arreglo
        int edad[] = { 10, 5, 20, 15, 30, 25, 55 };
        String nombre[] = { "Cesar", "Adam", "Amir", "Anderly", "Rogger", "Max", "Edder" };
        // Usar while para recorrer el arreglo y mostrar los datos
        int i = 0;
        while (i < edad.length) {
            System.out.println(nombre[i] + "\t\t" + edad[i]);
            i++;
        }
    }
}
