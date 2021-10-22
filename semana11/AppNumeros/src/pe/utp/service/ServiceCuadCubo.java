package pe.utp.service;

public class ServiceCuadCubo {
    // Metodo que permite calcular el cuadrado de un numero
    public int calcularCuadrado(int num) {
        int cuad = num * num;
        return cuad;
    }

    // Metodo que permite calcular el cubo de un numero
    public int calcularCubo(int num) {
        int cubo = num * num * num;
        return cubo;
    }

    public void mostrarBienvenida() {
        System.out.println("Bienvenido al servicio de calculo de cuadrados y cubos");
    }

}
