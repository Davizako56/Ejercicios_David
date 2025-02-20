package org.example.Unidad6.DispositivosInteligentes;

public class Televisor extends Dispositivo implements ControlRemoto{

    public Televisor(String nombre) {

        super(nombre);
    }

    @Override
    public void encender() {

        if(getEstado()) {
            System.out.println("El televisor ya está encendido");
        }else{
            setEstado(true);
            System.out.println("El televisor ha sido encendido");
        }
    }

    @Override

    public void sincronizar() {
        System.out.println("Sincronizando televisor con el control remoto");
    }
}
