package pe.utp.model;

public class Persona {
    // Atributos
    protected String dni;
    protected String apellidos;
    protected String nombres;

    // Metodos constructores
    public Persona() {
    }

    public Persona(String dni, String apellidos, String nombres) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    // Metodos get y set
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

    // Metodo ver nombre completo
    public void verNombreCompleto() {
        System.out.println("Nombre completo: " + this.nombres + ", " + this.apellidos);
    }

    // Metodo ver datos
    public String verDatos() {
        String datos = "DNI: " + dni + "\n" + "Nombre: " + nombres + "\n" + "Apellidos: " + apellidos;
        return datos;
    }
}