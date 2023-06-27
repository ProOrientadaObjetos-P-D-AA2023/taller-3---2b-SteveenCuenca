/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

public abstract class Menu {

    protected String nombre;
    protected double valorInicial;
    protected double valorMenu;

    public Menu(String nomb, double valInici) {
        this.nombre = nomb;
        this.valorInicial = valInici;
    }

    public void establecerValorMenu() {
        this.valorMenu = valorInicial;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }

    @Override
    public String toString() {
        return String.format("Plato: %s\nValor Inicial: %.2f\n"
                + "Valor del Menú: %.2f\n---------------------------------",
                 nombre,
                 valorInicial,
                 valorMenu);
    }
}
