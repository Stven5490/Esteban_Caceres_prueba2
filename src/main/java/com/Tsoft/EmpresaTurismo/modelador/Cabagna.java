package main.java.com.Tsoft.EmpresaTurismo.modelador;

public class Cabagna extends Hospederia{
    protected boolean chimenea;

    public Cabagna(int valorBaseNoche, int cantidad_de_noches, DatosCliente datosCliente, String[] tipoTemporadada, int capacidad, boolean esFumador, boolean chimenea) {
        super(valorBaseNoche, cantidad_de_noches, datosCliente, tipoTemporadada, capacidad, esFumador);
        this.chimenea = chimenea;
    }

    public boolean isChimenea() {
        return chimenea;
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }

    public int incrementarValorBase() {
        int incrementar = 18;
        int incrementarValorBase = 0;
        if (capacidad > 5) {
            incrementarValorBase = valorBaseNoche * (incrementar/100);
        } else {
            incrementarValorBase = 0;
        }
        return incrementarValorBase;
    }
}
