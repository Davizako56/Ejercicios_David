package org.example.Unidad5.Practica1;
import java.time.LocalDate;

public class Invitado {

    private String nombre;
    private String profesion;
    private LocalDate fecha_vista;
    private int temporada;

    public Invitado(String nombre, String profesion, LocalDate fecha_vista, int temporada) {

        this.nombre = nombre;
        this.profesion = profesion;
        this.fecha_vista = fecha_vista;
        this.temporada = temporada;
    }

    public String getNombre() {

        return nombre;
    }

    public String getProfesion() {

        return profesion;
    }

    public LocalDate getFecha() {

        return fecha_vista;
    }

    public int getTemporada() {

        return temporada;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setProfesion(String profesion) {

        this.profesion = profesion;
    }

    public void setFecha(LocalDate fecha_vista) {

        this.fecha_vista = fecha_vista;
    }

    public void setTemporada(int temporada) {

        this.temporada = temporada;
    }

    @Override

    public String toString() {

        return "[Nombre: " + nombre + ", profesion: " + profesion + ", fecha: " + fecha_vista + ", temporada: " + temporada + "]";
    }
}
