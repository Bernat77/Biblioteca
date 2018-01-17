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

    //Constructor
    public Libro(String autor, String titulo, int anyo,int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.anyo = anyo;
        this.arrayPaginas= new ArrayList<Pagina>();
        rellenarLibro(arrayPaginas);
        
    }

    //setters
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
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
    
    //funciones
    public void rellenarLibro(ArrayList<Pagina> libro){
        for(int i=0;i<libro.size();i++){
            libro.add(new Pagina(i+1));
             }    
    }
    
    public void addPaginas(int n,ArrayList<Pagina> libro){
        for(int i=0;i<n;i++){
            libro.add(new Pagina(libro.size()+1));
    }
        
    }

}
