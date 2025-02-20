package org.example.Unidad6;

public class Organizador extends Persona {

    private String rol;

    public Organizador(String nombre, int edad, String rol) {

        super(nombre, edad);
        this.rol = rol;
    }

    @Override

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol: " + rol);
    }
}
