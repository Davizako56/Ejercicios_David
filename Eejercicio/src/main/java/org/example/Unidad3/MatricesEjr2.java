package org.example.Unidad3;
import java.util.Random;

public class MatricesEjr2 {
    public static void ejecuter() {
        Random random = new Random();
        int m = random.nextInt(1,6);
        int n = random.nextInt(1,6);
        int matriz[][] = new int[m][n];
        int i = 0;
        int y = 0;
        int res = 0;
        int k = 1;

        bucle1:
        for (int j = 0; j <= m - 1; j++) {
            int num = random.nextInt(0,10);
            matriz[j][i] = num;

            if (j == m - 1) {
                i++;
                j = -1;
            }

            if (i == n) {

                System.out.println("Matriz:");

                for (int x = 0; x <= m - 1; x++) {
                    System.out.print(matriz[x][y] + " ");

                    if (x == m - 1) {
                        System.out.println(" ");
                        y++;
                        x = -1;
                    }

                    if (y == n) {
                        System.out.println(" ");
                        System.out.println("Suma de filas:");
                        i = 0;

                        for (int l = 0; l <= m - 1; l++) {
                            res += matriz[l][i];

                            if (l == m - 1) {
                                System.out.println("Fila " + k + ": " + res);
                                i++;
                                k++;
                                l = -1;
                                res = 0;
                            }

                            if (i == n) {
                                res = 0;
                                i = 0;
                                k = 1;
                                System.out.println(" ");
                                System.out.println("Suma de columnas:");

                                for (int h = 0; h <= n - 1; h++) {
                                    res += matriz[i][h];

                                    if (h == n - 1) {
                                        System.out.println("Columna " + k + ": " + res);
                                        i++;
                                        k++;
                                        h = -1;
                                        res = 0;
                                    }

                                    if (i == m) {
                                        break bucle1;
                                    }
                                }
                            }

                        }
                    }

                }
            }

        }
    }
}
