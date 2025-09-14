public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return añoPublicacion; }

    // Setters
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    
    public void setAñoPublicacion(int año) {
        if (año > 0 && año <= 2025) {
            this.añoPublicacion = año;
        } else {
            System.out.println("Año inválido: " + año);
        }
    }
}