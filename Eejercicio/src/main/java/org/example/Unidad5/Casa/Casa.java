package org.example.Unidad5.Casa;
import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
    Scanner entrada = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> habitaciones;
    private Propietario propietario;

    public Casa(String direccion) {

        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        setPropietario();

    }

    public void agregarHabitacion(String nombre, double metros) {
        boolean existe = false;
        for(Habitacion hab : habitaciones) {
            if(hab.getNombre().equals(nombre)) {
                System.out.println("La habitacion ya existe");
                existe = true;
                break;
            }
        }
        Habitacion habitacion = new Habitacion(nombre,metros);
        habitaciones.add(habitacion);
    }

    public void mostrarHabitaciones() {

        System.out.println("Casa en " + direccion + " tiene: " + habitaciones.size() + " habitaciones");

        for(Habitacion hab : habitaciones) {

            System.out.println("- " + hab.getNombre() + " (" + hab.getMetrosCuadrados() + " m2)");
        }
    }

    public void eliminarHabitacion(String nombre) {

        for(Habitacion hab : habitaciones) {

            if(hab.getNombre().equals(nombre)) {
                habitaciones.remove(hab);
                return;
            }
        }
    }

    public Habitacion getHabitacionMasGrande() {

        Habitacion mayor = habitaciones.get(0);

        for(Habitacion hab : habitaciones) {

            if(hab.getMetrosCuadrados() > mayor.getMetrosCuadrados()) {

                mayor = hab;
            }

        }

        return mayor;
    }

    public String getDireccion() {

        return direccion;
    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;
    }

    public ArrayList<Habitacion> getHabitaciones() {

        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {

        this.habitaciones = habitaciones;
    }

    public Propietario getPropietario() {

        return propietario;
    }

    public void setPropietario() {
        System.out.println("Inserte propietario");
        String nombre = entrada.next();
        System.out.println("Inserte la edad del propietario");
        int edad = entrada.nextInt();

        this.propietario = new Propietario(nombre,edad);
    }

    @Override

    public String toString() {

        return "[Direccion = " + direccion + ", habitaciones = " + habitaciones + "]";
    }
}
