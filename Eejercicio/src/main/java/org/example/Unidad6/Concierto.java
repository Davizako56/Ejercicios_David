package org.example.Unidad6;

public class Concierto {

    public static void main(String[] args) {

        Asistente a1 = new Asistente("Carlos", 25, "VIP");
        Artista art1 = new Artista("Dua Lipa", 28, "Pop");

        System.out.println("Información del asistente:");
        a1.mostrarInfo();

        System.out.println();

        System.out.println("Información del artista:");
        art1.mostrarInfo();

        System.out.println();

        System.out.println("Organizador:");

        Organizador org1 = new Organizador("Lucas", 35, "Organizador");
        org1.mostrarInfo();
    }
}
