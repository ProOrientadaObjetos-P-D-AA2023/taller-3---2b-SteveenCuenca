/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete01;

public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;

    public Menu(String nombPla, double valoMenu) {
        this.nombrePlato = nombPla;
        this.valorMenu = valoMenu;
    }

    public abstract double calcularSubtotal();

    @Override
    public abstract String toString();
}
