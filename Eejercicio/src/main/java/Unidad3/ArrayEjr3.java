package Unidad3;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class ArrayEjr3 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int x = 0;
        int i;
        int mun = 0;
        boolean err = true;

        int vector[] = new int[25];
        int y = 0;

        while(y < 25) {
            int num = random.nextInt(0,101);
            vector[y] = num;
            y++;

        }

        while(err) {
            try {
                System.out.println("Introduzca un número...");
                x = entrada.nextInt();
                err = false;
            }catch(InputMismatchException er) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        for(i = 0; i < 25; i++) {

            if(x == vector[i]) {

                mun++;
            }

            i++;
        }
        System.out.println("El número " + x + " aparece " + mun + " veces en el array.");

    }
}
