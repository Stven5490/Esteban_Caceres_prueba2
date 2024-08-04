package main.java.com.Tsoft.EmpresaTurismo.controlador;

import main.java.com.Tsoft.EmpresaTurismo.modelador.*;

import java.util.HashMap;
import java.util.Map;

public class ControladorAlojamientos {
    private Map<String, MediosDeAlojamiento> alojamientos;
    public ControladorAlojamientos() {
        this.alojamientos = new HashMap<>();
    }
    private String obtenerClaveCliente(DatosCliente cliente){
        return cliente.getRutCliente();
    }
    public void ingresarMedioAlojamiento(MediosDeAlojamiento alojamiento) {
        String claveCliente = obtenerClaveCliente(alojamiento);
        if (!alojamientos.containsKey(claveCliente)) {
            alojamientos.put(claveCliente, alojamiento);
        } else {
            System.err.println("Este cliente ya tiene un alojamiento registrado.");
        }
    }
    public void mostrarMediosAlojamiento() {
        for (MediosDeAlojamiento alojamiento : alojamientos.values()) {
            System.out.println(alojamiento.toString());
        }
    }
    public void datosClienteX(String rut) {
        if (alojamientos.containsKey(rut)) {
            MediosDeAlojamiento alojamiento = alojamientos.get(rut);
            System.out.printf("El cliente esta alojado en: ");
            System.out.printf(alojamiento.toString());
        } else {
            System.err.println("Cliente no encontrado.");
        }
    }
    public int totalAdicional() {
        int total = 0;
        for (MediosDeAlojamiento alojamiento : alojamientos.values()) {
            total += alojamiento.adicional();
        }
        return total;
    }
    public int totalBonoDescuento() {
        int total = 0;
        for (MediosDeAlojamiento alojamiento : alojamientos.values()) {
            total += alojamiento.bonoDescuento();
        }
        return total;
    }
    public int cantidadMediosAlojamientoX(Class<?> tipoAlojamiento) {
        int cantidad = 0;
        for (MediosDeAlojamiento alojamiento : alojamientos.values()){
            if (tipoAlojamiento.isInstance(alojamiento)) {
                cantidad++;
            }
        }
        return cantidad;
    }
    public int valorACancelarClienteX(String rut) {
        if (alojamientos.containsKey(rut)) {
            MediosDeAlojamiento alojamiento = alojamientos.get(rut);
            return alojamiento.valorACancelar();
        }
        return 0;
    }
    public void aplicarIncrementoValorBase(Class<?> tipoAlojamiento){
        for (MediosDeAlojamiento alojamiento : alojamientos.values()){
            if (tipoAlojamiento.isInstance(alojamiento) && alojamiento instanceof Cabagna) {
                ((Cabagna) alojamiento).incrementaValorBase();
            }
        }
    }
}
