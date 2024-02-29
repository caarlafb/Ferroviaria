import maquinaria.Locomotora;
import maquinaria.Tren;
import personal.JefeEstacion;
import personal.Maquinista;
import personal.Mecanico;

public class Main {
    public static void main(String[] args) {
        Maquinista maquinista1 = new Maquinista("Josefina", "12345678M", 1700, "jefa");
        Mecanico mecanico1 = new Mecanico("María", 932457684, "frenos");
        JefeEstacion jefe1 = new JefeEstacion("Miguel", "23456789T", 12/05/2019);
        Locomotora locomotora1 = new Locomotora("5678TTT",200,1,mecanico1);
        Tren tren1 = new Tren(locomotora1, maquinista1);
        System.out.println(tren1);

    }
}