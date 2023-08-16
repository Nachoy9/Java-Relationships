package Ejercicio1.Servicios;

import Ejercicio1.Entidades.Perro;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class PerroServicio  {

    private Scanner input = new Scanner(System.in);
    private ArrayList<Perro> perros = new ArrayList<>();

    public void ingresarPerro() {

        Perro perro = new Perro();

        System.out.println("\nIngrese el nombre del perro Nro " + (perros.size()+1) + ":");
        perro.setNombre(input.nextLine());

        System.out.println("Ingrese la raza del perro Nro " + (perros.size()+1) + ":");
        perro.setRaza(input.nextLine());

        System.out.println("Ingrese la edad del perro Nro " + (perros.size()+1) + " en años:");
        perro.setEdad(input.nextInt());
        input.nextLine();

        System.out.println("Ingrese el peso del perro Nro " + (perros.size()+1) + " en kg:");
        perro.setPeso(input.nextDouble());
        input.nextLine();

        perro.setAdoptado(false);

        perros.add(perro);

    }

    public int cantPerros() {
        return perros.size();
    }

    public Perro perroAleatorio() {

        Random random = new Random();
        boolean adoptado = false;

        while (!adoptado) {

            int ran = random.nextInt(perros.size());

            Perro perroAux = perros.get(ran);

            if (!perroAux.isAdoptado()) {

                adoptado = true;
                perroAux.setAdoptado(adoptado);
                perros.set(ran,perroAux);

                return perroAux;
            }
        }

        return null;
    }
}
