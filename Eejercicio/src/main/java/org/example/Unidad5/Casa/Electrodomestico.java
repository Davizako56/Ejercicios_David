package org.example.Unidad5.Casa;

public class Electrodomestico {

    private String nombre;
    private double consumo;

    public Electrodomestico(String nombre, double consumo) {

        this.nombre = nombre;
        this.consumo = consumo;
    }

    public String getNombre() {

        return nombre;
    }

    public double getConsumo() {

        return consumo;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setConsumo(double consumo) {

        this.consumo = consumo;
    }

    @Override

    public String toString() {

        return "[Nombre: " + nombre + ", consumo: " + consumo + "]";
    }
}
