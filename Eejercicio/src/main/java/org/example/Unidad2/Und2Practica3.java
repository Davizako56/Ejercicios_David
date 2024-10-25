package org.example.Unidad2;
import java.util.Scanner;

public class Und2Practica3 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        String isbn;
        int l = 1;
        int x = 0;
        int y = 1;
        int z = 10;
        int resp = 0;

        System.out.println("Introduzca el ISBN");
        isbn = entrada.next();

        while (l <= 10) {
            l++;
            String n = isbn.substring(x,y);
            int n_ = Integer.parseInt(n);
            int res = n_ * z;
            resp += res;
            x++;
            y++;
            z--;
        }

        if(resp % 11 == 0) {
            System.out.println("El ISBN es válido");
        }else{
            System.out.println("El ISBN no es válido");
        }



    }
}
