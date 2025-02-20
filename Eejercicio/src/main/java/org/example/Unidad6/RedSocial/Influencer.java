package org.example.Unidad6.RedSocial;
import java.util.ArrayList;

public class Influencer extends Usuario {

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nombreUsuario, int seguidores) {

        super(nombre, edad, nombreUsuario, seguidores);
        colaboraciones = new ArrayList<>();
    }

    @Override

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Colaboraciones: " + colaboraciones);
    }
}
