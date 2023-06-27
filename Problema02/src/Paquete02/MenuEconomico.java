/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico(String nombe, double valorInici, double porcentaDescu) {
        super(nombe, valorInici);
        this.porcentajeDescuento = porcentaDescu;
    }

    @Override
    public void establecerValorMenu() {
        double descuento = valorInicial * (porcentajeDescuento / 100);
        valorMenu = valorInicial - descuento;
    }

    @Override
    public String toString() {
        return "\nMenu Económico:\n" + super.toString();
    }
}
