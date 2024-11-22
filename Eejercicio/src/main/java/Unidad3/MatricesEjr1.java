package Unidad3;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MatricesEjr1 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        int num;
        int i = 0;
        int x = 0;
        int bus = 0;
        boolean err = true;
        boolean sol = true;

        while(err) {
            try {
                bucle1:
                for (int j = 0; j <= 2; j++) {
                    num = entrada.nextInt();
                    matriz[i][j] = num;

                    if (j == 2) {
                        i++;
                        j = -1;
                    }

                    if (i == 3) {
                        System.out.println("Matriz:");

                        for (int y = 0; y <= 2; y++) {
                            System.out.print(matriz[x][y] + " ");

                            if (y == 2) {
                                System.out.println(" ");
                                x++;
                                y = -1;
                            }

                            if (x == 3) {
                                break bucle1;
                            }
                        }

                    }
                }
                err = false;
            }catch(InputMismatchException er) {
                System.out.println("ERROR: El programa no admite texto");
                entrada.nextLine();
            }
        }

        while(sol) {
            try {
                System.out.println("Número a buscar:");
                bus = entrada.nextInt();
                sol = false;
            }catch(InputMismatchException so) {
                System.out.println("ERROR: El programa no admite texto");
                entrada.nextLine();
            }
        }

        i = 0;

        for(int j = 0; j <= 2; j++) {
            if (matriz[j][i] == bus) {
                System.out.println("El número " + bus + " se encuentra en la posición (" + j + "," + i + ").");
                break;
            }else{
                if (j == 2) {
                    i++;
                    j = -1;
                }

                if (i == 3) {
                    System.out.println("El número " + bus + " no se encuentra en la matriz.");
                    break;
                }
            }
        }
    }
}
