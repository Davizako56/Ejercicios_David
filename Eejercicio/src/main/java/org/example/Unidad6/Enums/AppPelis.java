package org.example.Unidad6.Enums;
import java.util.Arrays;
import java.util.Scanner;

public class AppPelis {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        SagasPelis peli = SagasPelis.SHREK;
        System.out.println(peli);

        for (SagasPelis pelis : SagasPelis.values()) {
            System.out.println("Peli: " + pelis + " con " + pelis.getNumeroPelis() + " pelis en total");
        }

        System.out.println("Introduce una saga " + Arrays.toString(SagasPelis.values()));
        String saga = entrada.next();
        SagasPelis saga_enum = SagasPelis.valueOf(saga);
        System.out.println("La saga escogida es " + saga_enum + " com " + saga_enum.getNumeroPelis() + " películas");

        int posicion = saga_enum.ordinal();
        System.out.println("La saga consultada está en la posición " + posicion);

        String saga_string = SagasPelis.CREPUSCULO.name();
        System.out.println(saga_string);
    }

}
