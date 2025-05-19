package co.edu.uniquindio.poo;

public class Peaje {
    private String id;
    private String fecha;
    private double precio;

    public Peaje(String id, String fecha, double precio) {
        this.id = id;
        this.fecha = fecha;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
