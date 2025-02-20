package org.example.Unidad6.DispositivosInteligentes;

public class ParlanteInteligente extends Dispositivo{

    public ParlanteInteligente(String nombre) {

        super(nombre);
    }

    @Override
    public void encender() {
        if(getEstado()) {
            System.out.println("El parlante ya está encendido");
        }else{
            setEstado(true);
            System.out.println("Activando parlante comando de voz...");
        }

    }
}
