package org.example.Unidad5.Practica1;
import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena(String nombre) {

        this.nombre = nombre;
        listaProgramas = new ArrayList<>();
    }

    public String getNombre() {

        return nombre;
    }

    public ArrayList<Programa> getProgramas() {

        return listaProgramas;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setProgramas(ArrayList<Programa> listaProgramas) {

        this.listaProgramas = listaProgramas;
    }

    @Override

    public String toString() {

        return "[Nombre: " + nombre + ", programas: " + listaProgramas + "]";
    }
}
