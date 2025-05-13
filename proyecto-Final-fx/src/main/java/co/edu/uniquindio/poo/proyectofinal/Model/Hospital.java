package co.edu.uniquindio.poo.proyectofinal.Model;


import java.util.LinkedList;

public class Hospital {
    private String nombre;
    private String nit;
    private LinkedList<Cita> listCitas;
    private LinkedList<Medico> listMedicos;


    public Hospital(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.listCitas = new LinkedList<>();
        this.listMedicos = new LinkedList<>();
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

    public boolean addMedico(Medico medico) {
        boolean flag = false;
        for (Medico m : listMedicos) {
            if (m.getNombre().equals(medico.getNombre())) {
                return flag;
            }
            listMedicos.add(medico);
            flag = true;
        }
        return flag;
    }

    public Medico leerMedico(String nombre) {
        for (Medico m : listMedicos) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                return m;
            }
        }
        return null;
    }

    public boolean modificarMedico(Medico medico) {
        for (int i = 0; i < listMedicos.size(); i++) {
            if (listMedicos.get(i).getNombre().equalsIgnoreCase(medico.getNombre())) {
                listMedicos.set(i, medico); // Reemplaza con nuevos datos
                return true;
            }
        }
        return false;
    }

    public boolean eliminarMedico(Medico medico) {
        boolean flag = false;
        for (Medico m : listMedicos) {
            if (m.getId().equalsIgnoreCase(medico.getId())) {
                listMedicos.remove(m);
                flag = true;
                break;
            }
        }
        return flag;
    }

}
