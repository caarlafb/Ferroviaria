package maquinaria;

public class Vagon{
    int identificador;
    double cargaMax;
    double cargaActual;
    String tipoMercancia;

    public Vagon() {
    }

    public Vagon(int identificador, double cargaMax, double cargaActual, String tipoMercancia) {
        this.identificador = identificador;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }
}
