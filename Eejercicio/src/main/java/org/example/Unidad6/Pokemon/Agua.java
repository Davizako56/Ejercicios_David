package org.example.Unidad6.Pokemon;

public class Agua extends Pokemon implements AtaquesAgua {

    public Agua(int nivel, int ps) {

        super(nivel, ps);
    }

    @Override

    public void atacar() {
        System.out.println("PISTOLA AGUAAAAAAAAA, SQUERO SQUERO");
    }

    @Override
    public void hidrobomba() {
        System.out.println("HIDROBOMBAAAAAA");
    }

    @Override
    public void surf() {
        System.out.println("COJO UNA OLAAAA");
    }

    @Override
    public void pistolaagua() {
        System.out.println("FLUSH FLUSH");
    }

    @Override
    public void salpicadura() {
        System.out.println("SALPICADURAAAA");
    }
}
