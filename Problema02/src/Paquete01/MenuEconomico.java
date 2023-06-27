/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete01;

public class MenuEconomico extends Menu {

    private double valorInicial;
    private double porcentajeDescuento;

    public MenuEconomico(String nomPla, double valIni, double porcenDesc) {
        super(nomPla, 0);
        this.valorInicial = valIni;
        this.porcentajeDescuento = porcenDesc;
    }

    @Override
    public double calcularSubtotal() {
        return valorInicial - (valorInicial * porcentajeDescuento);
    }

    @Override
    public String toString() {
        return "\n" + "Menu Económico:\n"
                + "Plato: " + nombrePlato + "\n"
                + "Valor Inicial: " + valorInicial + "\n"
                + "Porcentaje Descuento: " + porcentajeDescuento * 100 + "%\n"
                + "Valor del Menú: " + calcularSubtotal() + "\n";
    }
}
