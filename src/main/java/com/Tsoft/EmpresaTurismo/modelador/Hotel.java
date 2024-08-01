package main.java.com.Tsoft.EmpresaTurismo.modelador;

public class Hotel extends Hospederia{
    protected boolean conDesayuno;

    public Hotel(int valorBaseNoche, int cantidad_de_noches, DatosCliente datosCliente, String[] tipoTemporadada, int capacidad, boolean esFumador, boolean conDesayuno) {
        super(valorBaseNoche, cantidad_de_noches, datosCliente, tipoTemporadada, capacidad, esFumador);
        this.conDesayuno = conDesayuno;
    }

    public boolean isConDesayuno() {
        return conDesayuno;
    }

    public void setConDesayuno(boolean conDesayuno) {
        this.conDesayuno = conDesayuno;
    }
}
