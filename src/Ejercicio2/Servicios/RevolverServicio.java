package Ejercicio2.Servicios;

import Ejercicio2.Entidades.Revolver;

public class RevolverServicio {

    private Revolver revolver;

    public void cargarArma() {
        revolver = new Revolver();
    }

    public boolean disparo() {

        if (revolver.getPosicionTambor() == revolver.getPosicionBala()) {
            return true;
        }

        return false;

    }

    public void siguientePosicion() {

        if (revolver.getPosicionTambor() == 5) {
            revolver.setPosicionTambor(0);
        } else {
            revolver.setPosicionTambor(revolver.getPosicionTambor()+1);
        }

    }

    public void mostrarArma() {
        System.out.println("\n" + revolver.toString());
    }
}