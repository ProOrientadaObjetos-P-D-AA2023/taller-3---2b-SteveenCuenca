/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete01;

public class MenuCarta extends Menu {

    private double valorInicial;
    private double valorGuarnicion;
    private double valorBebida;
    private double porcentajeServicio;

    public MenuCarta(String nomPlato, double valInicial, double valGuar, double valBebida, double porcenjeServ) {
        super(nomPlato, 0);
        this.valorInicial = valInicial;
        this.valorGuarnicion = valGuar;
        this.valorBebida = valBebida;
        this.porcentajeServicio = porcenjeServ;
    }

    @Override
    public double calcularSubtotal() {
        double subtotal = valorInicial + valorGuarnicion + valorBebida;
        return subtotal + (subtotal * porcentajeServicio);
    }

    @Override
    public String toString() {
        return "\n" + "Menu a la Carta:\n"
                + "Plato: " + nombrePlato + "\n"
                + "Valor Inicial: " + valorInicial + "\n"
                + "Valor guarnición: " + valorGuarnicion + "\n"
                + "Valor bebida: " + valorBebida + "\n"
                + "Porcentaje Adicional: " + porcentajeServicio + "\n"
                + "Valor del Menú: " + calcularSubtotal() + "\n";
    }
}
