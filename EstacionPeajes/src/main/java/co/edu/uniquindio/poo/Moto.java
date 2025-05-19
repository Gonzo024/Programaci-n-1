package co.edu.uniquindio.poo;

public class Moto extends Vehiculo implements IDescriptible {
    private int cilindraje;
    public Moto(String placa, int cantiPeajesPagado, int cilindraje) {
        super(placa, cantiPeajesPagado);
        this.cilindraje = cilindraje;

    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public double calularValorPeaje() {
        double valorPeaje = 5000;
        if (cilindraje >200) {
            valorPeaje += 2000;
        }
        return valorPeaje;
    }

    @Override
    public String obtenerDescripcion() {
        return "Moto - Placa: " + getPlaca()
                + ", Cilindraje: " + cilindraje + " cc";
    }

}
