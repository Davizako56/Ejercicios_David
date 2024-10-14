package org.example.Unidad2;
import java.util.Scanner;

public class Unidad2ejr5 {
    public static void main(String[] args) {
    }
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        String p1;
        String p2;
        int i = 10;

        System.out.println("Ingrese una cadena jugador 1...");
        p1 = entrada.nextLine();
        System.out.println("Ingrese una palabra jugador 2...");
        p2 = entrada.nextLine();

        while(i > 0) {
            int solucion = p1.indexOf(p2);
            if(solucion >= 0) {
                System.out.println("Enhorabuena jugador 2, has acertado la plabra!");
                i = -1;
            }else{
                i--;
                System.out.println("Has fallado jugador 2, sigue intentándolo, te quedan " + i + " intentos...");
                p2 = entrada.nextLine();

            }
        }
    }
}
