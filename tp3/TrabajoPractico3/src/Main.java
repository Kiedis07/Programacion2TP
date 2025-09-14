public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 1 - ESTUDIANTE ===");
        Estudiante e1 = new Estudiante();
        e1.nombre = "Ana";
        e1.apellido = "Gómez";
        e1.curso = "Programación II";
        e1.calificación = 7;
        e1.mostrarInfo();
        
        System.out.println("\n=== EJERCICIO 2 - MASCOTA ===");
        Mascota m1 = new Mascota();
        m1.nombre = "Max";
        m1.especie = "Perro";
        m1.edad = 3;
        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.mostrarInfo();
        
        System.out.println("\n=== EJERCICIO 3 - LIBRO ===");
        Libro libro = new Libro();
        libro.setTitulo("Cien años de soledad");
        libro.setAutor("Gabriel García Márquez");
        libro.setAñoPublicacion(1967);
        libro.setAñoPublicacion(-100); // Inválido
        System.out.println(libro.getTitulo() + " - " + libro.getAutor());
        
        System.out.println("\n=== EJERCICIO 4 - GALLINA ===");
        Gallina g1 = new Gallina();
        g1.idGallina = 1;
        g1.edad = 2;
        g1.huevosPuestos = 5;
        g1.ponerHuevo();
        g1.envejecer();
        g1.mostrarEstado();
        
        System.out.println("\n=== EJERCICIO 5 - NAVE ESPACIAL ===");
        NaveEspacial nave = new NaveEspacial("Apollo", 50);
        nave.mostrarEstado();
        nave.avanzar(60);
        nave.recargarCombustible(30);
        nave.avanzar(60);
        nave.mostrarEstado();
    }
}