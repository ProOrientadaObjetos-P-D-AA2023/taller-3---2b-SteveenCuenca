/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

public class MenuNinos extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nombre, double valrIn, double valrHela, double valrPast) {
        super(nombre, valrIn);
        this.valorHelado = valrHela;
        this.valorPastel = valrPast;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial + valorHelado + valorPastel;
    }

    @Override
    public String toString() {
        return "\nMenu para Niños:\n" + super.toString();
    }
}
