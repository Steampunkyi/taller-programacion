package pe.utp.model;

public class Laptop extends Computadora {
    private double tamanoPantalla;
    private String tipoTeclado;

    // Metodo constructor
    public Laptop() {

    }

    public Laptop(double tamanoPantalla, String tipoTeclado, String codigo, String marca, double precio) {
        super(codigo, marca, precio);
        this.tamanoPantalla = tamanoPantalla;
        this.tipoTeclado = tipoTeclado;
    }

    // Metodos get y set
    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getTipoTeclado() {
        return tipoTeclado;
    }

    public void setTipoTeclado(String tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    }

    // Metodo ver tipo teclado
    public void verTipoTeclado() {
        System.out.println("El tipo de teclado es: " + this.tipoTeclado);
    }

    // Metodo ver datos
    public String verDatos() {
        String datos = "Codigo: " + codigo + "\nMarca: " + marca + "\nPrecio: " + precio + "\nTamano de pantalla: "
                + tamanoPantalla + "\nTipo de teclado: " + tipoTeclado;
        return datos;
    }

    @Override
    public void mostrarPrecio() {
        System.out.println("El precio de la laptop es: " + precio);
    }

}
