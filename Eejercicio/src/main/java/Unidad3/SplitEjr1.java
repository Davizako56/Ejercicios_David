package Unidad3;
import java.util.Scanner;
import java.util.Arrays;

public class SplitEjr1 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        String[] van;
        String nav;
        int[] vector = new int[7];
        int num;
        int mun = 0;
        String[] navidad = {"n", "a", "v", "i", "d", "a", "d"};

        System.out.println("Introduce cuntas letras quieres en la palabra navidad:");
        nav = entrada.next();
        van = nav.split(",");
        System.out.println(Arrays.toString(van));

        while(van.length != 7) {
            System.out.println("ERROR: Debe de haber 7 carácteres");
            System.out.println("Introduce cuntas letras quieres en la palabra navidad:");
            nav = entrada.next();
            van = nav.split(",");
            System.out.println(Arrays.toString(van));
        }

        for(int i = 0; i < 7; i++) {
            num = Integer.parseInt(van[i]);
            vector[i] = num;
        }
        for (int i = 0; i < 7; i++) {
            while(mun < vector[i]) {
                System.out.print(navidad[i]);
                mun++;
            }
            mun = 0;
        }

        }
    }

