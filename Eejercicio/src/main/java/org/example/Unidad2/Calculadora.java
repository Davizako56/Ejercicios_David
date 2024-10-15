package org.example.Unidad2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);
        int op1 = 0;
        String signo;
        int op2 = 0;
        boolean tc = true;
        boolean tr = true;

        while (tc == true) {
            try {
                System.out.println("Bienvenido usuario. Por favor, introduzca el primer operando...");
                op1 = entrada.nextInt();
                tc = false;
            }catch(InputMismatchException e) {
                System.out.println("ERROR: El programa no admite texto.");
                entrada.nextLine();
            }
        }


        System.out.println("¿Que tipo de operación se realizara?");
        signo = entrada.next();

        if(signo.equals("R")) {
            double resultado = Math.sqrt(op1);
            System.out.println("El resultado es: " + resultado + ".");

        }else{
            while (tr == true) {
                try {
                    System.out.println("Introduzca el segundo operando...");
                    op2 = entrada.nextInt();
                    tr = false;
                }catch(InputMismatchException e) {
                    System.out.println("ERROR: El programa no admite texto.");
                    entrada.nextLine();
                }
            }

            switch(signo.toLowerCase()) {

                case "+":
                    int i1 = op1 + op2;
                    System.out.println("El resultado es: " + i1 + ".");
                    break;

                case "-":
                    int i2 = op1 - op2;
                    System.out.println("El resultado es: " + i2 + ".");
                    break;

                case "*":
                    int i3 = op1 * op2;
                    System.out.println("El resultado es: " + i3 + ".");
                    break;

                case "/":
                    int i4 = op1 / op2;
                    System.out.println("El resultado es: " + i4 + ".");
                    break;
                default:
                    System.out.println("ERROR: La operacion no existe.");


            }
        }



    }
}
