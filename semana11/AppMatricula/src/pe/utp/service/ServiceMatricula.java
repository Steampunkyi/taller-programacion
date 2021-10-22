package pe.utp.service;

public class ServiceMatricula {
    // Crear el metodo que permite calcular el importe de la matricula
    public double calcularIPago(double importe, double prom) {
        double ipago;
        if (prom <= 20 && prom >= 18) {
            ipago = importe - importe * 0.5;
        } else if (prom < 18 && prom >= 15) {
            ipago = importe - importe * 0.3;
        } else {
            ipago = importe;
        }
        return ipago;
    }
}
