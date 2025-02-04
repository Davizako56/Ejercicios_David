package org.example.Unidad5;

public class Televisor {

    private int canal;

    public Televisor(int canal) {

        this.canal = canal;
    }

    public int getCanal(int canal) {

        return this.canal;
    }

    public void setCanal(int canal) {

        this.canal = canal;
    }

    public int subirCanal(int canal) {

        return this.canal + 1;
    }

    public int bajarCanal(int canal) {

        return this.canal - 1;
    }
}
