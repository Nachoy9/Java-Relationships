package Ejercicio2.Servicios;

import Ejercicio2.Entidades.Jugador;
import java.util.ArrayList;

public class JuegoServicio {

    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private RevolverServicio revSer = new RevolverServicio();

    public void crearJuego(int cantJugadores) {

        for (int i = 0; i < cantJugadores; i++) {

            jugadores.add(new Jugador(i+1));

        }

        revSer.cargarArma();

        mostrarArma();
    }

    public void mostrarJugadores() {

        System.out.println();

        for (int i = 0; i < jugadores.size(); i++) {

            System.out.println(jugadores.get(i).toString());

        }
    }

    public boolean disparar(int jugador) {

        Jugador disparador = jugadores.get(jugador-1);

        if (revSer.disparo()) {

            System.out.println("El arma disparó, has muerto");

            disparador.setMuerto(true);

            jugadores.set(jugador-1,disparador);

            return true;

        }

        System.out.println("El arma no disparó, pasela al que sigue.");

        return false;
    }

    public void siguientePosicion() {

        revSer.siguientePosicion();

    }

    public void mostrarArma() {

        revSer.mostrarArma();

    }
}
