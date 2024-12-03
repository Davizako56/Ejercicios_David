package org.example.Unidad3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayEjr2 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int x = 0;
        int i = 0;
        int num = 1;
        boolean err = true;

        while(err) {
            try {
                System.out.println("Introduce el tamaño del vector...");
                x = entrada.nextInt();
                err = false;
            }catch(InputMismatchException er) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }
        int vector[] = new int[x];

        System.out.print("Array original: ");
        x = x - 1;

        while(i < x){

            vector[i] = num;
            System.out.print(vector[i] + " ");
            i++;
            num++;
        }
        vector[i] = num;
        System.out.println(vector[i] + " ");

        int y = i;
        int mun = vector[y];

        System.out.print("Array invertida: ");

        while(mun >= 1) {

            vector[y] = mun;
            System.out.print(mun + " ");
            mun--;
            y--;
        }

    }
}
