package gestionbiblioteca;

public class GestionBiblioteca {

    public static void main(String[] args) {
        
        
        
        Biblioteca hola = addBiblioteca("hola");
        hola.addLibro(new Libro("Pau","Hola",1,29));
        hola.reportLibros();
        
        Biblioteca adios = addBiblioteca("adios");
        adios.addLibro(new Libro("Christopher","Caca",1,2));
        adios.reportLibros();
        
        moverLibro("Hola",hola,adios);
        
        hola.reportLibros();
        adios.reportLibros();
    }

    private static void moverLibro(Libro libro, Biblioteca biblio) {
        (libro.getBiblio())
    }

    private static Biblioteca addBiblioteca(String nombre) {
        return new Biblioteca(nombre);
    }

    private static Libro generadorDeLibros() {
        String[] plural = {"The ", "Ten ", "Thousand "};
        String[] singular = {"The ", "A ", "Another "};
        String[] mid = {"mistery", "red moon", "pancake killer", "blind sniper",
            "misteries", "mutant kangaroos", "vampires in the night",
            "bald werewolves"};
        String[] end = {": Origins", " Part II", " - THE REVENGE!!",
            " from hell", " - The official Artbook", ": Chronicles", " Z"};
        String[] nombre = {"Djavan", "Javier", "Pau",
            "Maria", "Bernat", "Christopher"};
        String[] apellido = {"Kartoffen", "Baño", "Vital",
            "Alrevés", "Falleras", "Fontalaire"};

        String titulo;

        int midnum = (int) (Math.random() * mid.length);
        int first = (int) (Math.random() * 3);
        int endnum = (int) (Math.random() * end.length);

        int nom = (int) (Math.random() * nombre.length);
        int apel = (int) (Math.random() * apellido.length);
        String autor = nombre[nom] + " " + apellido[apel];

        int paginas = (int) (Math.random() * 999 + 1);
        int anyo = 1950 + (int) (Math.random() * ((2018 - 1950) + 1));

        if (midnum < 4) {
            titulo = singular[first] + mid[midnum] + end[endnum];
        } else {
            titulo = plural[first] + mid[midnum] + end[endnum];
        }
        return new Libro(autor, titulo, anyo, paginas);

    }
}
