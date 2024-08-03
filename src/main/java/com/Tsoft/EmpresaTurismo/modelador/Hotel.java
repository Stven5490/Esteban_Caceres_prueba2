package main.java.com.Tsoft.EmpresaTurismo.modelador;

public class Hotel extends Hospederia{
    private boolean conDesayuno;

    public Hotel(String nombreCliente, String rutCliente, int valorBaseNoche, int cantidadNoches, String tipoTemporada, int capacidad, boolean esFumador, boolean conDesayuno) {
        super(nombreCliente, rutCliente, valorBaseNoche, cantidadNoches, tipoTemporada, capacidad, esFumador);
        this.conDesayuno = conDesayuno;
    }

    public boolean isConDesayuno() {
        return conDesayuno;
    }

    public void setConDesayuno(boolean conDesayuno) {
        this.conDesayuno = conDesayuno;
    }

    @Override
    public int adicional(){
        int add = 30;
        return (isEsFumador() && conDesayuno) ? add * subTotal() : 0;
    }

    @Override
    public String toString() {
        return "Hotel: " +
                super.toString() +
                "Con desayuno: " + conDesayuno;
    }
}
