/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete01;

public class Mago extends Personaje {

    private int poderMagico;

    public Mago(int poderMag, String nomb, int niv, int puntVida) {
        super(nomb, niv, puntVida);
        this.poderMagico = poderMag;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMag) {
        this.poderMagico = poderMag;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza el hechizo CRUCIO con un poder mágico de " + poderMagico);
    }

    @Override
    public void defender() {
        System.out.println("El mago " + nombre + " crea un escudo mágico para defenderse.");
    }
}
