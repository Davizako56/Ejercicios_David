package org.example.Unidad5;
import java.util.ArrayList;

public class Estudiante {

    public static int contadorEstudiantes = 0;

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> LibrosPrestados;

    public Estudiante(String nombre){

        this.nombre = nombre;
        contadorEstudiantes++;
    }

    public Estudiante(String nombre, String curso, String email, ArrayList<Libro> LibrosPrestados) {

        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        contadorEstudiantes++;
        this.nia = contadorEstudiantes;
        this.LibrosPrestados = LibrosPrestados;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCurso() {
        return this.curso;
    }

    public int getNia(){
        return this.nia;
    }

    public String getEmail() {
        return this.email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public void email(String email) {
        this.email = email;
    }

    public ArrayList<Libro> getLibrosPrestados() {

        return this.LibrosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> LibrosPrestados) {

        this.LibrosPrestados = LibrosPrestados;
    }

    @Override
    public String toString() {

        if (!LibrosPrestados.isEmpty()) {

            return "Alumno: [nombre = " + nombre + ", curso = " + curso + ", NIA = " + nia + ", email = " + email + ", Libros prestados " + LibrosPrestados + "]";

        }else{

            return "Alumno: [nombre = " + this.nombre + ", curso = " + this.curso + ", NIA = " + this.nia + ", email = " + this.email + "]";
        }
    }

    public static int obtenerTotalEstudiantes() {
        return contadorEstudiantes;
    }
}
