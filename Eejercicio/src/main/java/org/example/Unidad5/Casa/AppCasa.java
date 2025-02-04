package org.example.Unidad5.Casa;

public class AppCasa {

    public static void main(String[] args) {

        Casa casa = new Casa("Papulandia");
        Habitacion habitacion = new Habitacion("Salon", 40);

        casa.agregarHabitacion("Dormitorio", 40);
        casa.agregarHabitacion("Cocina", 35);
        casa.agregarHabitacion("Baño", 10);

        casa.mostrarHabitaciones();
        System.out.println(casa.getHabitacionMasGrande());

        casa.agregarHabitacion("Baño", 15);
        casa.agregarHabitacion("Garaje", 20);
        casa.mostrarHabitaciones();
        casa.eliminarHabitacion("Cocina");
        casa.mostrarHabitaciones();

        habitacion.agregarElectrodomestico("Microondas", 30);
        habitacion.agregarElectrodomestico("Nevera", 40);
        habitacion.agregarElectrodomestico("Horno", 50);

        habitacion.mostrarElectrodomestico();
    }
}
