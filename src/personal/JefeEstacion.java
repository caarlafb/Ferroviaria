package personal;

public class JefeEstacion {
    String nombre;
    String DNI;
     int nombramiento;

    public JefeEstacion(String nombre, String DNI, int nombramiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.nombramiento = nombramiento;
    }

    @Override
    public String toString() {
        return "JefeEstacion{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                ", nombramiento=" + nombramiento +
                '}';
    }
}
