package personal;

public class Mecanico {
    String nombre;
    int telefono;
    String especialidad;

    public Mecanico(String nombre, int telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
