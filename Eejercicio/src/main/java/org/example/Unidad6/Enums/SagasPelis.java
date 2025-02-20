package org.example.Unidad6.Enums;

public enum SagasPelis {

    HARRYPOTER(8),CREPUSCULO(4),SPIDERMAN(7),A_TODO_GAS(12),SHREK(6);

    private int numeroPelis;

    SagasPelis(int numeroPelis) {

        this.numeroPelis = numeroPelis;
    }

    public int getNumeroPelis() {

        return numeroPelis;
    }
}
