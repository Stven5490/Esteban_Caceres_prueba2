package main.java.com.Tsoft.EmpresaTurismo.modelador;

public abstract class MediosDeAlojamiento {
    protected int valorBaseNoche;
    protected int cantidad_de_noches;
    protected DatosCliente datosCliente;
    protected String[] tipoTemporadada = {"alta", "media", "baja"};

    public MediosDeAlojamiento(int valorBaseNoche, int cantidad_de_noches, DatosCliente datosCliente, String[] tipoTemporadada) {
        this.valorBaseNoche = valorBaseNoche;
        this.cantidad_de_noches = cantidad_de_noches;
        this.datosCliente = datosCliente;
        this.tipoTemporadada = tipoTemporadada;
    }

    public int getValorBaseNoche() {
        return valorBaseNoche;
    }

    public void setValorBaseNoche(int valorBaseNoche) {
        this.valorBaseNoche = valorBaseNoche;
    }

    public int getCantidad_de_noches() {
        return cantidad_de_noches;
    }

    public void setCantidad_de_noches(int cantidad_de_noches) {
        this.cantidad_de_noches = cantidad_de_noches;
    }

    public DatosCliente getDatosCliente() {
        return datosCliente;
    }

    public void setDatosCliente(DatosCliente datosCliente) {
        this.datosCliente = datosCliente;
    }

    public String[] getTipoTemporadada() {
        return tipoTemporadada;
    }

    public void setTipoTemporadada(String[] tipoTemporadada) {
        this.tipoTemporadada = tipoTemporadada;
    }
}
