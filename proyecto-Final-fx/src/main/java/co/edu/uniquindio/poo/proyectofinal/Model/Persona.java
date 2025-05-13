package co.edu.uniquindio.poo.proyectofinal.Model;

// 04/14/25 Update log: Fue creada la clase persona.

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected String documentoIdentidad;
    protected String id;
    protected String telefono;

    public Persona(String nombre, String apellido, String documentoIdentidad, String id, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentidad = documentoIdentidad;
        this.id = id;
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }
    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public abstract void registrarDatos();
    public abstract void actualizarDatos();

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

}
