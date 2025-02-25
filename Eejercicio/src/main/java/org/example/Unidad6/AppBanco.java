package org.example.Unidad6;
import java.util.Scanner;

public class AppBanco {

    static CuentaBancaria persona = new CuentaBancaria(400);

    public static void main(String[] args) throws DepositoMaximoException, LimiteDiarioException {
        App();

    }

    public static void App() throws DepositoMaximoException, LimiteDiarioException {
        Scanner entrada = new Scanner(System.in);
        String opcion = CuentaBancaria.menu();

        while (true) {

            switch(opcion.toLowerCase()) {

                case "1":
                    System.out.println("Saldo disponible: " + persona.getSaldo() + "€");
                    System.out.println();
                    App();

                case "2":
                    System.out.println("Introduce el importe a ingresar:");
                    double importe = Double.parseDouble(entrada.next());
                    double total = persona.IngresarDinero(importe);
                    persona.setSaldo(total);
                    System.out.println("Dinero ingresado con éxito. Saldo actual: " + persona.getSaldo() + "€");
                    System.out.println();
                    App();

                case "3":
                    System.out.println("Introduce el dinero a retirar:");
                    double exporte = Double.parseDouble(entrada.next());
                    double diferencia = persona.retirarDinero(exporte);
                    persona.setSaldo(diferencia);
                    System.out.println("Dinero retirado con éxito. Saldo actual: " + persona.getSaldo() + "€");
                    System.out.println();
                    App();

                case "x":
                    System.out.println("Has salido del cajero automático.");
                    System.exit(0);

            }

            System.out.println("ERROR: No has seleccionado ninguna opción");
            System.out.println("Selecciona una opción:");
            opcion = entrada.next();
        }
    }
}

