package main.java.com.Tsoft.EmpresaTurismo.modelador;

public class Carpa extends MediosDeAlojamiento{
    protected int cantidadPersonas;

    public Carpa(int valorBaseNoche, int cantidad_de_noches, DatosCliente datosCliente, String[] tipoTemporadada, int cantidadPersonas) {
        super(valorBaseNoche, cantidad_de_noches, datosCliente, tipoTemporadada);
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
}
