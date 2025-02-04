package org.example.Unidad5;
import java.util.Random;

public class Libro {

    private String titulo;
    private String autor;
    private int id;
    private boolean disponible;
    static int cantidadLibros = 0;
    static int librosDisponibles = 0;
    private Estudiante estudiante;
    private Editorial editorial;



    public void constructor() {
        Random random = new Random();

        String[] constructorTitulo = {"Cien años de soledad", "Don Quijote de la Mancha", "Odisea", "El Principito", "El Señor de los Anillos", "Harry Potter"};
        String[] constructorAutor = {"Charles Dickens", "Ernest Hemingway", "Miguel de Cervantes", "León Tolstói", "Gabriel García Márquez", "Victor Hugo"};
        int selec = random.nextInt(0, 6);

        this.titulo = constructorTitulo[selec];

        selec = random.nextInt(0, 6);

        this.autor = constructorAutor[selec];

        this.id = calcularId();

        cantidadLibros++;
        librosDisponibles++;
    }

    public int calcularId() {
        Random random = new Random();

        int num = random.nextInt(100000000, 1000000000);

        return num;

    }

    public void prestar(boolean disponible) {

        disponible = false;

        System.out.println("El libro ha sido prestado con éxito");
        librosDisponibles--;
    }

    public void devolver(boolean disponible) {

        if (disponible) {
            System.out.println("El libro " + this.titulo + " no se puede devolver");
        }else{
            disponible = true;

            System.out.println("El libro ha sido devuelto con éxito");
            librosDisponibles++;
        }
    }


}
