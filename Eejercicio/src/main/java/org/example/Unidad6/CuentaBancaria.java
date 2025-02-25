package org.example.Unidad6;
import java.util.Scanner;

public class CuentaBancaria {


    private double saldo;
    static String[] opciones = {"[1]. Consultar saldo","[2]. Ingresar dinero","[3]. Retirar dinero","[X]. Salir"};

    public CuentaBancaria(double saldo) {

        this.saldo = saldo;
    }

    public static String menu() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Cajero Automático ===");
        String opcion;

        for (int i = 0; i < 4; i++) {
            System.out.println(opciones[i]);
        }

        System.out.print("Selecciona una opcion:");
        opcion = entrada.next();

        return opcion;
    }

    public double IngresarDinero(double ingreso) throws DepositoMaximoException, LimiteDiarioException {

        if (ingreso <= 0) {
            System.out.println("ERROR: La cantidad ingresada no puede ser menor o igual a 0");
            System.out.println();
            AppBanco.App();
        }else if (ingreso > 3000) {

            throw new DepositoMaximoException("No se puede ingresar más de 3000€");
        }
        saldo = saldo + ingreso;
        return saldo;

    }

    public double retirarDinero(double exporte) throws LimiteDiarioException, DepositoMaximoException {

        if (exporte <= 0) {
            System.out.println("ERROR: La cantidad retirada no puede ser menor o igual que 0");
            System.out.println();
            AppBanco.App();
        }else if (exporte > 600) {

            throw new LimiteDiarioException("No se puede retirar más de 600€ diarios");
        }else if (saldo < exporte) {
            System.out.println("ERROR: No puedes retirar más dinero del que tienes");
            System.out.println();
            AppBanco.App();
        }

        saldo = saldo - exporte;
        return saldo;
    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    @Override

    public String toString() {

        return "[Saldo: " + saldo + "]";
    }
}
