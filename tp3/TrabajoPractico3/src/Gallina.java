public class Gallina {
    public int idGallina;
    public int edad;
    public int huevosPuestos;

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + ": " + edad + " años, " + huevosPuestos + " huevos.");
    }
}