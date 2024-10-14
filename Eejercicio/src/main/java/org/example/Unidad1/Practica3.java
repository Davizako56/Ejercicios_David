package org.example.Unidad1;
import java.util.Scanner;
public class Practica3 {
    public static void main(String[] args) {
    }
    public void ejecuter() {
        System.out.println("¿Cómo te llamas?");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();

        System.out.println("Hola " + nombre + ". " + "Introduce tu edad:");
        int edad = entrada.nextInt();
        if(edad >= 18) {
            System.out.println("Enhorabuena " + nombre + ". " + "Puedes votar.");
        }else{
            int subedad = 18 - edad;
            System.out.println("Lo siento " + nombre + ". " + "No puedes votar.");
            System.out.println("Te faltan " + subedad + " años para ser mayor de edad.");


        }

    }
}
