package co.edu.uniquindio.poo;

public class Cobrador extends Persona {
    private double sueldo;

    public Cobrador(String nombre, String apellido, String id, String fechaNacimiento) {
        super(nombre, apellido, id, fechaNacimiento);
        this.sueldo= sueldo;

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
