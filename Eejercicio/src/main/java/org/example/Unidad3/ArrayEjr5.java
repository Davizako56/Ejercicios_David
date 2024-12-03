package org.example.Unidad3;
import java.util.Random;

public class ArrayEjr5 {
    public static void ejecuter() {
        Random random = new Random();

        int vector[] = new int[5];
        int i;

        System.out.print("Array original: ");

        for(i = 0; i < 4; i++) {
            int num = random.nextInt(0, 10);
            vector[i] = num;
            System.out.print(vector[i] + " ");
        }
        int nom = random.nextInt(0, 10);
        vector[i] = nom;
        System.out.println(vector[i]);

        System.out.print("  Array rotado: ");
        int n1 = vector[0];
        int n2 = vector[1];
        int n3 = vector[2];
        int n4 = vector[3];
        int n5 = vector[4];

        vector[0] = n5;
        System.out.print(vector[0] + " ");
        vector[1] = n1;
        System.out.print(vector[1] + " ");
        vector[2] = n2;
        System.out.print(vector[2] + " ");
        vector[3] = n3;
        System.out.print(vector[3] + " ");
        vector[4] = n4;
        System.out.print(vector[4]);

    }
}
