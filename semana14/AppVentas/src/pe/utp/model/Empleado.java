package pe.utp.model;

public class Empleado extends Persona {
	private String cargo;
	private double sueldo;

	public Empleado() {

	}

	public Empleado(String dni, String apellidos, String nombres, String cargo, double sueldo) {
		super(dni, apellidos, nombres);
		this.cargo = cargo;
		this.sueldo = sueldo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	// M�todo ver datos
	@Override
	public String verDatos() {
		String datos = "Dni: " + dni + "\nApellidos: " + apellidos + "\nNombres: " + nombres + "\nCargo: " + cargo
				+ "\nSueldo: " + sueldo;
		return datos;
	}

	@Override
	public void mostrarDni() {
		System.out.println("El dni de " + nombres + " es :" + dni);
	}
}
