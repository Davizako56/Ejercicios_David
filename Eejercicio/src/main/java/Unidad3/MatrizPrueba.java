package Unidad3;

public class MatrizPrueba {
    public static void ejecuter() {

        int matriz[][] = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++ ) {

                if (i == j) {
                    matriz[i][j] = 1;
                }
            }
        }

        for (int[] filas:matriz) {
            for (int columnas : filas) {
                System.out.print(columnas + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz.length; j < matriz[i].length; j--) {
                if (i == j) {
                    System.out.print("x ");

                }else{
                    System.out.print("- ");
                }
            }
        }
    }
}
