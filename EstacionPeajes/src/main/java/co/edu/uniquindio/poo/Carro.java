package co.edu.uniquindio.poo;

public class Carro extends Vehiculo implements IDescriptible {
    private boolean electrico;
    private TipoVehiculo tipoVehiculo;


    public Carro(String placa, int cantiPeajesPagado, boolean electrico, TipoVehiculo tipoVehiculo) {
        super(placa, cantiPeajesPagado);
        this.electrico = electrico;
        this.tipoVehiculo = tipoVehiculo;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public double calularValorPeaje() {
        double valorPraje = 0;
        valorPraje = 10000;

        if (electrico==true) {

            valorPraje += -valorPraje * 0.20;
        }
        if(TipoVehiculo.SERVICIO_PUBLICO.equals(tipoVehiculo)){
            valorPraje += valorPraje * 0.15;
        }
        return valorPraje;
    }

    @Override
    public String obtenerDescripcion() {
        return "Carro - Placa: " + getPlaca()
                + ", Eléctrico: " + (isElectrico() ? "Sí" : "No")
                + ", Tipo: " + tipoVehiculo;
    }

}
