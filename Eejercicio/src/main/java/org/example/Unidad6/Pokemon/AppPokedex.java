package org.example.Unidad6.Pokemon;

public class AppPokedex {

    public static void main(String[] args) {

        Electrico pikachu = new Electrico(100, 100);
        pikachu.atacar();

        Agua squirtle = new Agua(200, 100);
        squirtle.atacar();
        squirtle.imprimirDatos();
        squirtle.salpicadura();

        Pokemon pikachu2 = new Electrico(30, 21);
        pikachu2.atacar();
        Pokemon squirtle2 = new Agua(200, 100);
        squirtle2.atacar();

        Pokemon[] pokemons = {new Electrico(30, 21), new Agua(200, 100)};

        for (Pokemon pokemon : pokemons) {

            pokemon.atacar();
            pokemon.imprimirDatos();

            if (pokemon instanceof Agua) {
                ((AtaquesAgua) pokemon).pistolaagua();
            }
        }

        Pokemon jiglipuff = new Pokemon(25, 30) {
            @Override
            public void atacar() {
                System.out.println("NADA DE NADA");
            }
        };

        jiglipuff.atacar();
        jiglipuff.imprimirDatos();

        AtaquesAgua ataquesAgua = new AtaquesAgua() {
            @Override
            public void hidrobomba() {
                System.out.println("BOOOOM");
            }

            @Override
            public void surf() {
                System.out.println("COJIENDO OLA");
            }

            @Override
            public void pistolaagua() {
                System.out.println("FLISH FLUSH");
            }

            @Override
            public void salpicadura() {
                System.out.println("SALPICADURAAAA");
            }
        };

        ataquesAgua.hidrobomba();
        ataquesAgua.pistolaagua();

        Electrico pikachu3 = new Electrico(35, 12) {
            @Override
            public void atacar() {
                System.out.println("RAYOOO");
            }
        };

        pikachu3.atacar();

    }
}
