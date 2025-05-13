package co.edu.uniquindio.poo.proyectofinal.Model;
import java.time.LocalDate;

public class Paciente extends Persona {
    private String direccion;
    private Especialidad especialidad;

public Paciente(String nombre, String apellido, String documentoIdentidad, String id, String telefono,String direccion){
    super(nombre, apellido, documentoIdentidad, id, telefono);
    this.direccion=direccion;
}

public String getDireccion() {
    return direccion;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}

public Cita solicitarCita(LocalDate fecha, Especialidad especialidad){
    //Podemos agregar validaciones aquí.
    Cita nuevaCita= new Cita(fecha, especialidad, this);
    mostrarMensaje("La cita ha sido registrada.");
    return nuevaCita;
}


@Override
public void registrarDatos(){
    System.out.println("prueba");
}  



@Override
public void actualizarDatos(){
    System.out.println("prueba");

}
}
