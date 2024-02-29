package maquinaria;

import personal.Maquinista;

import java.util.Arrays;

public class Tren {
    Locomotora locomotora;
    Vagon vagones[];

    Maquinista maquinista;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagones = new Vagon[5];
        this.maquinista = maquinista;
    }

    @Override
    public String toString() {
        return "Tren{" +
                "locomotora=" + locomotora +
                ", vagones=" + Arrays.toString(vagones) +
                ", maquinista=" + maquinista +
                '}';
    }
}
