package main.java.com.Tsoft.EmpresaTurismo.modelador;

public class Hospederia extends MediosDeAlojamiento{
    protected int capacidad;
    protected boolean esFumador;

    public Hospederia(int valorBaseNoche, int cantidad_de_noches, DatosCliente datosCliente, String[] tipoTemporadada, int capacidad, boolean esFumador) {
        super(valorBaseNoche, cantidad_de_noches, datosCliente, tipoTemporadada);
        this.capacidad = capacidad;
        this.esFumador = esFumador;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEsFumador() {
        return esFumador;
    }

    public void setEsFumador(boolean esFumador) {
        this.esFumador = esFumador;
    }
}
