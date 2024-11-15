package Unidad3;
import java.util.Random;
import java.util.Arrays;

public class duplicados3 {
    public static void ejecuter() {
        Random random = new Random();

        int sorteo[] = new int[6];

        for(int i = 0; i < sorteo.length; i++) {

            sorteo[i] = random.nextInt(49) + 1;

        }
        System.out.println(Arrays.toString(sorteo));

        Arrays.sort(sorteo);

        boolean ordenados_duplicados = true;

        while(ordenados_duplicados) {
            ordenados_duplicados = false;
            for(int i = 0; i < sorteo.length; i++) {

                if(i != sorteo.length - 1 && sorteo[i] == sorteo[i + 1]) {
                    System.out.println("Duplicado: " + sorteo[i]);
                    sorteo[i] = random.nextInt(49) + 1;
                    ordenados_duplicados = true;

                }

            }
        }


        Arrays.sort(sorteo);
        System.out.println(Arrays.toString(sorteo));

    }
}
