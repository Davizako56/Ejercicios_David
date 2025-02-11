package org.example.Unidad6;

public class Asistente extends Persona {

    private String entrada;

    public Asistente(String nombre, int edad, String entrada) {

        super(nombre, edad);
        this.entrada = entrada;
    }

    @Override

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de entrada: " + entrada);
    }
}
