package co.edu.uniquindio.poo;

public class Camion extends Vehiculo implements IDescriptible{
    private double capacidadCargaTon;
    private int cantEje;

    public Camion(String placa, int cantiPeajesPagado, double capacidadCargaTon, int cantEje) {
        super(placa, cantiPeajesPagado);
        this.capacidadCargaTon = capacidadCargaTon;
        this.cantEje = cantEje;

    }

    public double getCapacidadCargaTon() {
        return capacidadCargaTon;
    }

    public void setCapacidadCargaTon(double capacidadCargaTon) {
        this.capacidadCargaTon = capacidadCargaTon;
    }

    public int getCantEje() {
        return cantEje;
    }

    public void setCantEje(int cantEje) {
        this.cantEje = cantEje;
    }

    @Override
    public double calularValorPeaje() {
       double valorPeaje=0;

       valorPeaje= getCantEje() * 7000;

       if (getCapacidadCargaTon()>10) {
           valorPeaje+= valorPeaje *0.10;
       }

        return valorPeaje;
    }

    @Override
    public String obtenerDescripcion() {
        return "Camión - Placa: " + getPlaca()
                + ", Ejes: " + cantEje
                + ", Capacidad: " + capacidadCargaTon + " toneladas";

    }

}
