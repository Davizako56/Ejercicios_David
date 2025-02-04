package org.example.Unidad5;

public class Persona {

    private String nombre;
    private String apellido;
    private String DNI;
    private float peso;
    private int edad;
    private String genero;
    private String ciudad;
    private String profesion;

    public Persona(String nombre, String apellido, String DNI, float peso, int edad, String genero, String ciudad, String profesion) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.peso = peso;
        this.edad = edad;
        this.genero = genero;
        this.ciudad = ciudad;
        this.profesion = profesion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getDNI() {
        return this.DNI;
    }

    public float getPeso() {
        return this.peso;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public String getProfesion() {
        return this.profesion;
    }

    public void setNombre(String nombre) {
        if (!nombre.equalsIgnoreCase("Messi")) {
            this.nombre = nombre;
        }
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public Persona() {

    }

    public String concatenar() {

        return this.nombre + " " + this.apellido;
    }

    public void imprimirPersona() {

        System.out.println(this.nombre + " " + this.apellido + " " + this.DNI + " " + this.peso + " " + this.edad + " " + this.ciudad + " " + this.profesion);
    }

    @Override
    public String toString() {

        return "Paciente: con nombre " + this.nombre + " y " + this.edad + " años de edad " + " genero " + this.genero + " y DNI: " + this.DNI;
    }
}
