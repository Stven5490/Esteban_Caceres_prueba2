package main.java.com.Tsoft.EmpresaTurismo.modelador;

public class Hospederia extends MediosDeAlojamiento{
    private int capacidad;
    private boolean esFumador;

    public Hospederia(String nombreCliente, String rutCliente, int valorBaseNoche, int cantidadNoches, String tipoTemporada, int capacidad, boolean esFumador) {
        super(nombreCliente, rutCliente, valorBaseNoche, cantidadNoches, tipoTemporada);
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
    @Override
    public int adicional() {
        int adicional = 0;
        int Fumador = 30;
        return esFumador ? Fumador * subTotal() : 0;
    }
   @Override
   public String toString() {
        return
                super.toString() +
                        "Capacidad: " + capacidad +
                        "Es fumados? " + esFumador;
   }



}
