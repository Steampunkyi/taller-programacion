package pe.utp.model;

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

    // Metodos get y set
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

    // Metodo verDatos
    @Override
    public String verDatos() {
        String datos = "DNI: " + dni + "\n" + "Nombre: " + nombres + "\n" + "Apellidos: " + apellidos + "\n" + "Sexo: "
                + sexo + "\n" + "Direccion: " + direccion;
        return datos;
    }
}