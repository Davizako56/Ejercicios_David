package org.example.Unidad6.DispositivosInteligentes;

public abstract class Dispositivo {

    private String nombre;
    private boolean estado;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
    }

    public abstract void encender();

    public void apagar() {

        if (!estado) {
            System.out.println(nombre + " ya está apagado");
        } else {

            estado = false;
            System.out.println(nombre + " apagado");
        }
    }

    public void mostrarEstado() {

        if(estado) {
            System.out.println("Está encendido");
        }else{
            System.out.println("Está apagado");
        }
    }

    public String getNombre() {

        return nombre;
    }

    public boolean getEstado() {

        return estado;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setEstado(boolean estado) {

        this.estado = estado;
    }
}
