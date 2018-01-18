/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbiblioteca;
import java.util.ArrayList;

public class Libro {

    //Atributos
    private String autor;
    private String titulo;
    private int anyo;
    private ArrayList<Pagina> arrayPaginas;
    private Biblioteca biblioteca;

    //Constructor
    /**
     * Constructor de libro.
     * @param autor Autor del libro
     * @param titulo Título del libro
     * @param anyo Año de publicación
     * @param paginas Páginas del libro
     */
    public Libro(String autor, String titulo, int anyo,int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.anyo = anyo;
        this.arrayPaginas= new ArrayList<Pagina>();
        rellenarLibro(paginas);
        
    }
    //setters
    /**
     * Cambia el nombre del autor.
     * @param autor El nombre del autor.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /**
     * Cambia el nombre del título
     * @param titulo El nombre del título.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * Cambia el año de publicación
     * @param anyo  El año de publicación.
     */
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
    public void setBiblioteca(Biblioteca biblio){
        biblioteca=biblio;
    }

    //getters
    public String getAutor() {
        String autor = this.autor;
        return autor;
    }

    public String getTitulo() {
        String titulo = this.titulo;
        return titulo;
    }

    public int getAnyo() {
        int anyo = this.anyo;
        return anyo;
    }
    
    public Biblioteca getBiblio(){
        Biblioteca biblio=this.biblioteca;
        return biblio;
    }
    
    //funciones
    /**
     * Rellena el atributo arraylist "arrayPaginas" de tantos objetos Página como páginas tiene el libro.
     * @param n El número de páginas del libro.
     */
    private void rellenarLibro(int n){
        for(int i=0;i<n;i++){
            arrayPaginas.add(new Pagina(i+1));
            (arrayPaginas.get(i)).setLibro(this);
             }    
    }
    
    /**
     * Añade el número de objetos Página deseados al atributo arraylist "arrayPaginas"
     * @param n Es el número de páginas que se desean añadir
     */
    public void addPaginas(int n){
        for(int i=0;i<n;i++){
            arrayPaginas.add(new Pagina(arrayPaginas.size()+1));
    }
        
    }

}
