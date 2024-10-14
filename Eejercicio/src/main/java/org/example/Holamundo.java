package org.example;

import java.util.Scanner;

public class Holamundo {
    /* Este es un programa simple en Java...
   NombreArchivo: "HolaMundo.java". */
    class HolaMundo {  //Definición de clase HolaMundo: esta línea usa la palabra clave class para declarar que se está definiendo una nueva clase. "HolaMundo" en este caso es un identificador que es el nombre de la clase. La definición de clase completa, incluidos todos sus miembros, estará entre la llave de apertura “{” y la llave de cierre “}”.
        //El nombre de la clase definida por el programa HolaMundo debe ser igual que el nombre del archivo (HolaMundo.java).
        // Tu programa comienza con una llamada a main().
        // Imprime "Hola Mundo" en la ventana de la terminal.
        public static void main(String args[])
        //public: Para que la JVM (Máquina Virtual Java) pueda ejecutar el metodo desde cualquier lugar.
        //static: El metodo principal puede ser llamado sin crear el objeto (lo veremos más adelante)
        //Los modificadores public y static se pueden escribir en cualquier orden.
        //void: El metodo main no devuelve nada, por lo tanto, no hay que definirlo con un tipo de datos concreto.
        //main(): Nombre configurado como programa principal en la JVM.
        //String[]: El metodo principal acepta un único argumento: una matriz de elementos de tipo String (texto).

        {
            System.out.println("Hola Mundo");
            //La clase System pertenece al paquete java.lang (una biblioteca de funciones de Java), y sirve para manejar las entradas, salidas y manejo de errores.
        }
    }

    public static class Unidad2ejr2 {
        public static void main(String[] args) {
        }

        public static void ejecuter() {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Introduce una palabara o frase.");
            String pal1 = entrada.nextLine();
            int lar1 = pal1.length();

            System.out.println("Introduce la segunda palabra o frase.");
            String pal2 = entrada.nextLine();
            int lar2 = pal2.length();

            if (lar1 == lar2) {
                System.out.println("ERROR: Las dos palabras no pueden ser iguales");
            }else{
                if (lar1 > lar2) {
                    System.out.println("La palabra o frase más larga es: " + pal1 + ".");
                }else{
                    System.out.println("La palabra o frase más larga es: " + pal2 + ".");
                }
            }


        }
    }
}
