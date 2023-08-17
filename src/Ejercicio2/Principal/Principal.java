/*
Realizar el juego de la ruleta rusa en Java. Como muchos saben, el juego se trata de un número de jugadores,
que, con un revolver, el cual posee una sola carga, se dispara y se mata. Las clases por hacer del juego
son las siguientes:

* Clase Revolver: esta clase posee los siguientes atributos: posición actual (posición del tambor que se dispara,
puede que esté la bala o no) y posición de bala (la posición del tambor donde se encuentra la bala). Estas dos posiciones,
se generarán aleatoriamente.

- Métodos:
• cargarArma(): le pone los valores de posición actual y de posición de la bala. Los valores deben ser aleatorios.
• disparo(): devuelve true si la posición de la bala coincide con la posición actual
• siguientePosicion(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está la bala)

* Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del jugador), nombre (Empezara con
Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica si está muerto o no el jugador). El número de jugadores
será decidido por el usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.

- Métodos:
• disparo(Revolver r): el método, recibe el revolver y llama a los métodos de disparo() y siguientePosicion() de
Revolver. El jugador se apunta, aprieta el gatillo y si el revolver dispara, el jugador se muere. El atributo muerto
pasa a true y el método devuelve true, sino false.

* Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y Revolver

- Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores y el revolver para guardarlos
en los atributos del juego.
*/

package Ejercicio2.Principal;

import java.util.Scanner;
import Ejercicio2.Servicios.JuegoServicio;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        JuegoServicio juegoSer = new JuegoServicio();

        int turno = 0, jugadores, jugador = 1;
        boolean disparo = false;

        System.out.println("Bienvenido al juego de la ruleta rusa, ingrese la cantidad de jugadores (Minimo 2 - Maximo 6)\n");
        System.out.print("Cantidad: ");

        jugadores = input.nextInt();
        input.nextLine();

        juegoSer.crearJuego(jugadores);

        juegoSer.mostrarJugadores();

        while (!disparo) {

            if (turno+1 > jugadores) {
                jugador = 1;
            }

            System.out.println("\nTurno Nro " + (turno+1) + " el arma la tiene el Jugador Nro " + jugador);
            System.out.println("Presione enter para jalar el gatillo");
            input.nextLine();

            disparo = juegoSer.disparar(jugador);

            if (!disparo) {
                juegoSer.siguientePosicion();
            } else {
                System.out.println("Juego terminado");
            }

            juegoSer.mostrarJugadores();

            jugador++;
            turno++;

        }

    }
}
