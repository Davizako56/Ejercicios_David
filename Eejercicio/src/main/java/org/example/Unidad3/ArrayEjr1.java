package org.example.Unidad3;
import java.util.Random;

public class ArrayEjr1 {
    public static void ejecuter() {
        Random random = new Random();

        int vector[] = new int[8];
        int i = 0;
        int res = 0;

        while(i < 8) {
            int num = random.nextInt(0,501);
            vector[i] = num;
            res += vector[i];
            i++;
        }
        System.out.println("La suma de los elementos es: " + res);
    }
}
