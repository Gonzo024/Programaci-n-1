package co.edu.uniquindio.poo;

import java.util.Calendar;
import java.util.LinkedList;

public class EstacionPeaje {
    private String nombre;
    private String id;
    private String Ubicacion;
    private double totalRecaudado;
    private LinkedList<Vehiculo> listVehiculosRegistrados;
    private LinkedList<Conductor> listConductores;
    private LinkedList<Cobrador> listCobradores;

    public EstacionPeaje(String nombre, String id, String Ubicacion) {
        this.nombre = nombre;
        this.id = id;
        this.Ubicacion = Ubicacion;
        totalRecaudado=0;
        this.listConductores = new LinkedList<>();
        this.listVehiculosRegistrados = new LinkedList<>();
        this.listCobradores = new LinkedList<>();



    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public LinkedList<Cobrador> getListCobradores() {
        return listCobradores;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public LinkedList<Vehiculo> getListVehiculos() {
        return listVehiculosRegistrados;
    }

    public void setListVehiculos(LinkedList<Vehiculo> listVehiculos) {
        this.listVehiculosRegistrados = listVehiculos;
    }

    public LinkedList<Conductor> getListConductores() {
        return listConductores;
    }

    public void setListConductores(LinkedList<Conductor> listConductores) {
        this.listConductores = listConductores;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    public LinkedList<Vehiculo> getListVehiculosRegistrados() {
        return listVehiculosRegistrados;
    }

    public void setListVehiculosRegistrados(LinkedList<Vehiculo> listVehiculosRegistrados) {
        this.listVehiculosRegistrados = listVehiculosRegistrados;
    }

    public void setListCobradores(LinkedList<Cobrador> listCobradores) {
        this.listCobradores = listCobradores;
    }

    // total de peajes

//asignar vehiculo al conductor

    //metodo 1
    public boolean asignarVehiculoAConductor (String idConductor, Vehiculo vehiculo) {
        boolean flag = false;
        Conductor conductorEncontrado = null;
        for (Conductor conductor : listConductores) {
            if (conductor.getId().equals(idConductor)) {
                conductorEncontrado = conductor;
            }
        }

        if (conductorEncontrado != null) {
            conductorEncontrado.addVehiculo(vehiculo);
            flag = true;
        }
        return flag;
    }
    //vehiculos que llegaron al peaje

    // metodo 2
    public void procesarPasoVehiculo(Vehiculo vehiculo) {
        double valor = vehiculo.calularValorPeaje();
        totalRecaudado += valor;
        listVehiculosRegistrados.add(vehiculo);
    }
//calculo detallado de cada peaje y total acomulado

    //meotod 3
    public void imprimirResumenPeaje() {
        System.out.println("Resumen de vehículos en el peaje:");
        for (Vehiculo vehiculo : listVehiculosRegistrados) {
            System.out.println(vehiculo.getPlaca() + " - Valor peaje: $" + vehiculo.calularValorPeaje());
        }
        System.out.println("Total recaudado: $" + totalRecaudado);
    }

    public Cobrador buscarCobrador(String nombreCompletoBuscado) {
        String nombreBuscado = nombreCompletoBuscado.trim().toLowerCase();

        for (Cobrador cobrador : listCobradores) {
            String nombreRecaudador = (cobrador.getNombre() + " " + cobrador.getApellido()).toLowerCase();
            if (nombreRecaudador.equals(nombreBuscado)) {
                return cobrador;
            }
        }
        return null;
    }

    //metodo 4
    public LinkedList<Conductor> obtenerConductoresConCamionPesado() {
        LinkedList<Conductor> resultado = new LinkedList<>();

        for (Conductor conductor : listConductores) {
            for (Vehiculo vehiculo : conductor.getListVehiculo()) {
                if (vehiculo instanceof Camion) {
                    Camion camion = (Camion) vehiculo;
                    if (camion.getCapacidadCargaTon() > 10) {
                        resultado.add(conductor);
                        break; // ya encontró uno, pasa al siguiente conductor
                    }
                }
            }
        }
        return resultado;
    }

}
