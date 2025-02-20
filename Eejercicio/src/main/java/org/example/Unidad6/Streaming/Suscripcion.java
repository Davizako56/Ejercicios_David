package org.example.Unidad6.Streaming;

public abstract class Suscripcion {

    private String nombrePlan;
    private double precio;

    public Suscripcion(String nombrePlan, double precio) {

        this.nombrePlan = nombrePlan;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombrePlan);
        System.out.println("Precio: " + precio);
    }
}
