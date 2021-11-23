package pe.utp.model;

public abstract class Persona {
	// Atributos
	protected String dni;
	protected String apellidos;
	protected String nombres;

	// M�todos constructores
	public Persona() {

	}

	public Persona(String dni, String apellidos, String nombres) {
		super();
		this.dni = dni;
		this.apellidos = apellidos;
		this.nombres = nombres;
	}

	// M�todos get y set
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	// M�todo ver nombre completo
	public void verNombreCompleto() {
		System.out.println("Nombre completo: " + this.apellidos + ", " + this.nombres);
	}

	// M�todo ver datos
	public String verDatos() {
		String datos = "Dni: " + dni + "\nApellidos: " + apellidos + "\nNombres: " + nombres;
		return datos;
	}

	// M�todo abstracto
	public abstract void mostrarDni();
}
