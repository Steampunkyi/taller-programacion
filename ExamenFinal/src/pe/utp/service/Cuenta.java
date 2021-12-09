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

    // input cambiado a Leer
    Scanner Leer = new Scanner(System.in);
    // Lo que está entre comillas está trabajando en dólares, no lo toco
    DecimalFormat dineroFormato = new DecimalFormat("'$'###,##0.00");

    public Cuenta() {
    }

    // Cambie los customerNumber y NumeroPin por las variables modificadas
    public Cuenta(int NumCliente, int NumPin) {
        this.NumCliente = NumCliente;
        this.NumPin = NumPin;
    }

    // checkingBalance y savingBalance por BalanceCorriente y BalanceAhorro
    public Cuenta(int NumCliente, int NumPin, double BalanceCorriente, double BalanceAhorro) {
        this.NumCliente = NumCliente;
        this.NumPin = NumPin;
        this.BalanceCorriente = BalanceCorriente;
        this.BalanceAhorro = BalanceAhorro;
    }

    // Modifico el “int customerNumber” por “int NumCliente”, igualmente en el this
    // y return
    public int setNumCliente(int NumCliente) {
        this.NumCliente = NumCliente;
        return NumCliente;
    }

    // Modifico el return
    public int getNumCliente() {
        return NumCliente;
    }

    // Modifico el “NumeroPin” por “NumPin” en int, this y return
    public int setNumPin(int NumPin) {
        this.NumPin = NumPin;
        return NumPin;
    }

    public int getNumPin() {
        return NumPin;
    }

    // Modifico el return
    public double getBalanceCorriente() {
        return BalanceCorriente;
    }

    public double getBalanceAhorro() {
        return BalanceAhorro;
    }

    // Cambio “amount” por “monto”
    public double calcComprobacionRetiro(double monto) {
        BalanceCorriente = (BalanceCorriente - monto);
        return BalanceCorriente;
    }

    // Igualmente acá
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

    // Modificación de checking y saving
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
                // Modificando los que println, moneyFormat por dineroFormato como líneas arriba
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
                // El “e” de inputMismatchException no sé si se tendría que modificar, lo dejo a
                // tu critero
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
                // El “e” de inputMismatchException no sé si se tendría que modificar, lo dejo a
                // tu critero
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
                // Modificado moneyFormat por dineroFormato
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
                // Igualmente acá, el “e”
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
                // Igualmente acá, el “e”
            } catch (InputMismatchException e) {
                System.out.println("\nSelección incorrecta.");
                Leer.next();
            }
        }
    }

    // accType cambiado por TipoCuenta
    public void getIngresoTransferencia(String TipoCuenta) {
        boolean end = false;
        while (!end) {
            try {
                // ”Checkings” cambiado a “Corriente”
                if (TipoCuenta.equals("Corriente")) {
                    System.out.println("\nSeleccione una cuenta a la que desee transferir fondos: ");
                    // Savings cambiado por Ahorros
                    System.out.println("1. Ahorros");
                    System.out.println("2. Salir");
                    System.out.print("\nSelección: ");
                    // choice modificado por selec
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
                    // Savings modificado por Ahorros
                } else if (TipoCuenta.equals("Ahorros")) {
                    System.out.println("\nSeleccione una cuenta a la que desee transferir fondos: ");
                    // Checking cambiado por Corriente
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
                // El “e” nuevamente
            } catch (InputMismatchException e) {
                System.out.println("\nSelección incorrecta.");
                Leer.next();
            }
        }
    }
}