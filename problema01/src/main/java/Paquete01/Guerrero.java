/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete01;

public class Guerrero extends Personaje {

    private int fuerza;

    public Guerrero(int fuer, String nomb, int niv, int puntVida) {
        super(nomb, niv, puntVida);
        this.fuerza = fuer;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuer) {
        this.fuerza = fuer;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " realiza un ataque con su puño con una fuerza de " + fuerza);

    }

    @Override
    public void defender() {
        System.out.println("El guerrero " + nombre + " se defiende con su escudo de FARAMIR.");
    }
}
