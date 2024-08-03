package main.java.com.Tsoft.EmpresaTurismo.vista;

import main.java.com.Tsoft.EmpresaTurismo.controlador.*;

import java.util.Scanner;

import static main.java.com.Tsoft.EmpresaTurismo.vista.Menu.*;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            ejecutarOpcion(opcion);
        } while (opcion != 9);
    }
}
