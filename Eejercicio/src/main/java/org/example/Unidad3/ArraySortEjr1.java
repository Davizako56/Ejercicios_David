package org.example.Unidad3;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ArraySortEjr1 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int vector[] = {1, 1, 2, 2, 4, 6, 9};
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.binarySearch(vector, 1));
        int auxiliar[] = new int[vector.length];
        int array[];

        for(int i = 0; i < vector.length; i++) {
            if (vector[i] == vector[i + 1]) {
                auxiliar[i] = vector[i];
            }
        }
    }
}
