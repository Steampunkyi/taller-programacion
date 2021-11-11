package pe.utp.test;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import pe.utp.model.Smartphone;

public class Prueba01 {
    public static void main(String[] args){
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de telefono");
        int nro = Leer.nextInt();
        for (int i=0; i<nro; i++){
            System.out.println("Ingrese la marca del telefono");
            String marca = Leer.next();
            System.out.println("Ingrese el modelo de telefono");
            String modelo = Leer.next();
            System.out.println("Ingrese el precio del telefono");
            double precio = Leer.nextDouble();
            System.out.println("Ingrese el año de lanzamiento");
            int fecLanz = Leer.nextInt();
            // Crear el objero a partir de los datos capturados
            Smartphone cel1 = new Smartphone(marca, modelo, precio, fecLanz);
            // Llamar al metodo ver caracteristicas
            cel1.verCaracteristicas();
            // Hacer uso del metodo set
            cel1.setModelo("P40 Pro");
            // Hacer uso del metodo get
            System.out.println("Marca: "+cel1.getMarca());
            System.out.println("Modelo: "+cel1.getModelo());
            System.out.println("==================================");
    }
}
