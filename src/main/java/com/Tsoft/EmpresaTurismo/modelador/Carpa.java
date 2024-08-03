package main.java.com.Tsoft.EmpresaTurismo.modelador;

public class Carpa extends MediosDeAlojamiento{
    private int cantidadPersonas;

    public Carpa(String nombreCliente, String rutCliente, int valorBaseNoche, int cantidadNoches, String tipoTemporada, int cantidadPersonas) {
        super(nombreCliente, rutCliente, valorBaseNoche, cantidadNoches, tipoTemporada);
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public String toString() {
        return
                "Carpa: " + super.toString() +
                        "Cantidad de personas: " + cantidadPersonas;
    }
}
