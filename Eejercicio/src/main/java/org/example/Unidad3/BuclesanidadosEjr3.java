package org.example.Unidad3;

public class BuclesanidadosEjr3 {
    public static void ejecuter() {

        int mul = 1;

        System.out.println("Tablas de multiplicar del 1 al 10:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("---------------------------");
            mul = 1;

            while(mul <= 10) {
                int res = i * mul;
                System.out.println(i + " * " + mul + " = " + res);
                mul++;
            }
        }
    }
}
