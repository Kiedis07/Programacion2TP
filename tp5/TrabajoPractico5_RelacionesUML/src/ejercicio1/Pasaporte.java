public class Pasaporte {
    private String numero;
    private String fechaEmision;

    
    private Foto foto; 

    
    private Titular titular;

    // Constructor que inicializa ambas relaciones
    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        
    
        this.foto = new Foto(imagenFoto, formatoFoto); 
        
       
        this.titular = titular;
        
        
        if (titular != null) {
            titular.setPasaporte(this);
        }
    }

    
}