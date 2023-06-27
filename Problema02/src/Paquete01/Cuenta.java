/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete01;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Cuenta {

    private String nombreCliente;
    private double iva;
    private List<Menu> menuList;
    private double valorTotal;

    public Cuenta(String nombreCl, double iva) {
        this.nombreCliente = nombreCl;
        this.iva = iva;
        this.menuList = new ArrayList<>();
        this.valorTotal = 0;
    }

    public void agregarMenu(Menu menu) {
        menuList.add(menu);
        valorTotal += menu.calcularSubtotal();
    }

    public double calcularSubtotal() {
        return valorTotal / (1 + iva);
    }

    public double calcularValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        StringBuilder sb = new StringBuilder();
        sb.append("Factura\n");
        sb.append("Cliente: ").append(nombreCliente).append("\n\n");
        for (Menu menu : menuList) {
            sb.append(menu.toString());
        }
        sb.append("Subtotal: ").append(decimalFormat.format(calcularSubtotal())).append("\n");
        sb.append("IVA: ").append(decimalFormat.format(iva * 100)).append("%\n");
        sb.append("Total a pagar: ").append(decimalFormat.format(calcularValorTotal())).append("\n");
        return sb.toString();
    }
}
