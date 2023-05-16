/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santos 773541@alu.murciaeduca.com
* 
* version 3.0
**/
/**
 * Clase que representa el motor de un vehículo.
 */
public class Motor {
    private boolean encendido;

    /**
     * Constructor de la clase Motor.
     * version 1.0
     */
    public Motor() {
        encendido = false;
    }

    /**
     * Verifica si el motor está encendido.
     * @return true si el motor está encendido, false de lo contrario.
     */
    public boolean estaEncendido() {
        return encendido;
    }

    /**
     * Enciende el motor.
     */
    public void encender() {
        encendido = true;
        System.out.println("El motor se ha encendido");
        // Lógica de encendido del motor
    }

    /**
     * Apaga el motor.
     */
    public void apagar() {
        encendido = false;
        System.out.println("El motor se ha apagado");
        // Lógica de apagado del motor
    }
}


