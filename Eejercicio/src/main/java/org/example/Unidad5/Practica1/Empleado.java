package org.example.Unidad5.Practica1;

public class Empleado {

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String id, String nombre, String cargo, Empleado director) {

        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.director = director;
    }

    public String getId() {

        return id;
    }

    public String getNombre() {

        return nombre;
    }

    public String getCargo() {

        if (!cargo.equals("director") && !cargo.equals("técnico") && !cargo.equals("presentador") && !cargo.equals("colaborador")) {
            return cargo = "pte";

        }else{
            return cargo;
        }
    }

    public Empleado getDirector() {
        if(cargo.equals("director")) {

            return director = null;
        }else{
            return director;
        }
    }

    public void setId(String id) {

        this.id = id;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setCargo(String cargo) {

        this.cargo = cargo;
    }

    public void setDirector(Empleado director) {

        this.director = director;
    }

    @Override

    public String toString() {

        return "[Id: " + id + ", nombre: " + nombre + ", cargo: " + cargo + ", director: " + director + "]";
    }
}
