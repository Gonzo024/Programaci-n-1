package co.edu.uniquindio.poo;

public abstract class Vehiculo {
    private String placa;
    private int cantiPeajesPagado;

    public Vehiculo(String placa, int cantiPeajesPagado) {
        this.placa = placa;
        this.cantiPeajesPagado = cantiPeajesPagado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCantiPeajesPagado() {
        return cantiPeajesPagado;
    }

    public void setCantiPeajesPagado(int cantiPeajesPagado) {
        this.cantiPeajesPagado = cantiPeajesPagado;
    }

    public abstract double calularValorPeaje ();


    }

