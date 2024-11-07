package Unidad3;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class ArrayEjr4 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int vector[] = new int[5];
        int i;
        int mun = 0;
        boolean err = true;
        boolean sol = true;

        System.out.print("Array original: ");

        for (i = 0; i < 4; i++) {
            int num = random.nextInt(0, 10);
            vector[i] = num;
            System.out.print(vector[i] + " ");

        }
        int nom = random.nextInt(0, 10);
        vector[i] = nom;
        System.out.println(vector[i]);

        while(err) {
            try {
                System.out.println("Ingresa el índice a eliminar:");
                mun = entrada.nextInt();
                err = false;
            }catch(InputMismatchException er) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        while(sol) {
            try {
                while(mun < 0 || mun > 4) {
                    System.out.println("ERROR: El elemento no existe");
                    System.out.println("Ingresa el índice a eliminar:");
                    mun = entrada.nextInt();
                }
                sol = false;
            }catch(InputMismatchException so) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }

        System.out.print("Array resultante: ");

        for(i = 0; i < mun; i++) {
            System.out.print(vector[i] + " ");
        }

        for(i = mun + 1; i < 5; i++) {

            System.out.print(vector[i] + " ");
        }
    }
}
