/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

import java.util.ArrayList;

public class Cuenta {

    private String nombreCliente;
    private ArrayList<Menu> listaMenus;
    private int cantidadPersonas;
    private double subtotal;
    private double valorCancelar;

    public Cuenta(String nombClien, ArrayList<Menu> listMenus, int cantiPerso) {
        this.nombreCliente = nombClien;
        this.listaMenus = listMenus;
        this.cantidadPersonas = cantiPerso;
    }

    public void establecerSubtotal() {
        subtotal = 0;
        for (Menu menu : listaMenus) {
            subtotal += menu.obtenerValorMenu();
        }
    }

    public void establecerValorCancelar() {
        double descuento = 0;
        if (cantidadPersonas >= 10 && cantidadPersonas <= 20) {
            descuento = subtotal * 0.1;
        } else if (cantidadPersonas > 20) {
            descuento = subtotal * 0.2;
        }
        valorCancelar = subtotal - descuento;
    }

    @Override
    public String toString() {
        StringBuilder a = new StringBuilder();
        a.append("Nombre del Cliente: ").append(nombreCliente).append("\n");
        a.append("Cantidad de Personas: ").append(cantidadPersonas).append("\n");
        a.append("Subtotal: ").append(subtotal).append("\n");
        a.append("Valor a Cancelar: ").append(valorCancelar).append("\n");
        a.append("Menús:\n");
        a.append("---------------------------------------------------\n");
        for (Menu menu : listaMenus) {
            a.append(menu.toString());
        }
        return a.toString();
    }
}
