package pe.utp.service;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class OpcionMenu {
    Scanner IngresoMenu = new Scanner(System.in);
    DecimalFormat FormatoDinero = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Cuenta> data = new HashMap<Integer, Cuenta>();

    public void getIngreso() throws IOException {
        boolean end = false;
        int NumCliente = 0;
        int NumPin = 0;
        while (!end) {
            try {
                System.out.print("\nIngrese el numero de cliente : ");
                NumCliente = IngresoMenu.nextInt();
                System.out.print("\nIngrese su numero de PIN: ");
                NumPin = IngresoMenu.nextInt();
                Iterator nr = data.entrySet().iterator();
                while (nr.hasNext()) {
                    Map.Entry par = (Map.Entry) nr.next();
                    Cuenta cuenta1 = (Cuenta) par.getValue();
                    if (data.containsKey(NumCliente) && NumPin == cuenta1.getNumPin()) {
                        getTipoCuenta(cuenta1);
                        end = true;
                        break;
                    }
                }
                if (!end) {
                    System.out.println("\nEl numero de cliente o numero de Pin son incorrectos");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nLos caracteres son invalidos.Solo ingree numero.");
            }
        }
    }

    public void getTipoCuenta(Cuenta cuenta1) {
        boolean end = false;
        while (!end) {
            try {
                System.out.println("\nSelleccione la cuenta a la que deasea acceder: ");
                System.out.println("Opción 1 - Cuenta de cheques");
                System.out.println("Opción 2 - Cuenta de ahorro");
                System.out.println("Opción 3 - Salir");
                System.out.print("\nEleccion: ");

                int seleccion = IngresoMenu.nextInt();

                switch (seleccion) {
                    case 1:
                        getCheque(cuenta1);
                        break;
                    case 2:
                        getAhorro(cuenta1);
                        break;
                    case 3:
                        end = true;
                        break;
                    default:
                        System.out.println("\nElección inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nElección inválida.");
                IngresoMenu.next();
            }
        }
    }

    public void getCheque(Cuenta cuenta1) {
        boolean end = false;
        while (!end) {
            try {
                System.out.println("\nCuenta de Cheques: ");
                System.out.println("Opción 1 - Ver saldo");
                System.out.println("Opción 2 - Retirar Fondos");
                System.out.println("Opción 3 - Fondos de Deposito");
                System.out.println("Opción 4 - Tranferir Fondos");
                System.out.println("Opción 5 - Salir");
                System.out.print("\nElección: ");
                int seleccion = IngresoMenu.nextInt();
                switch (seleccion) {
                    case 1:
                        System.out.println(
                                "\nSaldo de la cuenta corriente : "
                                        + FormatoDinero.format(cuenta1.getBalanceCorriente()));
                        break;
                    case 2:
                        cuenta1.getIngresoCompAhorro();
                        break;
                    case 3:
                        cuenta1.getIngresoCompDeposito();
                        break;

                    case 4:
                        cuenta1.getIngresoTransferencia("Comprobaciones");
                        break;
                    case 5:
                        end = true;
                        break;
                    default:
                        System.out.println("\nElección inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nElección inválida.");
                IngresoMenu.next();
            }
        }
    }

    public void getAhorro(Cuenta cuenta2) {
        boolean end = false;
        while (!end) {
            try {
                System.out.println("\nCuenta de Ahorro: ");
                System.out.println("Opción 1 - Ver Saldo");
                System.out.println("Opción 2 - Retirar Fondos");
                System.out.println("Opción 3 - Fondos de Deposito");
                System.out.println("Opción 4 - Transferir Fondos");
                System.out.println("Opción 5 - Salir");
                System.out.print("Elección: ");
                int seleccion = IngresoMenu.nextInt();
                switch (seleccion) {
                    case 1:
                        System.out.println(
                                "\nSaldo de la cuenta de ahorros: " + FormatoDinero.format(cuenta2.getBalanceAhorro()));
                        break;
                    case 2:
                        cuenta2.getIngresoAhorroRetiro();
                        break;
                    case 3:
                        cuenta2.getIngresoDepositoAhorro();
                        break;
                    case 4:
                        cuenta2.getIngresoTransferencia("Ahorros");
                        break;
                    case 5:
                        end = true;
                        break;
                    default:
                        System.out.println("\nElección Inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nElección Inválida.");
                IngresoMenu.next();
            }
        }
    }

    public void CrearCuenta() throws IOException {
        int nro1 = 0;
        boolean end = false;
        while (!end) {
            try {
                System.out.println("\nIngrese su numero de cliente  ");
                nro1 = IngresoMenu.nextInt();
                Iterator nr = data.entrySet().iterator();
                while (nr.hasNext()) {
                    Map.Entry par = (Map.Entry) nr.next();
                    if (!data.containsKey(nro1)) {
                        end = true;
                    }
                }
                if (!end) {
                    System.out.println("\nEste número de cliente ya está registrado");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nElección inválida.");
                IngresoMenu.next();
            }
        }
        System.out.println("\nIngrese el PIN para registrarse");
        int pin = IngresoMenu.nextInt();
        data.put(nro1, new Cuenta(nro1, pin));
        System.out.println("\nSu nueva cuenta se ha registrado exitosamente!");
        System.out.println("\nRedirigiendo para iniciar sesión.............");
        getIngreso();
    }

    public void MenuPrincipal() throws IOException {
        data.put(123456, new Cuenta(123456, 191904, 1000, 5000));
        data.put(123, new Cuenta(123, 123, 20000, 50000));
        boolean end = false;
        while (!end) {
            try {
                System.out.println("\nOpción 1 - Inicio de sección");
                System.out.println("Opción 2 - Crear una cuenta");
                System.out.print("\nElección: ");
                int choice = IngresoMenu.nextInt();
                switch (choice) {
                    case 1:
                        getIngreso();
                        end = true;
                        break;
                    case 2:
                        CrearCuenta();
                        end = true;
                        break;
                    default:
                        System.out.println("\nElección inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nElección inválida.");
                IngresoMenu.next();
            }
        }
        System.out.println("\nGracias por usar este Cajero Automático.\n");
        IngresoMenu.close();
        System.exit(0);
    }
}
