package pe.utp.test;

import pe.utp.model.Perro;

public class Prueba01 {
    public static void main(String[] args) {
        // Crear una instancia u objeto de la clase Perro
        Perro perro1 = new Perro("Boby", "Blanco", 20.9, "Siberiano");
        // Acceder a los metodos
        System.out.println("Datos del objeto 1");
        perro1.ladrar();
        perro1.caminar();
        perro1.comer("Croquetas");

        System.out.println("==========================");
        Perro perro2 = new Perro("Firulais", "Negro", 40.5, "Pastor Aleman");
        perro2.ladrar();
        perro2.caminar();
        perro2.comer("Pollo a la brasa");

    }
}
