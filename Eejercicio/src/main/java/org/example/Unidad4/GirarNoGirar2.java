package org.example.Unidad4;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class GirarNoGirar2 {

    public static void casosdeprueba() {

        int pruebas_escogidas = prueba();
        int[][] tambor_completo = tambor(pruebas_escogidas);
        bucles(tambor_completo, pruebas_escogidas);
        posicion(tambor_completo, pruebas_escogidas);
    }

    public static int prueba() {
        Scanner entrada = new Scanner(System.in);

        int prueba = 0;
        boolean err = true;

        while(err) {

            do {
                try {
                    System.out.println("¿Cuantos casos de prueba quieres que ocurran?");
                    prueba = entrada.nextInt();
                    err = false;
                }catch(InputMismatchException er) {
                    System.out.println("ERROR: El programa no admite texto");
                    entrada.nextLine();
                }
            }while (prueba == 0);

        }

        return prueba;
    }

    public static int[][] tambor(int prueba) {

        return new int[prueba][6];
    }

    public static void bucles(int[][] tambor, int prueba) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int bala;
        int j = 0;
        boolean sol = true;

        System.out.println("Inserte las balas del tambor...");

        while(sol) {
            bucle1:
            for (int i = 0; i < 6; i++) {

                try {
                    do {
                        bala = entrada.nextInt();
                        tambor[j][i] = bala;
                        if (j == prueba - 1 && i == 5 && (bala == 0 || bala == 1)) {
                            sol = false;
                            break bucle1;
                        }
                        if (i == 5 && (bala == 0 || bala == 1)) {
                            i = -1;
                            j++;
                        }
                    }while(bala != 0 && bala != 1);
                }catch(InputMismatchException so) {
                    System.out.println("ERROR: El programa no admite texto");
                    int recurso = random.nextInt(2);
                    tambor[j][i] = recurso;
                    entrada.nextLine();
                }

            }
        }

        j = 0;

        System.out.println("Casos del tambor:");

        for (int i = 0; i < 6; i++) {

            System.out.print(tambor[j][i] + " ");

            if (j == prueba - 1 && i == 5) {
                break;
            }

            if (i == 5) {
                i = -1;
                j++;
                System.out.println();
            }
        }
    }

    public static void posicion(int[][] tambor, int prueba) {
        Random random = new Random();

        int posicion;

        System.out.println();

        for (int i = 0; i < prueba; i++) {
            posicion = random.nextInt(6);

            if (posicion == 5) {

                if (tambor[i][posicion] == 0 && tambor[i][0] == 0) {
                    System.out.print("Caso " + (i + 1) + ": ");
                    System.out.println("Da igual");
                }

                if (tambor[i][posicion] == 0 && tambor[i][0] == 1) {
                    System.out.print("Caso " + (i + 1) + ": ");
                    System.out.println("No girar");
                }

                if (tambor[i][posicion] == 1) {
                    System.out.print("Caso " + (i + 1) + ": ");
                    System.out.println("Girar");
                }
            }

            if (posicion != 5) {

                if (tambor[i][posicion] == 0 && tambor[i][posicion + 1] == 0) {
                    System.out.print("Caso " + (i + 1) + ": ");
                    System.out.println("Da igual");
                }

                if (tambor[i][posicion] == 0 && tambor[i][posicion + 1] == 1) {
                    System.out.print("Caso " + (i + 1) + ": ");
                    System.out.println("No girar");
                }

                if (tambor[i][posicion] == 1) {
                    System.out.print("Caso " + (i + 1) + ": ");
                    System.out.println("Girar");
                }
            }
        }

    }

    public static void main(String[] args) {

        casosdeprueba();
    }
}
