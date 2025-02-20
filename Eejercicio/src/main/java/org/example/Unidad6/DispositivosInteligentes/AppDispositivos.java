package org.example.Unidad6.DispositivosInteligentes;
import java.util.ArrayList;

public class AppDispositivos {

    public static void main(String[] args) {

        Televisor televisor = new Televisor("Samsung");
        televisor.encender();
        televisor.encender();
        televisor.apagar();
        televisor.sincronizar();

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(new Televisor("LG SMART"));
        listaDispositivos.add(new ParlanteInteligente("Alexa"));
        listaDispositivos.add(new AireAcondicionado("Haler Inverter"));
        listaDispositivos.add(new Televisor("Samsung comedor"));

        ControlRemoto controlProyector = new ControlRemoto() {

            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto de presentación");
            }
        };

        Dispositivo proyector = new Dispositivo("Optoma") {

            @Override
            public void encender() {
                if (getEstado()) {
                    System.out.println("El proyector ya esta encendido");
                }else{
                    setEstado(true);
                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                }

            }
        };

        Dispositivo horno = new Dispositivo("BALAY hot"){

            @Override
            public void encender() {
                if (getEstado()) {
                    System.out.println("El horno ya está encendido");
                }else{
                    setEstado(true);
                    System.out.println("Calentando horno con ajuste automático de temperatura");
                }
            }
        };

        for (Dispositivo dispositivo : listaDispositivos) {

            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto) {
                ((ControlRemoto) dispositivo).sincronizar();
            } else if (dispositivo.getNombre().equals("Optoma")) {
                controlProyector.sincronizar();
            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();

            System.out.println();
        }

        listaDispositivos.add(horno);
    }
}
