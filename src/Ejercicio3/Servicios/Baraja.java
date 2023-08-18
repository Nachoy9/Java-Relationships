package Ejercicio3.Servicios;

import Ejercicio3.Entidades.Carta;

import java.util.ArrayList;
import java.util.Collections;


public class Baraja {

    private ArrayList<Carta> baraja = new ArrayList<>();
    private ArrayList<Carta> monton = new ArrayList<>();

    public void nuevoMazo() {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 10; j++) {

                baraja.add(new Carta(i,j));

            }
        }
    }

    public void barajar() {
        Collections.shuffle(baraja);
    }

    public void siguienteCarta() {

        if (baraja.size() > 0) {
            System.out.println(baraja.get(0).toString());
        } else {
            System.out.println("\nNo quedan cartas en el mazo");
        }
    }

    public int cartasDisponibles() {
        return baraja.size();
    }

    public void mostrarMazo() {

        if (cartasDisponibles() > 0) {

            System.out.println("\nCartas en el mazo:\n");

            for (int i = 0; i < cartasDisponibles(); i++) {
                System.out.println(baraja.get(i).toString());
            }

        } else {
            System.out.println("\nNo hay cartas en el mazo.");
        }
    }

    public void darCartas(int cant) {

        int dar = cant;

        if (cartasDisponibles() == 0) {

            System.out.println("\nNo hay cartas en el mazo.");
            return;

        } else if (cant > cartasDisponibles()) {

            System.out.println("\nEn el mazo hay menos cartas. Se darán todas:\n");
            dar = cartasDisponibles();

        } else {

            System.out.println("\nDando cartas:\n");

        }

        for (int i = 0; i < dar; i++) {

            siguienteCarta();
            monton.add(baraja.get(0));
            baraja.remove(0);

        }
    }

    public int cartasMonton() {
        return monton.size();
    }

    public void mostrarMonton() {

        if (cartasMonton() > 0) {

            System.out.println("\nCartas en el monton:\n");

            for (int i = 0; i < cartasMonton(); i++) {
                System.out.println(monton.get(i).toString());
            }

        } else {
            System.out.println("\nNo hay cartas en el monton.");
        }
    }
}
