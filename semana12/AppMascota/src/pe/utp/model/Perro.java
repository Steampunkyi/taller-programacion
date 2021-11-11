package pe.utp.model;

public class Perro {
    // Atributos
    String nombre;
    String color;
    double peso;
    String raza;

    // Metodos constructores: Permite crear el objeto
    public Perro() {

    }

    public Perro(String nombre, String color, double peso, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.raza = raza;
    }

    // Metodos sin parametros y no tiene retorno = procedimientos
    public void ladrar() {
        System.out.println("Guau, Guau");
    }

    // Metodos sin parametros y no tiene retorno, usa un atributo = funciones
    public void caminar() {
        System.out.println(nombre + " se encuentra caminando feliz.");
    }

    // Metodos con parametros y no tiene retorno, usa un atributo y requiere un
    // parametro.
    public void comer(String comida) {
        System.out.println(nombre + " esta comiendo " + comida);
    }
}