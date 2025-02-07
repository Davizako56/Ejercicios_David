package org.example.Unidad5.LomBok;
import lombok.*;
import java.util.Objects;

@AllArgsConstructor
@Getter @Setter
@ToString
public class Estudiante {

    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;

    public Estudiante(String nombre) {

        this.nombre = Objects.requireNonNullElse(nombre, "Estudiante sin nombre");
    }

}
