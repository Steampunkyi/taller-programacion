package pe.utp.model;

public class Smartphone {
    // Atributos
    String marca;
    String modelo;
    double precio;
    int fecLanz;

    // Metodos constructores
    // Constructor vacio
    public Smartphone() {
        // TODO Auto-generated constructor stub
    }

    // Constructor con parametros
    public Smartphone(String marca, String modelo, double precio, int fecLanz) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.fecLanz = fecLanz;

    }

    // Metodo llamar
    public void llamar(String nombre) {
        System.out.println("Llamado a " + nombre);
    }

    // Metodo mostrarMensaje
    public void mostrarMensaje(String nombre) {
        System.out.println("Hola " + nombre + " mensaje enviado");
    }

    // Metodo verCaracteristicas
    public void verCaracteristicas() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
        System.out.println("Fecha de lanzamiento: " + fecLanz);
    }

    // Metodo Get: Permite consultar datos del objeto
    // Metodo Set: Permite asignar o actualizar datos del objeto
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getFecLanz() {
        return fecLanz;
    }

    public void setFecLanz(int fecLanz) {
        this.fecLanz = fecLanz;
    }
}