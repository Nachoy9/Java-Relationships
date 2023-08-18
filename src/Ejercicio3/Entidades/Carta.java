package Ejercicio3.Entidades;

import java.util.ArrayList;

public class Carta {

    private String palo;
    private String[] palos = {"Oro","Copa","Espada","Basto"};

    private int numero;
    private int[] numeros = {1,2,3,4,5,6,7,10,11,12};

    public Carta() {
    }

    public Carta(int palo, int numero) {
        this.palo = palos[palo];
        this.numero = numeros[numero];
    }

    public void setPalo(int palo) {
        this.palo = palos[palo];
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public String[] getPalos() {
        return palos;
    }

    public int getNumero() {
        return numero;
    }

    public int[] getNumeros() {
        return numeros;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}
