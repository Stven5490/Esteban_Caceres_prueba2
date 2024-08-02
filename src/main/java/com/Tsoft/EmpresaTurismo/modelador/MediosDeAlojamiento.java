package main.java.com.Tsoft.EmpresaTurismo.modelador;

import java.util.Arrays;

public abstract class MediosDeAlojamiento {
    protected static int valorBaseNoche;
    protected static int cantidad_de_noches;
    protected DatosCliente datosCliente;
    protected String tipoTemporadada; //{"alta", "media", "baja"};

    public MediosDeAlojamiento(int valorBaseNoche, int cantidad_de_noches, DatosCliente datosCliente, String[] tipoTemporadada) {
        this.valorBaseNoche = valorBaseNoche;
        this.cantidad_de_noches = cantidad_de_noches;
        this.datosCliente = datosCliente;
        this.tipoTemporadada = Arrays.toString(tipoTemporadada);
    }

    public static int getValorBaseNoche() {
        return valorBaseNoche;
    }

    public void setValorBaseNoche(int valorBaseNoche) {
        this.valorBaseNoche = valorBaseNoche;
    }

    public static int getCantidad_de_noches() {
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
        return new String[]{tipoTemporadada};
    }

    public void setTipoTemporadada(String[] tipoTemporadada) {
        this.tipoTemporadada = Arrays.toString(tipoTemporadada);
    }

    public static int subTotal() {
        int subtotal = 0;
        if (getCantidad_de_noches() == 0) {
            subtotal = 0;
        } else {
            subtotal = getCantidad_de_noches() * getValorBaseNoche();
        }
        return subtotal;
    }

    public int bonoDescuento() {
        int bonoDescuento = 0;
        int desctoBaja = 25;
        double desctoMedia = 12.5;
        if (tipoTemporadada == "baja") {
            bonoDescuento = subTotal() * desctoBaja;
        } else if (tipoTemporadada == "media") {
            bonoDescuento = (int) (subTotal() * desctoMedia);
        } else {
            bonoDescuento = 0;
        }
        return bonoDescuento;
    }

    public int valorACancelar() {
        int subTotal = subTotal();
        int descto = bonoDescuento();
        int adicional = Hotel.adicional();
        int total = subTotal - descto + adicional;
        return total;
    }
}
