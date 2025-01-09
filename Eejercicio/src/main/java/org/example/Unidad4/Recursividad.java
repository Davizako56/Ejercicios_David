package org.example.Unidad4;

public class Recursividad {
    public static void ejecuter() {

        String asteriscos = "* ";

        for (int i = 0; i < 4; i++) {
            System.out.print(asteriscos);
            asteriscos += "* ";
            System.out.println();
        }
    }
}
