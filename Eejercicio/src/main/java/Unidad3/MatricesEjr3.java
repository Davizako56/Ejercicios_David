package Unidad3;
import java.util.Scanner;

public class MatricesEjr3 {
    public static void ejecuter() {
        Scanner entrada = new Scanner(System.in);

        int x;
        int y;
        int k = 0;
        int h = 0;
        int c = 0;
        int nom = 0;
        float res = 0;
        int n = 0;
        int t = 0;


        System.out.println("Hola! Cuántos estudiantes tienes?");
        x = entrada.nextInt();
        String vector[] = new String[x];

        System.out.println("Cuántas asignaturas tienen?");
        y = entrada.nextInt();
        String array[] = new String[y];

        int matriz[][] = new int[x][y];

        for (int i = 1; i <= x; i++) {
            System.out.println("Introduce el nombre del estudiante " + i + ":");
            String es = entrada.next();
            vector[i - 1] = es;
        }

        for (int i = 1; i <= y; i++) {
            System.out.println("Introduce la asignatura " + i + ":");
            String as = entrada.next();
            array[i - 1] = as;
        }

        bucle1:
        for (int i = 0; i < y; i++) {
            System.out.println("Inserta la nota de " + vector[k] + " para la asignatura de " + array[i] + ":");
            int not = entrada.nextInt();
            matriz[h][i] = not;

            if (i == y - 1) {
                h++;
                k++;
                i = -1;
            }

            if (h == x) {
                System.out.print("Estudiantes ");
                for (int j = 0; j < y; j++) {
                    System.out.print(array[j] + " ");

                    if (j == y - 1) {

                        System.out.println(" ");

                        for (int z = 0; z < y; z++) {

                            if (z == 0) {

                                System.out.print(vector[nom] + ": ");
                            }

                            System.out.print(matriz[c][z] + " ");

                            if (z == y - 1) {
                                System.out.println(" ");
                                c++;
                                z = -1;
                                nom++;

                            }

                            if (c == x) {

                                for (int m = 0; m < y; m++) {
                                    res += matriz[n][m];

                                    if (m == y - 1) {
                                        float ser = res / y;
                                        System.out.println("La nota media del alumno " + vector[n] + " es " + ser);
                                        n++;
                                        m = -1;
                                        res = 0;

                                    }

                                    if (n == x) {

                                        res = 0;

                                        for (int u = 0; u < x; u++) {
                                            res += matriz[u][t];

                                            if (u == x - 1) {
                                                float med = res / x;
                                                System.out.println("La nota media de la asignatura " + array[t] + " es " + med);
                                                t++;
                                                u = -1;
                                                res = 0;
                                            }

                                            if (t == y) {
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
    }
}
