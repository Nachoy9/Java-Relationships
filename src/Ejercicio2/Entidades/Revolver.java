package Ejercicio2.Entidades;

import java.util.Random;

public class Revolver {

    Random random = new Random();

    private int posicionTambor;
    private final int posicionBala;

    // La bala se carga en una posicion aleatoria y el tambor se gira por lo que tambien queda en una posicion aleatoria
    // El tambor tiene 6 posiciones
    public Revolver() {
        this.posicionTambor = random.nextInt(5);
        this.posicionBala = random.nextInt(5);
    }

    public int getPosicionTambor() {
        return posicionTambor;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    // El unico atributo que puede cambiar luego de seteado es la posicion del tambor luego de cada disparo
    public void setPosicionTambor(int posicionTambor) {
        this.posicionTambor = posicionTambor;
    }

    @Override
    public String toString() {
        return  "Tambor en posicion: " + posicionTambor +
                ", Bala en posiciom: " + posicionBala;
    }
}