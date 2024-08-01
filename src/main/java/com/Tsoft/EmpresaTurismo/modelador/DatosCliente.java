package main.java.com.Tsoft.EmpresaTurismo.modelador;

public class DatosCliente {
    protected String nombreCliente;
    protected String rutCliente;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public DatosCliente(String nombreCliente, String rutCliente) {
        this.nombreCliente = nombreCliente;
        this.rutCliente = rutCliente;
    }

    @Override
    public String toString() {
        String nombre = getNombreCliente();
        String rut = getRutCliente();

        return "Informacion del cliente: " +
                "Nombre: " + nombre +
                "Rut: " + rut;
    }
}
