package main.java.com.Tsoft.EmpresaTurismo.modelador;

public class DatosCliente {
   private String nombreCliente;
   private String rutCliente;

    public DatosCliente(String nombreCliente, String rutCliente) {
        this.nombreCliente = nombreCliente;
        this.rutCliente = rutCliente;
    }

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

    @Override
    public String toString(){
        return "Datos del cliente: " +
                "Nombre: " + nombreCliente +
                "Rut: " + rutCliente;
    }
}
