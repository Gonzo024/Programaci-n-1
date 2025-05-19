package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Conductor extends Persona {
    private List<Vehiculo> listVehiculo;

    public Conductor(String nombre, String apellido, String id, String fechaNacimiento) {
        super(nombre, apellido, id, fechaNacimiento);
        this.listVehiculo = new LinkedList<>();
    }

    public List<Vehiculo> getListVehiculo() {
        return listVehiculo;
    }

    public void setListVehiculo(List<Vehiculo> listVehiculo) {
        this.listVehiculo = listVehiculo;
    }

    public void addVehiculo(Vehiculo vehiculo) {
        this.listVehiculo.add(vehiculo);
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        listVehiculo.add(vehiculo);
    }

    public String consultarTotalPagadoPeajes() {
        String reporte = "Reporte de pagos de peajes para " + getNombre() + " " + getApellido() + ":\n";
        double totalGeneral = 0;

        for (Vehiculo v : listVehiculo) {
            double costoUnitario = v.calularValorPeaje();
            int veces = v.getCantiPeajesPagado();
            double totalVehiculo = costoUnitario * veces;
            totalGeneral += totalVehiculo;

            reporte += v.getPlaca() + " - Peajes pagados: " + veces + " - Total pagado: $" + totalVehiculo + "\n";
        }

        reporte += "Total acumulado pagado en peajes: $" + totalGeneral;

        return reporte;
    }

    public LinkedList<Vehiculo> obtenerVehiculosPorTipo(String tipoBuscado) {
        LinkedList<Vehiculo> resultado = new LinkedList<>();

        for (Vehiculo v : listVehiculo) {
            switch (tipoBuscado.toLowerCase()) {
                case "carro":
                    if (v instanceof Carro) resultado.add(v);
                    break;
                case "moto":
                    if (v instanceof Moto) resultado.add(v);
                    break;
                case "camion":
                    if (v instanceof Camion) resultado.add(v);
                    break;
                default:
                    // No hace nada o lanzar excepción si quieres
            }
        }
        return resultado;
    }

}
