package org.example.Unidad5.LomBok;
import java.util.ArrayList;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Getter
@ToString
public class Instituto {

    @NonNull
    private String nombre;
    @Setter
    private String poblacion;
    @Setter
    private String direccion;
    @Setter
    private ArrayList<Curso> cursos;
    @Setter
    private ArrayList<Estudiante> estudiantes;

    public Instituto(String nombre) {

        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
    }

//      public Instituto(String nombre) {
//
//          this.nombre = Objects.requireNonNull(nombre);
//          if(nombre == null) {
//              System.out.println("El nombre no puede ser nulo");
//          }else{
//            this.nombre = nombre;
//          }
//  }

    public void agregarEstudiante(Estudiante estudiante) {

            estudiantes.add(estudiante);

    }

    public void eliminarEstudiante() {

        for (Estudiante es : estudiantes) {

            if (es.getNombre() == null) {

                estudiantes.remove(es);
            }
        }
    }

    public void agregarCurso(Curso curso) {

        cursos.add(curso);
    }

    public void eliminarCurso(String nombre, int horas) {

        for (Curso cu : cursos) {

            if (cu.getNombre() == null) {

                cursos.remove(cu);
            }

            if (cu.getNombre().equals(nombre)) {

                cursos.remove(cu);

            }

            if (cu.getHoras() == horas) {

                cursos.remove(cu);
            }
        }
    }
}
