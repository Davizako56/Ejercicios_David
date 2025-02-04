package org.example.Unidad5.Casa;
import java.util.ArrayList;

public class Habitacion {

   private String nombre;
   private double metrosCuadrados;
   private ArrayList<Electrodomestico> electrodomesticos;

   public Habitacion(String nombre, double metrosCuadrados) {

       this.nombre = nombre;
       this.metrosCuadrados = metrosCuadrados;
       this.electrodomesticos = new ArrayList<>();
   }

   public void agregarElectrodomestico(String nombre, double consumo) {

       for(Electrodomestico ele : electrodomesticos) {

           boolean existe = false;
           if (ele.getNombre().equals(nombre)) {

               System.out.println("El electrodomestico ya existe");
               existe = true;
               break;
           }

           Electrodomestico electrodomestico = new Electrodomestico(nombre,consumo);
           electrodomesticos.add(electrodomestico);
       }
   }

   public void mostrarElectrodomestico() {

       System.out.println("La habitacion " + nombre + " tiene " + electrodomesticos.size() + " electrodomesticos");
   }

   public String getNombre() {

       return nombre;
   }

   public void setNombre(String nombre) {

       this.nombre = nombre;
   }

   public double getMetrosCuadrados() {

       return metrosCuadrados;
   }

   public void setMetrosCuadrados(double metrosCuadrados) {

       this.metrosCuadrados = metrosCuadrados;
   }

   @Override

   public String toString() {

       return nombre;
   }
}
