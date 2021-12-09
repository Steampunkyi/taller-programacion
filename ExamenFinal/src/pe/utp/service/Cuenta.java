package pe.utp.service;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cuenta {
    // variables de interfaz
    private int NumCliente;
    private int NumPin;
    private double BalanceCorriente = 0;
    private double BalanceAhorro = 0;

    Scanner Leer = new Scanner(System.in);
    DecimalFormat dineroFormato = new DecimalFormat("'$'###,##0.00");

    public Cuenta() {
    }

    public Cuenta(int NumCliente, int NumPin) {
        this.NumCliente = NumCliente;
        this.NumPin = NumPin;
    }

    public Cuenta(int NumCliente, int NumPin, double BalanceCorriente, double BalanceAhorro) {
        this.NumCliente = NumCliente;
        this.NumPin = NumPin;
        this.BalanceCorriente = BalanceCorriente;
        this.BalanceAhorro = BalanceAhorro;
    }

    public int setNumCliente(int NumCliente) {
        this.NumCliente = NumCliente;
        return NumCliente;
    }

    public int getNumCliente() {
        return NumCliente;
    }

    public int setNumPin(int NumPin) {
        this.NumPin = NumPin;
        return NumPin;
    }

    public int getNumPin() {
        return NumPin;
    }

    public double getBalanceCorriente() {
        return BalanceCorriente;
    }

    public double getBalanceAhorro() {
        return BalanceAhorro;
    }

    public double calcComprobacionRetiro(double monto) {
        BalanceCorriente = (BalanceCorriente - monto);
        return BalanceCorriente;
    }

    public double calcAhorroRetiro(double monto) {
        BalanceAhorro = (BalanceAhorro - monto);
        return BalanceAhorro;
    }

    public double calcComprobacionDeposito(double monto) {
        BalanceCorriente = (BalanceCorriente + monto);
        return BalanceCorriente;
    }

    public double calcDepositoAhorro(double monto) {
        BalanceAhorro = (BalanceAhorro + monto);
        return BalanceAhorro;
    }

    public void calcComprobacionTransferencia(double monto) {
        BalanceCorriente = BalanceCorriente - monto;
        BalanceAhorro = BalanceAhorro + monto;
    }

    public void calcTransferenciaAhorro(double monto) {
        BalanceAhorro = BalanceAhorro - monto;
        BalanceCorriente = BalanceCorriente + monto;
    }

    public void getIngresoCompAhorro() {
        boolean end = false;
        while (!end) {
            try {
                System.out.println("\nSaldo actual de la cuenta corriente: " + dineroFormato.format(BalanceCorriente));
                System.out.print("\nCantidad que desea retirar de la cuenta corriente: ");
                double monto = Leer.nextDouble();
                if ((BalanceCorriente - monto) >= 0 && monto >= 0) {
                    calcComprobacionRetiro(monto);
                    System.out.println(
                            "\nSaldo actual de la cuenta corriente: " + dineroFormato.format(BalanceCorriente));
                    end = true;
                } else {
                    System.out.println("\nEl monto en la cuenta no puede ser negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nSelección incorrecta.");
                Leer.next();
            }
        }
    }

    public void getIngresoAhorroRetiro() {
        boolean end = false;
        while (!end) {
            try {
                System.out.println("\nSaldo actual en la cuenta de ahorros: " + dineroFormato.format(BalanceAhorro));
                System.out.print("\nCantidad que desea retirar de la cuenta de ahorros: ");
                double monto = Leer.nextDouble();
                if ((BalanceAhorro - monto) >= 0 && monto >= 0) {
                    calcAhorroRetiro(monto);
                    System.out
                            .println("\nSaldo actual de la cuenta de ahorros: " + dineroFormato.format(BalanceAhorro));
                    end = true;
                } else {
                    System.out.println("\nEl monto en la cuenta no puede ser negativo");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nSelección incorrecta");
                Leer.next();
            }
        }
    }

    public void getIngresoCompDeposito() {
        boolean end = false;
        while (!end) {
            try {
                System.out.println("\nSaldo actual en la cuenta corriente: " + dineroFormato.format(BalanceCorriente));
                System.out.print("\nCantidad que desea depositar a la cuenta corriente: ");
                double monto = Leer.nextDouble();
                if ((BalanceCorriente + monto) >= 0 && monto >= 0) {
                    calcComprobacionDeposito(monto);
                    System.out.println(
                            "\nSueldo actual de la cuenta corriente: " + dineroFormato.format(BalanceCorriente));
                    end = true;
                } else {
                    System.out.println("\nEl monto en la cuenta no puede ser negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nSelección incorrecta.");
                Leer.next();
            }
        }
    }

    public void getIngresoDepositoAhorro() {
        boolean end = false;
        while (!end) {
            try {
                System.out.println("\nSaldo actual en la cuenta de ahorros: " + dineroFormato.format(BalanceAhorro));
                System.out.print("\nCantidad que desea depositar en su cuenta de ahorros: ");
                double monto = Leer.nextDouble();

                if ((BalanceAhorro + monto) >= 0 && monto >= 0) {
                    calcDepositoAhorro(monto);
                    System.out
                            .println("\nSaldo actual de la cuenta de ahorros: " + dineroFormato.format(BalanceAhorro));
                    end = true;
                } else {
                    System.out.println("\nEl monto en la cuenta no puede ser negativo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nSelección incorrecta.");
                Leer.next();
            }
        }
    }

    public void getIngresoTransferencia(String TipoCuenta) {
        boolean end = false;
        while (!end) {
            try {
                if (TipoCuenta.equals("Corriente")) {
                    System.out.println("\nSeleccione una cuenta a la que desee transferir fondos: ");
                    System.out.println("1. Ahorros");
                    System.out.println("2. Salir");
                    System.out.print("\nSelección: ");
                    int selec = Leer.nextInt();
                    switch (selec) {
                        case 1:
                            System.out.println(
                                    "\nSaldo actual de la cuenta corriente" + dineroFormato.format(BalanceCorriente));
                            System.out.print("\nCantidad que desea depositar en su cuenta de ahorros: ");
                            double monto = Leer.nextDouble();
                            if ((BalanceAhorro + monto) >= 0 && (BalanceCorriente - monto) >= 0 && monto >= 0) {
                                calcComprobacionTransferencia(monto);
                                System.out.println("\nSaldo actual en la cuenta de ahorros: "
                                        + dineroFormato.format(BalanceAhorro));
                                System.out.println(
                                        "\nSaldo actual en la cuenta corriente: "
                                                + dineroFormato.format(BalanceCorriente));
                                end = true;
                            } else {
                                System.out.println("\nEl monto en la cuenta no puede ser negativo.");
                            }
                            break;
                        case 2:
                            return;
                        default:
                            System.out.println("\nSelección incorrecta.");
                            break;
                    }
                } else if (TipoCuenta.equals("Ahorros")) {
                    System.out.println("\nSeleccione una cuenta a la que desee transferir fondos: ");
                    System.out.println("1. Corriente");
                    System.out.println("2. Salir");
                    System.out.print("\nSelección:  ");
                    int selec = Leer.nextInt();
                    switch (selec) {
                        case 1:
                            System.out.println(
                                    "\nSaldo actual en la cuenta de ahorros: " + dineroFormato.format(BalanceAhorro));
                            System.out.print("\nCantidad que desea depositar en su cuenta de ahorros: ");
                            double monto = Leer.nextDouble();
                            if ((BalanceCorriente + monto) >= 0 && (BalanceAhorro - monto) >= 0 && monto >= 0) {
                                calcTransferenciaAhorro(monto);
                                System.out.println("\nSaldo actual en la cuenta corriente: "
                                        + dineroFormato.format(BalanceCorriente));
                                System.out.println("\nSaldo actual en la cuenta de ahorros: "
                                        + dineroFormato.format(BalanceAhorro));
                                end = true;
                            } else {
                                System.out.println("\nEl monto en la cuenta no puede ser negativo.");
                            }
                            break;
                        case 2:
                            return;
                        default:
                            System.out.println("\nSeleción incorrecta.");
                            break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("\nSelección incorrecta.");
                Leer.next();
            }
        }
    }
}