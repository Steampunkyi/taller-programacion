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

    // Metodos get y set
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

    // Metodo verDatos
    @Override
    public String verDatos() {
        String datos = "DNI: " + dni + "\n" + "Nombre: " + nombres + "\n" + "Apellidos: " + apellidos + "\n" + "Cargo: "
                + cargo + "\n" + "Sueldo: " + sueldo;
        return datos;
    }
}
