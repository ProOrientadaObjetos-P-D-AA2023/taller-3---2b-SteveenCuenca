/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecutor;

import java.util.ArrayList;
import Paquete02.Cuenta;
import Paquete02.Menu;
import Paquete02.MenuCarta;
import Paquete02.MenuDia;
import Paquete02.MenuEconomico;
import Paquete02.MenuNinos;

public class Ejecutor01 {

    public static void main(String[] args) {
        ArrayList<Menu> lista = new ArrayList<>();

        String[][] datos001 = {
            {"Niños 01", "2.00", "1", "1.5"},
            {"Niños 02", "3.00", "1", "1.5"},
            {"Niños 03", "2.00", "2", "0.5"}
        };

        String[][] datos002 = {
            {"Econo 001", "4", "25"},
            {"Econo 002", "4", "15"},
            {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {
            {"Dia 001", "5", "1", "1"},
            {"Dia 002", "6", "2", "2"},
            {"Dia 003", "5.5", "3", "1"}
        };

        String[][] datos004 = {
            {"Carta 001", "6", "1.5", "2", "10"},
            {"Carta 002", "7", "1.7", "2.1", "5"},
            {"Carta 003", "8", "1.9", "2.2", "5"},
            {"Carta 004", "9", "2.5", "2.9", "5"}
        };

        for (String[] datos : datos004) {
            String nombre = datos[0];
            double valorInicial = Double.parseDouble(datos[1]);
            double valorGuarnicion = Double.parseDouble(datos[2]);
            double valorBebida = Double.parseDouble(datos[3]);
            double porcentajeAdicional = Double.parseDouble(datos[4]);

            MenuCarta menuC = new MenuCarta(nombre, valorInicial, valorGuarnicion, valorBebida, porcentajeAdicional);
            lista.add(menuC);
        }

        for (String[] datos : datos003) {
            String nombre = datos[0];
            double valorInicial = Double.parseDouble(datos[1]);
            double valorBebida = Double.parseDouble(datos[2]);
            double valorPostre = Double.parseDouble(datos[3]);

            MenuDia menuD = new MenuDia(nombre, valorInicial, valorBebida, valorPostre);
            lista.add(menuD);
        }

        for (String[] datos : datos002) {
            String nombre = datos[0];
            double valorInicial = Double.parseDouble(datos[1]);
            double porcentajeDescuento = Double.parseDouble(datos[2]);

            MenuEconomico menuE = new MenuEconomico(nombre, valorInicial, porcentajeDescuento);
            lista.add(menuE);
        }

        for (String[] datos : datos001) {
            String nombre = datos[0];
            double valorInicial = Double.parseDouble(datos[1]);
            double valorHelado = Double.parseDouble(datos[2]);
            double valorPastel = Double.parseDouble(datos[3]);

            MenuNinos menuNinos = new MenuNinos(nombre, valorInicial, valorHelado, valorPastel);
            lista.add(menuNinos);
        }

        for (Menu menu : lista) {
            menu.establecerValorMenu();
        }

        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 10);
        miCuenta.establecerSubtotal();
        miCuenta.establecerValorCancelar();
        System.out.printf("%s\n", miCuenta);
    }
}
