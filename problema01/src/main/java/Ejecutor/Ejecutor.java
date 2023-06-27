/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Ejecutor;

import java.util.Scanner;
import Paquete01.Arquero;
import Paquete01.Guerrero;
import Paquete01.Mago;

public class Ejecutor {

    public static void main(String[] args) {
        System.out.println("Problematica del videojuego");

        Scanner entrada = new Scanner(System.in);

        Guerrero guerrero = new Guerrero(450, "Aragorn", 5, 150);

        Mago mago = new Mago(400, "Gandalf", 4, 120);

        Arquero arquero = new Arquero(400, "Legolas", 3, 150);

        boolean bandera = true;

        System.out.println("""
                                      <<INFORMACION DE LA BATALLA>> 
                           Si el personaje tiene:
                           >Personaje de mayor nivel gana la batalla y subira un nivel
                           >Personaje de menor nivel pierde la batalla y baja un nivel
                           >Personajes de igual nivel empatan y ambos suben de nivel
                           >Sus niveles maximos seran 10""");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        while (bandera) {

            System.out.println("""
                               >>Batalla
                               Para que el Arquero ataque al mago                  [1]
                               Para que el mago ataque al Guerrero                 [2]
                               Para que el guerrero ataque al arquero              [3]
                               Salir y  Mostrar los nuevo datos de los personajes  [4]""");
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("El enfrentamiento ha empezado");

                    arquero.atacar();
                    System.out.println("Al mago " + mago.getNombre());
                    if (arquero.getNivel() > mago.getNivel()) {
                        System.out.println("el arquero ha dañado al mago "
                                + mago.getNombre() + " "
                                + "y ha resultado ser el vencedor");

                        arquero.aumentarNivel();

                    }
                    if (arquero.getNivel() < mago.getNivel()) {
                        mago.defender();
                        System.out.println("y!!!!");
                        mago.atacar();
                        System.out.println("El arquero " + arquero.getNombre()
                                + " perdio la batalla");
                        mago.aumentarNivel();
                        arquero.bajarNivel();

                    } else if (arquero.getNivel() == mago.getNivel()) {
                        arquero.Empate();
                    }
                    System.out.println("-------------");
                }

                case 2 -> {
                    System.out.println("El enfrentamiento ha empezado");

                    mago.atacar();
                    System.out.println("al Guerrero " + guerrero.getNombre());
                    if (mago.getNivel() > guerrero.getNivel()) {
                        System.out.println("El Mago " + mago.getNombre()
                                + " hizo daño al guerrero " + guerrero.getNombre()
                                + " y gano la batalla");

                        mago.aumentarNivel();

                    }
                    if (mago.getNivel() == guerrero.getNivel()) {

                        mago.Empate();

                    } else if (mago.getNivel() < guerrero.getNivel()) {
                        guerrero.defender();

                        System.out.println("El mago " + mago.getNombre() + " se retira");

                    }
                    System.out.println("----------");
                }
                case 3 -> {
                    System.out.println("El enfrentamiento ha empezado");

                    guerrero.atacar();
                    System.out.println("al arquero " + arquero.getNombre());
                    if (guerrero.getNivel() > arquero.getNivel()) {
                        System.out.println("El guerrero hizo daño al arquero  "
                                + arquero.getNombre() + " y gano la batalla");

                        guerrero.aumentarNivel();

                    }
                    if (guerrero.getNivel() == arquero.getNivel()) {
                        guerrero.Empate();
                    } else if (guerrero.getNivel() < arquero.getNivel()) {
                        arquero.defender();
                        System.out.println("El " + guerrero.getNombre() + " se retira");

                    }
                }
                case 4 -> {
                    bandera = false;
                    System.out.println("Salinedo del modo batalla");
                    System.out.println("----------------------------");
                    System.out.printf("""
                                      personaje:
                                      guerrero--> nombre: %s  Fuerza: %d  Nivel: %d Puntos de vida: %d""",
                            guerrero.getNombre(),
                            guerrero.getFuerza(),
                            guerrero.getNivel(),
                            guerrero.getPuntosVida());

                    System.out.println("\n-----------------\n");
                    System.out.printf("Mago:-->  nombre: %s  Poder Magico: "
                            + "%d  Nivel: %d Puntos de vida: %d",
                            mago.getNombre(),
                            mago.getPoderMagico(),
                            mago.getNivel(),
                            mago.getPuntosVida());

                    System.out.println("\n----------------\n");
                    System.out.printf("Arquero: --> nombre: %s  Precicion: "
                            + "%s  Nivel: %d Puntos de vida: %d",
                            arquero.getNombre(),
                            arquero.getPrecicion(),
                            arquero.getNivel(),
                            arquero.getPuntosVida());
                }
                default ->
                    System.out.println("Error de opcion de batalla");
            }
        }
    }
}
