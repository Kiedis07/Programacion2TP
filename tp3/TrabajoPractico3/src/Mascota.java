public class Mascota {
    public String nombre;
    public String especie;
    public int edad;

    public void mostrarInfo() {
        System.out.println(nombre + " es un " + especie + " de " + edad + " años.");
    }

    public void cumplirAnios() {
        edad++;
    }
}