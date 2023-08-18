/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
*/

package Ejercicio3.Principal;

import Ejercicio3.Servicios.Baraja;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Baraja baraja = new Baraja();

        boolean salir = false;
        int opc;

        System.out.println("Bienvenido");

        while (!salir) {

            System.out.println("\n1. Añadir baraja al mazo.");
            System.out.println("2. Barajar cartas.");
            System.out.println("3. Mostrar cartas en mazo.");
            System.out.println("4. Mostrar cartas en monton.");
            System.out.println("5. Mostrar siguiente carta en mazo.");
            System.out.println("6. Dar una carta");
            System.out.println("7. Dar cartas.");
            System.out.println("8. Salir.");
            System.out.print("\nIngrese opcion: ");
            opc = input.nextInt();
            input.nextLine();

            switch (opc) {
                case 1:
                    baraja.nuevoMazo();
                    break;
                case 2:
                    baraja.barajar();
                    break;
                case 3:
                    baraja.mostrarMazo();
                    break;
                case 4:
                    baraja.mostrarMonton();
                    break;
                case 5:
                    System.out.println("\nLa siguiente carta es:");
                    baraja.siguienteCarta();
                    break;
                case 6:
                    baraja.darCartas(1);
                    break;
                case 7:
                    System.out.println("\nIngrese cantidad de cartas a recibir:");
                    baraja.darCartas(input.nextInt());
                    input.nextLine();
                    break;
                case 8:
                    System.out.println("\nCerrando aplicacion.");
                    salir = true;
                    break;
                default:
                    System.out.println("Error. Intente nuevamente.");
                    break;
            }
        }
    }
}
