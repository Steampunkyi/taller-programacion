package pe.utp.test;

import pe.utp.model.Cliente;
import pe.utp.model.Empleado;
import pe.utp.model.Persona;

public class Prueba01 {
	public static void main(String[] args) {
		//Crear una instancia del tipo cliente
		System.out.println("DATOS DEL OBJETO CLIENTE");
		Persona per1 = new Cliente("98547485","Alarcon Tello","Gianmarco",'M',"Av. frutales 123");
		//Polimofismo
		System.out.println(per1.verDatos());
		per1.verNombreCompleto();
		System.out.println("=======================");
		
		//Crear una instancia del tipo empleado
		System.out.println("DATOS DEL OBJETO EMPLEADO");
		Persona per2 = new Empleado("41447485","Romero Arriola","Brian Kevin","Gerente",8900);
		System.out.println(per2.verDatos());
		per2.verNombreCompleto();
		System.out.println("=======================");
		
		System.out.println("DATOS DEL NUEVO OBJETO CLIENTE");
		Cliente per3 = new Cliente();
		//Usar los métodos set para asignar datos al nuevo cliente
		per3.setDni("56145214");
		per3.setApellidos("Prado Mesones");
		per3.setNombres("Maria Del Carmen");
		per3.setSexo('F');
		per3.setDireccion("Av. Lima 123");
		//Usar los métodos get para consultar datos
		System.out.println("Cliente: "+per3.getApellidos()+", "+per3.getNombres());
		System.out.println(per3.verDatos());
	}
}
