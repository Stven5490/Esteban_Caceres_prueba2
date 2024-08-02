package main.java.com.Tsoft.EmpresaTurismo.controlador;

import main.java.com.Tsoft.EmpresaTurismo.vista.Leer;

public class EmpresaTurismo {
    public static int menu() {
        System.out.println("Empresa de turismo");
        System.out.println("<================>");
        System.out.println("1.\tIngresar Medio de Alojamiento");
        System.out.println("2.\tMostrar medios de alojamiento");
        System.out.println("3.\tDatos de un cliente X");
        System.out.println("4.\tTotal adicional");
        System.out.println("5.\tTotal bono descuento");
        System.out.println("6.\tCantidad medios de alojamiento X");
        System.out.println("7.\tValor a cancelar por un cliente X");
        System.out.println("8.t\tAplicar incremento del valor base");
        System.out.println("9.t\tSalir");

        return Leer.datoInt();
    }
}
