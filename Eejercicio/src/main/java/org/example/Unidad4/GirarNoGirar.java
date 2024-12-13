package org.example.Unidad4;
import java.util.Random;

public class GirarNoGirar {

    public static void main(String[] args) {

        int tambor_resultante[] = tambor();
        posicion(tambor_resultante);

    }

        public static int[] tambor() {
            Random random = new Random();

            int tambor[] = new int[6];
            int real = 0;

            do {
                for (int i = 0; i < 6; i++) {
                    int bala = random.nextInt(2);
                    tambor[i] = bala;
                    real += tambor[i];
                }
            }while(real == 0 || real == 6);

            real = 0;

            for (int i = 0; i < 6; i++) {
                if (tambor[i] == 1) {
                    real++;
                }
            }

            if (real == 1) {
                System.out.println("Hay " + real + " bala en el tambor");

            }else{
                System.out.println("Hay " + real + " balas en el tambor");
            }

            return tambor;
        }

        public static void posicion(int[] tambor) {
            Random random = new Random();

            int posicion = random.nextInt(6);
            System.out.print("Se recomienda: ");

            if (posicion == 5) {

                if (tambor[posicion] == 1) {
                    System.out.print("Girar");
                    System.exit(0);
                }

                if (tambor[posicion] == 0 && tambor[0] == 1) {
                    System.out.print("No girar");
                    System.exit(0);
                }

                if (tambor[posicion] == 0 && tambor[0] == 0) {
                    System.out.print("Da igual");
                    System.exit(0);
                }
            }

            if (tambor[posicion] == 1) {
                System.out.print("Girar");
            }

            if (tambor[posicion] == 0 && tambor[posicion + 1] == 1) {
                System.out.print("No girar");
            }

            if (tambor[posicion] == 0 && tambor[posicion + 1] == 0) {
                System.out.print("Da igual");
            }
        }

    }

