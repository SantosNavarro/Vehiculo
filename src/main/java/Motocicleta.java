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
 * Clase que representa una motocicleta, subclase de Vehiculo.
 */

public class Motocicleta extends Vehiculo {
    private String marca;
    
    /**
     * Constructor de la clase Motocicleta.
     * Crea una motocicleta con la marca especificada.
     * @param marca La marca de la motocicleta.
     */
    public Motocicleta(String marca) {
        super(2); // Una motocicleta tiene 2 ruedas
        this.marca = marca;
    }

    /**
     * modificacion del metodo conducir
     * (@inheritDoc)
     */
    @Override
    public void conducir() {
        System.out.println("Conduciendo la motocicleta " + marca);
        motor.encender();
        // Lógica específica de la motocicleta
    }

    /**
     * Obtiene la marca de la motocicleta.
     * @return La marca de la motocicleta.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca de la motocicleta.
     * @param marca La marca de la motocicleta.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
}

