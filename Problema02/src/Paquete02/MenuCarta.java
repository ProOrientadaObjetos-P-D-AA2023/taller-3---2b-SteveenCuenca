/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

public class MenuCarta extends Menu {

    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;

    public MenuCarta(String nombre, double valoInic, double valoGuarni, double valBebi, double porcentAdici) {
        super(nombre, valoInic);
        this.valorGuarnicion = valoGuarni;
        this.valorBebida = valBebi;
        this.porcentajeAdicional = porcentAdici;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial + valorGuarnicion + valorBebida;
        double porcentajeAdicionalValorInicial = valorInicial * (porcentajeAdicional / 100);
        valorMenu += porcentajeAdicionalValorInicial;
    }

    @Override
    public String toString() {
        return "\nMenu a la Carta:\n" + super.toString();
    }
}
