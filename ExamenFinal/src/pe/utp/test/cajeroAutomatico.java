package pe.utp.test;

import java.io.IOException;

import pe.utp.service.OpcionMenu;

public class cajeroAutomatico {
    public static void main(String[] args) throws IOException {
        OpcionMenu opcionMenu = new OpcionMenu();
        introduccion();
        opcionMenu.MenuPrincipal();
    }

    public static void introduccion() {
        System.out.println("¡Bienvenido al Banco UTP!");
    }
}
