package personal;

public class Maquinista {
    String nombre;
    String DNI;
    double saldo;
    String rango;

    public Maquinista(String nombre, String DNI, double saldo, String rango) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.saldo = saldo;
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Maquinista{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", saldo=" + saldo +
                ", rango='" + rango + '\'' +
                '}';
    }
}
