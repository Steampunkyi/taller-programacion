package pe.utp.model;

public abstract class Computadora {
    // Atributos
    protected String codigo;
    protected String marca;
    protected Double precio;

    // Metodos constructores
    public Computadora() {
    }

    public Computadora(String codigo, String marca, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.precio = precio;
    }

    // Metodos get y set
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    // Metodo ver nombre completo
    public String verDatos() {
        String datos = "Codigo: " + codigo + "\n" + "Marca: " + marca;
        return datos;
    }

    // Metodo ver precio
    public String verPrecio() {
        String datos = "Precio: " + precio;
        return datos;
    }

    // Metodo abstracto
    public abstract void mostrarPrecio();
}
