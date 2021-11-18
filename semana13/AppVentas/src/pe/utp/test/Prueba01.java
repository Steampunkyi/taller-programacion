package pe.utp.test;

import pe.utp.model.Cliente;
import pe.utp.model.Empleado;
import pe.utp.model.Persona;

public class Prueba01 {
    public static void main(String[] args) {
        // Crear una instancia del tipo cliente
        System.out.println("DATOS COMPLETOS DEL CLIENTE");
        Persona per1 = new Cliente("12312313", "Alacon Tello", "Gianmarco", 'M', "Av. Frutales 123");
        // Polimorfismo
        System.out.println(per1.verDatos());
        per1.verNombreCompleto();
        System.out.println("=======================================");

        // Crear una instancia del tipo empleado
        System.out.println("DATOS COMPLETOS DEL EMPLEADO");
        Persona per2 = new Empleado("4565464565", "Romero Arriola", "Brian Kevin", "Gerente", 8900);
        System.out.println(per2.verDatos());
        per2.verNombreCompleto();
        System.out.println("=======================================");

        System.out.println("DATOS DEL NUEVO OBJETO CLIENTE");
        Cliente per3 = new Cliente();
        // Usar los metodos set para asignar datos al nuevo cliente
        per3.setDni("12345678");
        per3.setApellidos("Prado Masones");
        per3.setNombres("Maria del Carmen");
        per3.setSexo('F');
        per3.setDireccion("Av. Los Pinos 123");
        // Usar los metodos get para consultar datos
        System.out.println("Clente: " + per3.getApellidos() + ", " + per3.getNombres());

    }
}
