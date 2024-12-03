package org.example.Unidad4;
import java.util.Scanner;
import java.util.Random;

public class Modular {

    public static void ejecuter() {

        mostrarOpciones();
        String opcion_usuario = recogerOpcion();
        String opcion_sorteo = sorteo();
        comprobarResultado(opcion_usuario,opcion_sorteo);
    }

    public static void mostrarOpciones() {

        System.out.println("BIENVENIDO");
        System.out.println("Elige tu opción:");
        System.out.println("   C - cara");
        System.out.println("   X - cruz");
    }

    public static String recogerOpcion() {

        Scanner entrada = new Scanner(System.in);
        String opcion = entrada.next();

        return opcion;
    }

    public static String sorteo() {

        String opciones[] = {"cara","cruz"};
        Random random = new Random();
        String sorteo = opciones[random.nextInt(2)];

        return sorteo;
    }

    public static void comprobarResultado(String opcion,String sorteo) {

        if (opcion.equals(sorteo)) {
            System.out.println("Has ganado! Ha salido: " + sorteo);
        }else{
            System.out.println("Has perdido! Ha salido: " + sorteo);
        }
    }
}
