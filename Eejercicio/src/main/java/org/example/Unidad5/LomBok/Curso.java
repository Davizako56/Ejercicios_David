package org.example.Unidad5.LomBok;
import lombok.*;
import java.util.Objects;

@AllArgsConstructor
@Getter @Setter
@ToString
public class Curso {

    @NonNull
    private String nombre;
    private int horas;

    public Curso(String nombre) {

        this.nombre = Objects.requireNonNullElse(nombre, "Curso sin nombre");
    }
}
