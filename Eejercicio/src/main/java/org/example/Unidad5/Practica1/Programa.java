package org.example.Unidad5.Practica1;
import java.util.ArrayList;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, int temporadas, Empleado director) {

        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = temporadas;
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();
        this.director = director;
    }

    public String getNombre() {

        return nombre;
    }

    public Cadena getCadena() {

        return cadena;
    }

    public int getTemporadas() {

        return temporadas;
    }

    public ArrayList<Empleado> getEmpleados() {

        return listaEmpleados;
    }

    public ArrayList<Invitado> getInvitados() {

        return listaInvitados;
    }

    public Empleado getDirector() {

        return director;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setCadena(Cadena cadena) {

        this.cadena = cadena;
    }

    public void setTemporadas(int temporadas) {

        this.temporadas = temporadas;
    }

    public void setEmpleados(ArrayList<Empleado> listaEmpleados) {

        this.listaEmpleados = listaEmpleados;
    }

    public void setInvitados(ArrayList<Invitado> listaInvitados) {

        this.listaInvitados = listaInvitados;
    }

    public void setDirector(Empleado director) {

        this.director = director;
    }

    @Override

    public String toString() {

        return "[Nombre: " + nombre + ", cadena: " + cadena + ", temporadas: " + temporadas + ", empleados: " + listaEmpleados + ", invitados: " + listaInvitados + ", director: " + director + "]";
    }
}
