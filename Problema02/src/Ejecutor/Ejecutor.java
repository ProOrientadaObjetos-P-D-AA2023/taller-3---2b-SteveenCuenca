/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutor;

import Paquete01.Cuenta;

import Paquete01.MenuCarta;
import Paquete01.MenuDia;
import Paquete01.MenuEconomico;
import Paquete01.MenuNinos;

public class Ejecutor {

    public static void main(String[] args) {
        MenuNinos menuNinos1 = new MenuNinos("Niños 01",
                2.0,
                1.0,
                1.5);
        MenuNinos menuNinos2 = new MenuNinos("Niños 02",
                3.0,
                1.0,
                1.5);
        MenuEconomico menuEconomico = new MenuEconomico("Econo 001",
                4.0,
                0.25);
        MenuDia menuDia = new MenuDia("Dia 001",
                5.0,
                1.0,
                1.0);
        MenuCarta menuCarta = new MenuCarta("Carta 001",
                6.0,
                1.5,
                2.0,
                0.1);

        Cuenta cuenta = new Cuenta("René Elizalde", 0.1);
        cuenta.agregarMenu(menuNinos1);
        cuenta.agregarMenu(menuNinos2);
        cuenta.agregarMenu(menuEconomico);
        cuenta.agregarMenu(menuDia);
        cuenta.agregarMenu(menuCarta);

        System.out.println(cuenta.toString());
    }
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

 */
