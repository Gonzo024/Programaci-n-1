package org.example;

import java.util.ArrayList;
import java.util.List;

public class Guarderia {

    private String nombre;
    private String nit;
    private String correo;
    public List<Estudiante> estudiantes;

    public Guarderia(String nombre, String nit, String correo) {
        this.nombre = nombre;
        this.nit = nit;
        this.correo = correo;
        this.estudiantes = new ArrayList<>();
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Guarderia{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    /**
     * Método que devuelve una lista de estudiantes mayores o iguales a 5 años.
     * Si no hay estudiantes en esa condición, imprime un mensaje.
     * @return Lista de estudiantes mayores de 5 años.
     */
    public List<Estudiante> mayores5anios() {
        List<Estudiante> mayores = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getEdad() >= 5) {
                mayores.add(estudiante);
            }
        }
        if (mayores.isEmpty()) {
            System.out.println("No hay estudiantes mayores de 5 años.");
        }
        return mayores;
    }

    /**
     * Método que verifica si un estudiante ya está registrado en la guardería.
     * @param id ID del estudiante a verificar.
     * @return true si el estudiante NO existe; false si YA está registrado.
     */
    public boolean verificarEstudiante(String id) {
        for (Estudiante estudiante : estudiantes) {
            if (id.equals(estudiante.getId())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Método para agregar un nuevo estudiante a la guardería.
     * @param estudiante Objeto Estudiante a agregar.
     */
    public void agregarEstudiante(Estudiante estudiante) {
        if (verificarEstudiante(estudiante.getId())) {
            estudiantes.add(estudiante);
        } else {
            System.out.println("El estudiante ya existe.");
        }
    }

    /**
     * Método para eliminar un estudiante de la guardería.
     * @param id ID del estudiante a eliminar.
     * @return true si el estudiante fue eliminado, false si no se encontró.
     */
    public boolean eliminarEstudiante(String id) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getId().equals(id)) {
                estudiantes.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Método para actualizar la información de un estudiante existente.
     * @param id ID del estudiante a actualizar.
     * @param actualizado Objeto Estudiante con los nuevos datos.
     * @return true si la actualización fue exitosa, false si no se encontró el estudiante.
     */
    public boolean actualizarEstudiante(String id, Estudiante actualizado) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getId().equals(id)) {
                estudiante.setId(actualizado.getId());
                estudiante.setNombre(actualizado.getNombre());
                estudiante.setEdad(actualizado.getEdad());
                estudiante.setGenero(actualizado.getGenero());
                estudiante.setAlergias(actualizado.getAlergias());
                estudiante.setNombreAcudiente(actualizado.getNombreAcudiente());
                estudiante.setTelefono(actualizado.getTelefono());
                return true;
            }
        }
        return false;
    }
}