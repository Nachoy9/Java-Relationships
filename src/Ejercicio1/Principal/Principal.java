/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear misma cantidad de personas Personas y de Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro de forma aleatoria y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
*/

package Ejercicio1.Principal;

import Ejercicio1.Servicios.PerroServicio;
import Ejercicio1.Servicios.PersonaServicio;
import java.util.Scanner;

public class Principal {

    private static PerroServicio perroSer = new PerroServicio();
    private static PersonaServicio persSer = new PersonaServicio();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String salir = "s";

        System.out.println("Bienvenido");

        while (salir.equalsIgnoreCase("s")) {

            perroSer.ingresarPerro();

            if (perroSer.cantPerros() >= 2) {
                System.out.println("\nDesea ingresar otro perro? s/n");
                salir = input.nextLine();
            }
        }

        while (persSer.cantPersonas() < perroSer.cantPerros()) {
            persSer.ingresarpersona();
        }

        persSer.asignarPerros(perroSer);

        System.out.println();
        persSer.mostrarInfo();

    }
}
