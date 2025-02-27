package org.example;

public class Estudiante {
    private String nombre;
    private int edad;
    private String genero;
    private String id;
    private String alergias;
    private String nombreAcudiente;
    private String telefono;

    public Estudiante(String nombre, int edad, String genero,
                      String id, String nombreAcudiente, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.id = id;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.telefono = telefono;

    }
    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}

    public String getGenero() {return genero;}

    public void setGenero(String genero) {this.genero = genero;}

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public String getAlergias() {return alergias;}

    public String getNombreAcudiente() {return nombreAcudiente;}

    public String getTelefono() {return telefono;}

    public void setTelefono(String telefono) {this.telefono = telefono;}


    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", id='" + id + '\'' +
                ", alergias='" + alergias + '\'' +
                ", nombreAcudiengte='" + nombreAcudiente + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
