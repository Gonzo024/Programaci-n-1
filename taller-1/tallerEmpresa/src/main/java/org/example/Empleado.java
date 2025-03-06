package org.example;

public class Empleado {
    private String ;
    private String cedula;
    private String cargo;
    private int tiempoEmpresa;

    public Empleado(String , String cedula, String cargo, int tiempoEmpresa) {
        this. = ;
        this.cedula = cedula;
        this.cargo = cargo;
        this.tiempoEmpresa = tiempoEmpresa;
        
        
    }

    public String get() {
        return ;
    }

    public void set(String ) {
        this. = ;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getTiempoEmpresa() {
        return tiempoEmpresa;
    }

    public void setTiempoEmpresa(int tiempoEmpresa) {
        this.tiempoEmpresa = tiempoEmpresa;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "='" +  + '\'' +
                ", cedula='" + cedula + '\'' +
                ", cargo='" + cargo + '\'' +
                ", tiempoEmpresa=" + tiempoEmpresa +
                '}';
    }
}
