package org.example.Unidad6;

public class Vehiculo {

    private String marca;
    private String matricula;

    public Vehiculo(String marca, String matricula) {

        this.marca = marca;
        this.matricula = matricula;
    }

    public void imprimirVehiculo() {
        System.out.println("Vehículo de la marca " + marca + " con la matrícula " + matricula);
    }

    public void ruido() {
        System.out.println("pi pi");
    }
}
