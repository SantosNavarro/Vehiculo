/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Santos 773541@alu.murciaeduca.com
 * 
 * Version 3.0
 */
/**
 * Clase abstracta que representa un vehículo.
*/
public abstract class Vehiculo {
    Motor motor;
    private Rueda[] ruedas;

    /**
     * Constructor de la clase Vehiculo.
     * @param numRuedas Número de ruedas del vehículo.
     */
    public Vehiculo(int numRuedas) {
        ruedas = new Rueda[numRuedas];
    }

    /**
     * Método abstracto para conducir el vehículo.
     */
    public abstract void conducir();

    /**
     * Establece el motor del vehículo.
     * @param motor Objeto de la clase Motor.
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    /**
     * Obtiene el motor del vehículo.
     * @return Objeto de la clase Motor.
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * Establece una rueda en la posición indicada.
     * @param indice Índice de la rueda.
     * @param rueda Objeto de la clase Rueda.
     */
    public void setRueda(int indice, Rueda rueda) {
        if (indice >= 0 && indice < ruedas.length) {
            ruedas[indice] = rueda;
        }
    }

    /**
     * Obtiene la rueda en la posición indicada.
     * @param indice Índice de la rueda.
     * @return Objeto de la clase Rueda.
     */
    public Rueda getRueda(int indice) {
        if (indice >= 0 && indice < ruedas.length) {
            return ruedas[indice];
        }
        return null;
    }
}
