/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santos 773541@alu.murciaeduca.com
 * 
 * Version 3.0
 */
/**
 * Clase que representa un automóvil, subclase de Vehiculo.
 */
public class Automovil extends Vehiculo {
    /**
     * Constructor de la clase Automovil.
     * Crea un automóvil con 4 ruedas.
     */
    public Automovil() {
        super(4);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void conducir() {
        System.out.println("Conduciendo el automóvil");
        motor.encender();
        // Lógica específica del automóvil
    }
}
