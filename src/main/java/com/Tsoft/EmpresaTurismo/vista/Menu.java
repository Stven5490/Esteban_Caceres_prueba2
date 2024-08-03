package main.java.com.Tsoft.EmpresaTurismo.vista;

import main.java.com.Tsoft.EmpresaTurismo.controlador.ControladorAlojamientos;
import main.java.com.Tsoft.EmpresaTurismo.modelador.Cabagna;
import main.java.com.Tsoft.EmpresaTurismo.modelador.Carpa;
import main.java.com.Tsoft.EmpresaTurismo.modelador.Hotel;

import java.util.Scanner;

public class Menu {

    private static ControladorAlojamientos controlador = new ControladorAlojamientos();
    private static Scanner scanner = new Scanner(System.in);

    public static void mostrarMenu() {
        System.out.println("Empresa de Turismo");
        System.out.println("<================>");
        System.out.println("\nMenu");
        System.out.println("1.\tIngresar Medio de Alojamiento");
        System.out.println("2.\tMostrar medios de alojamiento");
        System.out.println("3.\tDatos de un cliente X");
        System.out.println("4.\tTotal adicional");
        System.out.println("5.\tTotal bono descuento");
        System.out.println("6.\tCantidad medios de alojamiento X");
        System.out.println("7.\tValor a cancelar por un cliente X");
        System.out.println("8.\tAplicar incremento del valor base");
        System.out.println("9.\tSalir");
        System.out.printf("Seleccione una opcion: ");
    }

    public static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                ingresarMedioAlojamiento();
                break;
            case 2:
                controlador.mostrarMediosAlojamiento();
                break;
            case 3:
                datosClienteX();
                break;
            case 4:
                System.out.println("Total adicional: " + controlador.totalAdicional());
                break;
            case 5:
                System.out.println("Total bono descuento: " + controlador.totalBonoDescuento());
                break;
            case 6:
                cantidadMediosAlojamientoX();
                break;
            case 7:
                valorACancelarClienteX();
                break;
            case 8:
                aplicarIncrementoValorBase();
                break;
            case 9:
                System.out.printf("Saliendo......");
                break;
            default:
                System.err.println("Opcion no validad.");
                System.err.println("Intente nuevamente.");
                break;
        }
    }
    public static void ingresarMedioAlojamiento() {
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el RUT del cliente");
        String rut = scanner.nextLine();

        System.out.println("Ingrese el valor base por noche: ");
        int valorBaseNoche = scanner.nextInt();
        System.out.println("Ingrese la cantidad de noches:");
        int cantidadNoches = scanner.nextInt();
        System.out.println("Ingrese el tipo de temporada: ");
        String tipoTemporada = scanner.nextLine();

        System.out.println("Seleccione el tipo de alojamiento");
        System.out.println("1. Carpa");
        System.out.println("2. Cabaña");
        System.out.println("3. Hotel");
        int tipoAlojamiento = scanner.nextInt();
        scanner.nextLine();
        switch (tipoAlojamiento) {
            case 1:
                System.out.println("Ingrese la cantidad de personas: ");
                int cantidadPersonas = scanner.nextInt();
                Carpa carpa = new Carpa(nombre, rut, valorBaseNoche, cantidadNoches, tipoTemporada, cantidadPersonas):
                controlador.ingresarMedioAlojamiento(carpa);
                break;
            case 2:
                System.out.println("Ingrese la capacidad de la cabaña:");
                int capacidadCabagna = scanner.nextInt();
                System.out.println("Es fumador? (siFuma/noFuma)");
                String siFuma = String.valueOf(true);
                String noFuma = String.valueOf(false);
                boolean esFumadorCabagna = scanner.nextBoolean();
                System.out.println("Tiene chimenea? (Si/No)");
                String Si = String.valueOf(true);
                String No = String.valueOf(false);
                boolean chimena = scanner.nextBoolean();
                Cabagna cabagna = new Cabagna(nombre, rut, valorBaseNoche, cantidadNoches, tipoTemporada, capacidadCabagna, esFumadorCabagna, chimena);
                controlador.ingresarMedioAlojamiento(cabagna);
                break;
            case 3:
                System.out.println("Ingrese la capacidad del hotel:");
                int capacidadHotel = scanner.nextInt();
                System.out.println("Es Fumador? (SiFuma/NoFuma)");
                String SiFuma = String.valueOf(true);
                String NoFuma = String.valueOf(false);
                boolean esFumadorHotel = scanner.nextBoolean();
                System.out.println("Con Desayuno? (conDesayuno/sinDesayuno)");
                String conDesayuno = String.valueOf(true);
                String sinDesayuno = String.valueOf(false);
                boolean Desayuno = scanner.nextBoolean();
                Hotel hotel = new Hotel(nombre, rut, valorBaseNoche, cantidadNoches, tipoTemporada, capacidadHotel, esFumadorHotel, Desayuno);
                controlador.ingresarMedioAlojamiento(hotel);
                break;
            default:
                System.err.println("Opcion de alojamiento no valida.");
                break;
        }
    }

}
