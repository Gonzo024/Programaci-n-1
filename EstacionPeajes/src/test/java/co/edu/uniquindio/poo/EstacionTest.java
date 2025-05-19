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
    @Test
    //pureba 2
    public void procesarPasoVehiculo() {
        LOG.info("La prueba Procesar Vehiculo inicio");

        EstacionPeaje peaje = new EstacionPeaje("Peaje", "001", "Quindío");

        Vehiculo carro = new Carro("XYZ123", 2, true, TipoVehiculo.SERVICIO_PUBLICO);

        peaje.procesarPasoVehiculo(carro);

        assertTrue(peaje.getTotalRecaudado() > 0);
        assertEquals(1, peaje.getListVehiculos().size());
    }


    @Test
    //prueba 3
    public void testBuscarCobrador() {
        EstacionPeaje newEstacionPeaje = new EstacionPeaje("Sofis NA", "00331", "Quindio");

        Cobrador c1 = new Cobrador("Ana", "Lopez", "8843", "30-04-2005");
        Cobrador c2 = new Cobrador("Pedro", "Gomez", "1019010", "27-04-2000");

        newEstacionPeaje.getListCobradores().add(c1);
        newEstacionPeaje.getListCobradores().add(c2);

        assertEquals(c1, newEstacionPeaje.buscarCobrador("ana lopez"));
        assertEquals(c2, newEstacionPeaje.buscarCobrador("Pedro Gomez"));
        assertNull(newEstacionPeaje.buscarCobrador("No Existe"));
    }


    @Test
    //prueba 4
    public void testObtenerConductoresConCamionPesado() {
        EstacionPeaje estacionPeaje = new EstacionPeaje("Peaje Test", "001", "Ubicación Test");

        Conductor cond1 = new Conductor("1", "Luis", "Martinez","09-0-2001");
        Conductor cond2 = new Conductor("2", "Marta", "Rojas","10-6-2015");

        Camion camionPesado = new Camion("Camion1", 15,30,4); // Capacidad > 10
        Camion camionLigero = new Camion("Camion2", 5,10,7);  // Capacidad <= 10

        cond1.addVehiculo(camionPesado);
        cond2.addVehiculo(camionLigero);

        estacionPeaje.getListConductores().add(cond1);
        estacionPeaje.getListConductores().add(cond2);

        LinkedList<Conductor> resultado = estacionPeaje.obtenerConductoresConCamionPesado();

        assertTrue(resultado.contains(cond1), "Debe incluir conductor con camión pesado");

        assertFalse(resultado.contains(cond2), "No debe incluir conductor con camión ligero");
    }

}













