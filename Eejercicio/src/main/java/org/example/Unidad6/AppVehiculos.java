package org.example.Unidad6;

public class AppVehiculos {

    public static void main(String[] args) {

        Avion airbus = new Avion("Airbus", "1234DKF", 2);
        Tren ave = new Tren("AVE", "9876LKM", 8);

        airbus.imprimirVehiculo();
        ave.imprimirVehiculo();
        airbus.ruido();
        ave.ruido();

    }



}
