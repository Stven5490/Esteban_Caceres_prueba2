package main.java.com.Tsoft.EmpresaTurismo.modelador;

public abstract class MediosDeAlojamiento extends DatosCliente {
    protected int valorBaseNoche;
    protected int cantidadNoches;
    protected String tipoTemporada;

    public MediosDeAlojamiento(String nombreCliente, String rutCliente, int valorBaseNoche, int cantidadNoches, String tipoTemporada) {
        super(nombreCliente, rutCliente);
        this.valorBaseNoche = valorBaseNoche;
        this.cantidadNoches = cantidadNoches;
        this.tipoTemporada = tipoTemporada;
    }

    public int getValorBaseNoche() {
        return valorBaseNoche;
    }

    public void setValorBaseNoche(int valorBaseNoche) {
        this.valorBaseNoche = valorBaseNoche;
    }

    public int getCantidadNoches() {
        return cantidadNoches;
    }

    public void setCantidadNoches(int cantidadNoches) {
        this.cantidadNoches = cantidadNoches;
    }

    public String getTipoTemporada() {
        return tipoTemporada;
    }

    public void setTipoTemporada(String tipoTemporada) {
        this.tipoTemporada = tipoTemporada;
    }

    public int subTotal() {
        int subtotal = 0;
        int qNoches = getCantidadNoches();
        int vBase = getValorBaseNoche();
        if (getCantidadNoches() <= 0) {
            return subtotal;
        } else {
            subtotal = qNoches * vBase;
        }
        return subtotal;
    }

    public int bonoDescuento() {
        String tipoTemporada = getTipoTemporada();
        int desctoBaja = 25;
        double desctoMedia = 12.5;
        int subtotal = subTotal();
        int descto = 0;
        if (tipoTemporada.equalsIgnoreCase("baja")) {
            descto = subtotal * (desctoBaja / 100);
            return descto;
        } else if (tipoTemporada.equalsIgnoreCase("media")) {
            descto = (int) (subtotal * (desctoMedia / 100));
            return descto;
        }
        return bonoDescuento();
    }

    public int valorACancelar() {
        int subTotal = subTotal();
        int des = bonoDescuento();
        int add = adicional();
        int valorACancelar = (subTotal + add) - des;
        return valorACancelar;
    }
    public int adicional() {
        return 0;
    }

    @Override
    public String toString() {
        return
                super.toString() +
                        "Valor Base Noche: " + valorBaseNoche +
                        "Cantidad de Noches: " + cantidadNoches +
                        "Tipo de temporada: " + tipoTemporada;
    }

}
