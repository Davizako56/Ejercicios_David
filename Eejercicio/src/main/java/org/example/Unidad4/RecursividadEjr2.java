package org.example.Unidad4;

public class RecursividadEjr2 {

    static int cuenta = 1;

    public static void main(String[] args) {

        int num = 1;
        ImpNum(num);
    }

    public static void ImpNum(int num) {
        System.out.println(num);

        if (cuenta != 10){
            cuenta++;
            num += cuenta;
            ImpNum(num);
        }
    }
}
