package org.example.Unidad2;
import java.util.Scanner;

public class BuclesEjr1 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        String contraseña = "Patata";
        String texto;

        System.out.println("Introduzca la contraseña...");
        texto = entrada.next();

        while (!texto.equals(contraseña)) {
            System.out.println("Contraseña incorrecta");
            texto = entrada.next();
        }
        System.out.println("Contraseña correcta. Bienvenido usuario.");









    }
}
