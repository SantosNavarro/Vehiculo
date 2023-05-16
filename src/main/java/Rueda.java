/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santos 773541@alu.murciaeduca.com
 * 
 *Version 3.0
 */

/**
 * Clase que representa una rueda de un vehículo.
 */
public class Rueda {
    private int diametro;

    /**
     * Constructor de la clase Rueda.
     * @param diametro El diámetro de la rueda en pulgadas.
     */
    public Rueda(int diametro) {
        this.diametro = diametro;
    }

    /**
     * Obtiene el diámetro de la rueda.
     * @return El diámetro de la rueda en pulgadas.
     */
    public int getDiametro() {
        return diametro;
    }

    /**
     * Establece el diámetro de la rueda.
     * @param diametro El diámetro de la rueda en pulgadas.
     */
    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    /**
     * Gira la rueda.
     */
    public void girar() {
        System.out.println("La rueda está girando");
        // Lógica de giro de la rueda
    }
}
