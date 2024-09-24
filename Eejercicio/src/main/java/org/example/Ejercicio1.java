package org.example;
import java.util.Scanner;

public class Ejercicio1 {

    public void ejecuter(){

        System.out.println("Introduce un número... ");
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();;

        if (numero == 0) {
            System.out.println("El numero es 0");
        }else{
            if (numero > 0) {
                System.out.println("El numero es positivo");
            }else{
                System.out.println("El numero es negativo");

                }
            }
        }

    }
