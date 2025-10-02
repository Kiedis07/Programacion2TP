package ejercicio1_pasaporte_foto_titular;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public Pasaporte getPasaporte() { return pasaporte; }
    public void setPasaporte(Pasaporte pasaporte) { this.pasaporte = pasaporte; }

    private static class Pasaporte {

        public Pasaporte() {
        }
    }
}