package Ejercicio2.Entidades;

public class Jugador {

    private int id;
    private String nombre;
    private boolean muerto;

    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = ("Jugador " + id);
        this.muerto = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    @Override
    public String toString() {

        if (muerto) {
            return nombre + " - Muerto";
        }

        return nombre + " - Vivo";

    }
}