package Unidad3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Unidad3Practica1 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int[] vector = new int[7];
        int[] array = new int[7];
        int i;
        int res1 = 0;
        int res2 = 0;
        int num;
        int mun;
        String[] eq1;
        String en1;

        System.out.println("Equipo 1");
        System.out.println("Introduce potencia de los samurais:");
        en1 = entrada.next();
        eq1 = en1.split(",");
        System.out.println(Arrays.toString(eq1));

        while (eq1.length != 7)  {
            System.out.println("ERROR: El equipo debe ser de 7.");
            System.out.println("Introduce potencia de los samurais:");
            en1 = entrada.next();
            eq1 = en1.split(",");
            System.out.println(Arrays.toString(eq1));
        }

        for (i = 0; i < 7; i++) {
            num = Integer.parseInt(eq1[i]);
            vector[i] = num;
        }

        res1 = 0;

        for (i = 0; i < 7; i++) {
            res1 += vector[i];
        }

        while (res1 != 30) {
            System.out.println("ERROR: La potencia total no es 30.");
            System.out.println("Introduce la potencia de los samurais:");
            en1 = entrada.next();
            eq1 = en1.split(",");
            System.out.println(Arrays.toString(eq1));

            for (i = 0; i < 7; i++) {
                num = Integer.parseInt(eq1[i]);
                vector[i] = num;
            }

            res1 = 0;

            for (i = 0; i < 7; i++) {
                res1 += vector[i];
            }

        }

        System.out.println("Equipo 2");
        System.out.println("Introduce la potencia de los samurais");
        String[] eq2;
        String en2;
        en2 = entrada.next();
        eq2 = en2.split(",");
        System.out.println(Arrays.toString(eq2));

        while (eq2.length != 7)  {
            System.out.println("ERROR: El equipo debe ser de 7.");
            System.out.println("Introduce potencia de los samurais:");
            en2 = entrada.next();
            eq2 = en2.split(",");
            System.out.println(Arrays.toString(eq2));
        }

        for (i = 0; i < 7; i++) {
            mun = Integer.parseInt(eq2[i]);
            array[i] = mun;
        }

        res2 = 0;

        for (i = 0; i < 7; i++) {
            res2 += array[i];
        }

        while (res2 != 30) {
            System.out.println("ERROR: La potencia total no es 30.");
            System.out.println("Introduce la potencia de los samurais:");
            en2 = entrada.next();
            eq2 = en2.split(",");
            System.out.println(Arrays.toString(eq2));

            for (i = 0; i < 7; i++) {
                mun = Integer.parseInt(eq2[i]);
                array[i] = mun;
            }

            res2 = 0;

            for (i = 0; i < 7; i++) {
                res2 += array[i];
            }

        }

        System.out.println("¡Que empiece la batalla!");

        int x = 0;
        int y = 0;
        int sam = random.nextInt(1,8);
        int cam = sam - 1;
        int j = 0;
        int k = 0;

        System.out.println("La batalla inicia con el samurai " + sam + ".");

        while (sam <= 7) {

            switch(sam) {

                case 1:
                    System.out.println("Samurai 1");
                    if (vector[0] == array[0]) {
                        System.out.println("Ha sido un empate");
                        sam++;
                    }

                    if (vector[0] > array[0]) {
                        System.out.println("Gana el equipo 1");
                        x++;
                        k++;
                        sam++;
                    }

                    if (vector[0] < array[0]) {
                        System.out.println("Gana el equipo 2");
                        y++;
                        j++;
                        sam++;
                    }

                case 2:
                    System.out.println("Samurai 2");
                    if (vector[1] == array[1]) {
                        System.out.println("Ha sido un empate");
                        sam++;
                    }

                    if (vector[1] > array[1]) {
                        System.out.println("Gana el equipo 1");
                        x++;
                        k++;
                        sam++;
                    }

                    if (vector[1] < array[1]) {
                        System.out.println("Gana el equipo 2");
                        y++;
                        j++;
                        sam++;
                    }

                case 3:
                    System.out.println("Samurai 3");
                    if (vector[2] == array[2]) {
                        System.out.println("Ha sido un empate");
                        sam++;
                    }

                    if (vector[2] > array[2]) {
                        System.out.println("Gana el equipo 1");
                        x++;
                        k++;
                        sam++;
                    }

                    if (vector[2] < array[2]) {
                        System.out.println("Gana el equipo 2");
                        y++;
                        j++;
                        sam++;
                    }

                case 4:
                    System.out.println("Samurai 4");
                    if (vector[3] == array[3]) {
                        System.out.println("Ha sido un empate");
                        sam++;
                    }

                    if (vector[3] > array[3]) {
                        System.out.println("Gana el equipo 1");
                        x++;
                        k++;
                        sam++;
                    }

                    if (vector[3] < array[3]) {
                        System.out.println("Gana el equipo 2");
                        y++;
                        j++;
                        sam++;
                    }

                case 5:
                    System.out.println("Samurai 5");
                    if (vector[4] == array[4]) {
                        System.out.println("Ha sido un empate");
                        sam++;
                    }

                    if (vector[4] > array[4]) {
                        System.out.println("Gana el equipo 1");
                        x++;
                        k++;
                        sam++;
                    }

                    if (vector[4] < array[4]) {
                        System.out.println("Gana el equipo 2");
                        y++;
                        j++;
                        sam++;
                    }

                case 6:
                    System.out.println("Samurai 6");
                    if (vector[5] == array[5]) {
                        System.out.println("Ha sido un empate");
                        sam++;
                    }

                    if (vector[5] > array[5]) {
                        System.out.println("Gana el equipo 1");
                        x++;
                        k++;
                        sam++;
                    }

                    if (vector[5] < array[5]) {
                        System.out.println("Gana el equipo 2");
                        y++;
                        j++;
                        sam++;
                    }

                case 7:
                    System.out.println("Samurai 7");
                    if (vector[6] == array[6]) {
                        System.out.println("Ha sido un empate");
                        sam++;
                    }

                    if (vector[6] > array[6]) {
                        System.out.println("Gana el equipo 1");
                        x++;
                        k++;
                        sam++;
                    }

                    if (vector[6] < array[6]) {
                        System.out.println("Gana el equipo 2");
                        y++;
                        j++;
                        sam++;
                    }
            }

        }

        if (sam > 7) {

            sam = 1;

                switch(sam) {

                    case 1:
                        if (sam > cam) {
                            break;
                        }

                        System.out.println("Samurai 1");
                        if (vector[0] == array[0]) {
                            System.out.println("Ha sido un empate");
                            sam++;
                        }

                        if (vector[0] > array[0]) {
                            System.out.println("Gana el equipo 1");
                            x++;
                            k++;
                            sam++;
                        }

                        if (vector[0] < array[0]) {
                            System.out.println("Gana el equipo 2");
                            y++;
                            j++;
                            sam++;
                        }

                    case 2:
                        if (sam > cam) {
                            break;
                        }

                        System.out.println("Samurai 2");
                        if (vector[1] == array[1]) {
                            System.out.println("Ha sido un empate");
                            sam++;
                        }

                        if (vector[1] > array[1]) {
                            System.out.println("Gana el equipo 1");
                            x++;
                            k++;
                            sam++;
                        }

                        if (vector[1] < array[1]) {
                            System.out.println("Gana el equipo 2");
                            y++;
                            j++;
                            sam++;
                        }


                    case 3:
                        if (sam > cam) {
                            break;
                        }

                        System.out.println("Samurai 3");
                        if (vector[2] == array[2]) {
                            System.out.println("Ha sido un empate");
                            sam++;
                        }

                        if (vector[2] > array[2]) {
                            System.out.println("Gana el equipo 1");
                            x++;
                            k++;
                            sam++;
                        }

                        if (vector[2] < array[2]) {
                            System.out.println("Gana el equipo 2");
                            y++;
                            j++;
                            sam++;
                        }


                    case 4:
                        if (sam > cam) {
                            break;
                        }

                        System.out.println("Samurai 4");
                        if (vector[3] == array[3]) {
                            System.out.println("Ha sido un empate");
                            sam++;
                        }

                        if (vector[3] > array[3]) {
                            System.out.println("Gana el equipo 1");
                            x++;
                            k++;
                            sam++;
                        }

                        if (vector[3] < array[3]) {
                            System.out.println("Gana el equipo 2");
                            y++;
                            j++;
                            sam++;
                        }


                    case 5:
                        if (sam > cam) {
                            break;
                        }

                        System.out.println("Samurai 5");
                        if (vector[4] == array[4]) {
                            System.out.println("Ha sido un empate");
                            sam++;
                        }

                        if (vector[4] > array[4]) {
                            System.out.println("Gana el equipo 1");
                            x++;
                            k++;
                            sam++;
                        }

                        if (vector[4] < array[4]) {
                            System.out.println("Gana el equipo 2");
                            y++;
                            j++;
                            sam++;
                        }


                    case 6:
                        if (sam > cam) {
                            break;
                        }

                        System.out.println("Samurai 6");
                        if (vector[5] == array[5]) {
                            System.out.println("Ha sido un empate");
                            sam++;
                        }

                        if (vector[5] > array[5]) {
                            System.out.println("Gana el equipo 1");
                            x++;
                            k++;
                            sam++;
                        }

                        if (vector[5] < array[5]) {
                            System.out.println("Gana el equipo 2");
                            y++;
                            j++;
                            sam++;
                        }


                    case 7:
                        if (sam > cam) {
                            break;
                        }

                        System.out.println("Samurai 7");
                        if (vector[6] == array[6]) {
                            System.out.println("Ha sido un empate");
                            sam++;
                        }

                        if (vector[6] > array[6]) {
                            System.out.println("Gana el equipo 1");
                            x++;
                            k++;
                            sam++;
                        }

                        if (vector[6] < array[6]) {
                            System.out.println("Gana el equipo 2");
                            y++;
                            j++;
                            sam++;
                        }

                }

        }

        if (x == y) {
            System.out.println("La partida ha acabado en empate...");

        }

        if (x > y) {
            System.out.println("El equipo 1 ha salido victorioso");
            System.out.println("El equipo 2 ha tenido " + k + " bajas");

        }

        if (x < y) {
            System.out.println("El equipo 2 ha salido victorioso");
            System.out.println("El equipo 1 ha tenido " + j + " bajas");
        }





        }
    }
