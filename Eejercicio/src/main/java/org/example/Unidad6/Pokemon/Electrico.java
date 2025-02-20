package org.example.Unidad6.Pokemon;

public class Electrico extends Pokemon{

    public Electrico(int nivel, int ps) {
        super(nivel, ps);
    }

    @Override

    public void atacar() {
        System.out.println("IMPACTRUENOOOOOOOOOO");
    }
}
