package co.edu.uniquindio.poo.proyectofinal.Model;
import java.util.List;
import java.util.LinkedList;

public class HistorialMedico {
    private Paciente paciente;
    private List<RegistroMedico> lista = new LinkedList<RegistroMedico>();
    
    public HistorialMedico(List<RegistroMedico> lista) {
        this.lista = lista;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public List<RegistroMedico> getLista() {
        return lista;
    }

    public void setLista(List<RegistroMedico> lista) {
        this.lista = lista;
    }
    
public void buscarPaciente(String id, List<Paciente> pacientes){
for(Paciente p : pacientes){
    if(p.getId().equals(id)){
        this.paciente=p;
        break;
        }
    }

}
//Requiero su ayuda en esta   
public void agregarRegistro(){

}

public void mostrarRegistro(){
    
}
    
}
