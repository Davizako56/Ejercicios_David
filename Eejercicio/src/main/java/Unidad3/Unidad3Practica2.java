package Unidad3;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Unidad3Practica2 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        Integer vector[] = new Integer[6];
        String[] bol;
        String bot;
        Integer boleto[] = new Integer[7];
        int aciertos = 0;

        for(int i = 0; i < 6; i++) {
            int val = random.nextInt(1,50);
            vector[i] = val;
        }

        int com = random.nextInt(1,50);
        int re = random.nextInt(0, 10);

        do {
            for(int i = 0; i < 6; i++) {
                int val = random.nextInt(1,50);
                vector[i] = val;
            }
            //array = (Integer[]) Arrays.stream(vector).distinct().toArray();
        }while(Arrays.stream(vector).distinct().toArray().length < vector.length);

        System.out.println(Arrays.toString(vector));
        System.out.println("Reintegro: " + re);
        System.out.println("Complementario: " + com);

        System.out.println("Introduzca los datos de su boleto (nn-nn-nn-nn-nn-nn/n)");
        bot = entrada.next();


        if(bot.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}")) {
            bol = bot.split("[-/]");
            System.out.println(Arrays.toString(bol));

            for(int i = 0; i <= 6; i++) {
                boleto[i] = Integer.parseInt(bol[i]);

                if(boleto[i] < 1 || boleto[i] > 49) {
                    System.out.println("ERROR: Tu boleto se sale de los límites");
                    return;
                }
            }

            if (boleto[6] < 0 || boleto[6] > 9) {
                System.out.println("ERROR: Tu boleto se sale de los límites");
                return;
            }else{
                boleto[6] = Integer.parseInt(bol[6]);
            }


            System.out.println("SORTEO:");
            System.out.println(Arrays.toString(vector));
            System.out.println("Complementario: " + com);
            System.out.println("Reintegro: " + re);
            System.out.println("RESULTADOS:");

            for(int i = 0; i < 6; i++) {
                if(Arrays.asList(vector).contains(boleto[i])) {
                    aciertos++;
                }
            }

            switch(aciertos) {

                case 6:

                    if (boleto[6] == re) {
                        System.out.println("Categoría especial");
                    }else{
                        System.out.println("Primera categoría");
                    }
                    break;

                case 5:

                    if (Arrays.asList(boleto).contains(com)) {
                        System.out.println("Segunda categoría");
                    }else{
                        System.out.println("Tercera categoría");

                    }

                    if (boleto[6] == re) {
                        System.out.println("Reintegro");
                    }
                    break;


                case 4:

                    System.out.println("Cuarta categoría");

                    if (boleto[6] == re) {
                        System.out.println("Reintegro");
                    }
                    break;

                case 3:

                    System.out.println("Quinta categoría");

                    if (boleto[6] == re) {
                        System.out.println("Reintegro");
                    }
                    break;

                case 2:

                    System.out.println("No premiado");

                    if (boleto[6] == re) {
                        System.out.println("Reintegro");
                    }
                    break;


                case 1:

                    System.out.println("No premiado");

                    if (boleto[6] == re) {
                        System.out.println("Reintegro");
                    }
                    break;

                case 0:

                    System.out.println("No premiado");

                    if (boleto[6] == re) {
                        System.out.println("Reintegro");
                    }
                    break;

            }


        }else{
            System.out.println("ERROR: Tu boleto no encaja con los datos");
        }






    }
}
