public class Estudiante {
    public String nombre;
    public String apellido;
    public String curso;
    public int calificación;

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificación);
    }

    public void subirCalificación(int puntos) {
        calificación += puntos;
    }

    public void bajarCalificación(int puntos) {
        calificación -= puntos;
    }
}