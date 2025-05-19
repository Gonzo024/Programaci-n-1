package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.logging.Logger;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class EstacionTest {
    private static final Logger LOG = Logger.getLogger(EstacionTest.class.getName());


    @Test
    //prueba 1

    public void asignarVehiculoAConductor(){
        LOG.info("La prueba Asignar Vahiculo inicio");

        EstacionPeaje newEstacionPeaje = new EstacionPeaje("Jhan", "0011","Quindio");

        Conductor conductor = new Conductor("santi", "GONZALEZ", "1902", "24 marzo 2007");
        newEstacionPeaje.getListConductores().add(conductor);



        Vehiculo vehiculo1 = new Carro("1212",12,true,TipoVehiculo.SERVICIO_PUBLICO) ;



        newEstacionPeaje.getListVehiculos().add(vehiculo1);


        boolean resultado = newEstacionPeaje.asignarVehiculoAConductor("1902",vehiculo1);
        assertTrue(resultado);


    }

}












