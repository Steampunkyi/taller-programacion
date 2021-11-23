package pe.utp.model;

// Aplicar herencia
public class Cliente extends Persona {
	// Atributos
	private char sexo;
	private String direccion;

	// Metodos constructores
	public Cliente() {

	}

	public Cliente(String dni, String apellidos, String nombres, char sexo, String direccion) {
		super(dni, apellidos, nombres);
		this.sexo = sexo;
		this.direccion = direccion;
	}

	// M�todos get y set
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	// M�todo verDatos
	@Override
	public String verDatos() {
		String datos = "Dni: " + dni + "\nApellidos: " + apellidos + "\nNombres: " + nombres + "\nSexo: " + sexo
				+ "\nDireccion: " + direccion;
		return datos;
	}

	@Override
	public void mostrarDni() {
		System.out.println("El dni de " + nombres + " es :" + dni);
	}
}
