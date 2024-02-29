package maquinaria;

import personal.Maquinista;

public class Tren {
    Locomotora locomotora;
    Vagon vagones[];

    Maquinista maquinista;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagones = new Vagon[5];
        this.maquinista = maquinista;
    }
}
