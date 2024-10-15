package org.example.Unidad2;
import java.util.Scanner;

public class Und2Practica1 {

    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        int dd = 0;
        int mm = 0;
        int aaaa = 0;

        while (dd > 31 | dd <= 0) {
            System.out.println("Introduce tu dia de nacimiento:");
            dd = entrada.nextInt();

            if (dd > 31 | dd <= 0) {
                System.out.println("ERROR: Tu dia de nacimiento no existe.");
            }else{
                while (mm <= 0 | mm > 12) {
                    System.out.println("Introduce tu mes de nacimiento:");
                    mm = entrada.nextInt();

                    if (mm <= 0 | mm > 12) {
                        System.out.println("ERROR: Tu mes de nacimiento no existe.");
                    }else{
                        System.out.println("Introduce tu año de nacimiento:");
                        aaaa = entrada.nextInt();

                        System.out.println("Tu fecha de nacimiento es " + dd + "/" + mm + "/" + aaaa + ".");
                        int resultado = dd + mm+ aaaa;

                        String solucion = Integer.toString(resultado);
                        String s1 = solucion.substring(0,1);
                        String s2 = solucion.substring(1,2);
                        String s3 = solucion.substring(2,3);
                        String s4 = solucion.substring(3,4);

                        int r1 = Integer.parseInt(s1);
                        int r2 = Integer.parseInt(s2);
                        int r3 = Integer.parseInt(s3);
                        int r4 = Integer.parseInt(s4);

                        int numero = r1 + r2 + r3 + r4;

                        System.out.println("Tu número de la suerte es " + numero + ".");
                        System.out.println("Ha sido calculado de la siguiente manera:");
                        System.out.println(dd + " + " + mm + " + " + aaaa + " = " + resultado + ".");
                        System.out.println(s1 + " + " + s2 + " + " + s3 + " + " + s4 + " = " + numero + ".");


                    }
                }
            }
        }




    }
}
