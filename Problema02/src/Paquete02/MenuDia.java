/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

public class MenuDia extends Menu {

    private double valorBebida;
    private double valorPostre;

    public MenuDia(String nombr, double valorInic, double valorBebi, double valPostr) {
        super(nombr, valorInic);
        this.valorBebida = valorBebi;
        this.valorPostre = valPostr;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial + valorBebida + valorPostre;
    }

    @Override
    public String toString() {
        return "\nMenu del Día:\n" + super.toString();
    }
}
