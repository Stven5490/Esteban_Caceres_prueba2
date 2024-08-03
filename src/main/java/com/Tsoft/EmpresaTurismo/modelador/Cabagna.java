package main.java.com.Tsoft.EmpresaTurismo.modelador;

public class Cabagna extends Hospederia{
    private boolean chimenea;

    public Cabagna(String nombreCliente, String rutCliente, int valorBaseNoche, int cantidadNoches, String tipoTemporada, int capacidad, boolean esFumador, boolean chimenea) {
        super(nombreCliente, rutCliente, valorBaseNoche, cantidadNoches, tipoTemporada, capacidad, esFumador);
        this.chimenea = chimenea;
    }

    public boolean isChimenea() {
        return chimenea;
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }

    public void incrementaValorBase() {
        double add = 18;
        if (getCapacidad() > 5) {
            valorBaseNoche *= add;
        }
    }

    @Override
    public String toString() {
        return "Cabaña:" +
                super.toString() +
                "Chimenea: " + chimenea;
    }
}
