/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete01;

public class MenuDia extends Menu {

    private double valorInicial;
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nomPlato, double valInicial, double valPostre, double valBebida) {
        super(nomPlato, 0);
        this.valorInicial = valInicial;
        this.valorPostre = valPostre;
        this.valorBebida = valBebida;
    }

    @Override
    public double calcularSubtotal() {
        return valorInicial + valorPostre + valorBebida;
    }

    @Override
    public String toString() {
        return "\n" + "Menu del Día:\n"
                + "Plato: " + nombrePlato + "\n"
                + "Valor Inicial: " + valorInicial + "\n"
                + "Valor bebida: " + valorBebida + "\n"
                + "Valor postre: " + valorPostre + "\n"
                + "Valor del Menú: " + calcularSubtotal() + "\n";
    }
}
