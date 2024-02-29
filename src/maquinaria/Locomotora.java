package maquinaria;

import personal.Mecanico;

public class Locomotora {
    String matricula;
    double potencia;
    int anioFabricacion;

    Mecanico mecanicoEncargado;

    public Locomotora(String matricula, double potencia, int anioFabricacion, Mecanico mecanicoEncargado) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anioFabricacion = anioFabricacion;
        this.mecanicoEncargado = mecanicoEncargado;
    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", anioFabricacion=" + anioFabricacion +
                ", mecanicoEncargado=" + mecanicoEncargado +
                '}';
    }
}
