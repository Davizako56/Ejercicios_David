package org.example.Unidad6.EnumEjr1;

public class AppSemaforo {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {

            if (i == 1 || i == 4 || i == 7 || i == 10) {

                System.out.println(Semaforo.ROJO);
            }

            if (i == 2 || i == 5 || i == 8) {

                System.out.println(Semaforo.VERDE);
            }

            if (i == 3 || i == 6 || i == 9) {

                System.out.println(Semaforo.AMARILLO);
            }
        }
    }
}
