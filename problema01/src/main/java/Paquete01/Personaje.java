/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete01;

public abstract class Personaje {

    protected String nombre;
    protected int nivel;
    protected int puntosVida;

    public Personaje(String nom, int nive, int punVida) {
        this.nombre = nom;
        this.nivel = nive;
        this.puntosVida = punVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nive) {
        this.nivel = nive;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int punVida) {
        this.puntosVida = punVida;
    }

    public abstract void atacar();

    public abstract void defender();

    public void aumentarNivel() {
        if (nivel < 10) {
            nivel++;
        }
        System.out.println(nombre + " ha subido de nivel +1");
    }

    public void bajarNivel() {

        if (nivel > 0) {
            nivel--;
        }
        System.out.println(nombre + " ha bajado de nivel -1");
    }

    public void Empate() {
        System.out.println("Ambos combatiendes empatan en combate y se retiran");
    }
}
