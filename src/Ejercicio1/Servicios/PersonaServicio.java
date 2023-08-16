package Ejercicio1.Servicios;

import Ejercicio1.Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaServicio {

    private Scanner input = new Scanner(System.in);
    private ArrayList<Persona> personas = new ArrayList<>();

    public void ingresarpersona() {

        Persona persona = new Persona();

        System.out.println("\nIngrese el nombre de la persona Nro " + (personas.size()+1) + ":");
        persona.setNombre(input.nextLine());

        System.out.println("Ingrese el apellido de la persona Nro " + (personas.size()+1) + ":");
        persona.setApellido(input.nextLine());

        System.out.println("Ingrese el documento de la persona Nro " + (personas.size()+1) + ":");
        persona.setDocumento(input.nextInt());
        input.nextLine();

        System.out.println("Ingrese la edad de la persona Nro " + (personas.size()+1) + ":");
        persona.setEdad(input.nextInt());
        input.nextLine();

        personas.add(persona);
    }

    public int cantPersonas() {
        return personas.size();
    }

    public void asignarPerros(PerroServicio perroSer) {

        for (int i = 0; i < personas.size(); i++) {

            Persona persona = personas.get(i);

            persona.setPerro(perroSer.perroAleatorio());

        }
    }

    public void mostrarInfo() {

        for (int i = 0; i < personas.size(); i++) {

            System.out.println((i+1) + ". " + personas.get(i).toString());

        }
    }
}
