package org.example.Unidad6;

public class Artista extends Persona {

    private String generoMusical;

    public Artista(String nombre, int edad, String generoMusical) {

        super(nombre, edad);
        this.generoMusical = generoMusical;
    }

    @Override

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Género musical: " + generoMusical);
    }


}
