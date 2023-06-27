/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete01;

public class Arquero extends Personaje {

    private int precicion;

    public Arquero(int preci, String nomb, int niv, int puntVida) {
        super(nomb, niv, puntVida);
        this.precicion = preci;
    }

    public int getPrecicion() {
        return precicion;
    }

    public void setPrecicion(int preci) {
        this.precicion = preci;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " dispara una fleca de lo lejos con su precicion de -> " + precicion);
    }

    @Override
    public void defender() {
        System.out.println("El arquero " + nombre + "  su mueve con un rapidez para asi esquivar los ataques.");
    }
}
