package org.example;

public class Empresa {
    private String nombre;
    private String nit;
    private Empleado[] listEmpleados;

    public Empresa(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listEmpleados = new Empleado[50];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Empleado[] getListEmpleados() {
        return listEmpleados;
    }

    public void setListEmpleados(Empleado[] listEmpleados) {
        this.listEmpleados = listEmpleados;
    }

    /* Para decir si se creo o si no se creo para eso es el "bolean"*/

    public boolean crearEmpleado(Empleado newEmpleado) {
        int espacioLibre = validarCupoEmpleado();

        if (espacioLibre != -1 &&
                buscarEmpleadoId(newEmpleado.getCedula()) == -1) {

            listEmpleados[espacioLibre] = newEmpleado;
            return true;
        }
        return false;

    }
    public int buscarEmpleadoId(String idEmpleadoBuscar) {
        for (int i = 0; i < listEmpleados.length; i++) {
            if (listEmpleados[i].getCedula().equals(idEmpleadoBuscar)) {
                return i;
            }

        }
        return -1;
    }


    public int validarCupoEmpleado() {
        for (int i = 0; i < listEmpleados.length; i++) {
            if(listEmpleados[i] == null){
                return i;
            }
        }
        return -1;

    }
    public boolean actualizarEmpleado(String idEmpleadoModificar, Empleado empleadoModificado) {
        int posicionEmpleadoBuscar = buscarEmpleadoId(idEmpleadoModificar);

        if (posicionEmpleadoBuscar != -1) {
            listEmpleados[posicionEmpleadoBuscar] = empleadoModificado;
            return true;
        }
        return false;

    }
    public boolean eliminarEmpleado(String idEmpleadoEliminar) {
        int  posicionEmpleadoEliminar = buscarEmpleadoId(idEmpleadoEliminar);
        if (posicionEmpleadoEliminar != -1) {
            listEmpleados[posicionEmpleadoEliminar] = null;
            return true;
        }
        return false;

    }
    public Empleado[] buscarEmpleadosCargo(String CargoEmpleado) {
        int cantidadEmpleadosCargo = 0;

        for (int i = 0; i < listEmpleados.length; i++) {
            if  (listEmpleados[i].getCedula().equals(CargoEmpleado)) {
                cantidadEmpleadosCargo++;

            }
        }
        Empleado[] listEmpleadosCargo = new Empleado[cantidadEmpleadosCargo];
        int indice = 0;

        for (int i = 0; i < cantidadEmpleadosCargo; i++) {
            listEmpleadosCargo[indice] = listEmpleados[i];
            indice++;
        }
    }

}
