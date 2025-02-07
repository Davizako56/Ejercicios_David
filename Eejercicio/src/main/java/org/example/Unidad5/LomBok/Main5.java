package org.example.Unidad5.LomBok;

import java.util.ArrayList;

public class Main5 {

    public static void main(String[] args) {
        //Persona persona1 = new Persona("Pepe", "Sanchez", "123456789A", 80, 30, "Masculino", "Alicante", "Bombero");
        //Persona persona2 = new Persona();

        //System.out.println(persona1.nombre + " " + persona1.apellido + " " + persona1.DNI + " " + persona1.peso + " " + persona1.edad);
        //System.out.println(persona2.nombre + " " + persona2.apellido + " " + persona2.DNI + " " + persona2.peso + " " + persona2.edad);
        //persona1.imprimirPersona();
        //persona2.imprimirPersona();
        //System.out.println(persona1.concatenar());

        //System.out.println("Antes: " + persona1.getNombre());
        //persona1.setNombre("Pepa");
        //System.out.println("Después: " + persona1.getNombre());
        //System.out.println("Antes: " + persona1.getNombre());
        //persona1.setNombre("Messi");
        //System.out.println("Después: " + persona1.getNombre());

        //Estudiante estudiante1 = new Estudiante("Carlos", "4ESO", "Carlospendejo@gmail.com");
        //Estudiante estudiante2 = new Estudiante("Jose", "4ESO", "Josependejo@gmail.com");

        //System.out.println(estudiante1.getNombre() + " " + estudiante1.getCurso() + " " + estudiante1.getEmail());
        //System.out.println(estudiante2.getNombre() + " " + estudiante2.getCurso() + " " + estudiante2.getEmail());

        //Persona persona1 = new Persona("Luis", "Sanchez", "12345613X", 20, 30, "hombre", "Alicante", "Programador");
        //Equipo equipo1 = new Equipo("Real Mutxamel");

        //Instituto ies_alluser = new Instituto("IES ALLUSER");
        //System.out.println(ies_alluser);
        //Instituto iesMutxamel = null;
        //Curso curso1 = new Curso("1DAM", 8);
        //Estudiante estudiante1 = new Estudiante("Pol", 19, curso1);

        //try {
        //    iesMutxamel = new Instituto(null, "Mutxamel", "Papulandia", new ArrayList<>(), new ArrayList<>());
        // }catch(NullPointerException e) {
        //     System.out.println("El nombre no puede ser nulo");
        // }

        // System.out.println(iesMutxamel);
        //}

        //Instituto iesBerlanga = new Instituto("Berlanga", "San Joan d'Alacant", "Papulandia", new ArrayList<>(), new ArrayList<>());

        Instituto instituto = new Instituto("IES MUTXAMEL");

        //Crear cursos
        Curso cursoJava = new Curso("Java", 100);
        Curso cursoPython = new Curso("Python", 70);
        instituto.agregarCurso(cursoJava);
        instituto.agregarCurso(cursoPython);

        //Crear estudiantes

        try{
            Estudiante estudiante1 = new Estudiante("Carlos", 20, cursoJava);
            Estudiante estudiante2 = new Estudiante("Ana", 22, cursoPython);
            instituto.agregarEstudiante(estudiante1);
            instituto.agregarEstudiante(estudiante2);

            Estudiante estudianteErroneo = new Estudiante(null);

        }catch(NullPointerException e) {
            System.out.println("ERROR: No se puede crear un estudiante con nombre null");
        }

        instituto.agregarEstudiante(null);
        instituto.agregarCurso(null);

        System.out.println("Cursos disponibles:");
        System.out.println(instituto.getCursos());

        System.out.println("Estudiantes registrados:");
        System.out.println(instituto.getEstudiantes());

    }
}
