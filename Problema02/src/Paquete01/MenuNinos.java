/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete01;

public class MenuNinos extends Menu {
    private double valorInicial;
    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nomPla, double valIni, double valHel, double valPast) {
        super(nomPla, 0); 
        this.valorInicial = valIni;
        this.valorHelado = valHel;
        this.valorPastel = valPast;
    }

    @Override
    public double calcularSubtotal() {
        return valorInicial + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        return "\n" + "Menu de Niños:\n" +
                "Plato: " + nombrePlato + "\n" +
                "Valor Inicial: " + valorInicial + "\n" +
                "Valor helado: " + valorHelado + "\n" +
                "Valor pastel: " + valorPastel + "\n" +
                "Valor del Menú: " + calcularSubtotal() + "\n";
    }
}
