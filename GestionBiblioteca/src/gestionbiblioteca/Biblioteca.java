/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbiblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;

    //constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<Libro>();
    }

    //setter
    public void setBiblioteca(String nuevonombre) {
        nombre = nuevonombre;
    }

    //getter
    public String getBiblioteca() {
        String nombre = this.nombre;
        return nombre;
    }

    //metodos
    
    /**
     * Añade un libro(objeto libro) pasado por parámetros 
     * al atributo ArrayList "libros"
     * @param libronuevo Es el objeto de tipo Libro que añadiremos
     */
    public void addLibro(Libro libronuevo) {
        libronuevo.setBiblioteca(this);
        libros.add(libronuevo);
    }
    
    /**
     * Este método elimina el objeto Libro deseado, bastará con darle su nombre,
     *  pero si no lo encuentra, mostrará un mensaje por consola
     * @param nombrelibro El nombre del libro que se desea eliminar
     */
    public void removeLibro(String nombrelibro) {
        boolean encontrado = false;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo() == nombrelibro) {
                encontrado = true;
                libros.remove(i);
            }
        }
        if (encontrado == false) {
            System.out.print("El libro introducido no se encuentra.");
        }
    }

    /**
     * Este método devolverá el objeto Libro cuyo nombre corresponda al que le
     * pasemos por parámetros
     * @param nombrelibro El nombre del libro que se busca.
     * @return Devolverá el objeto Libro cuyo atributo "nombre" 
     * coincide con el String "nombrelibro"
     */
    public Libro returnLibro(String nombrelibro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo() == nombrelibro) {
                return libros.get(i);
            }
        }
        System.out.print("El libro introducido no se encuentra.");
        return null;
    }
    
    public void reportLibros(){
        System.out.print(nombre);
        for(int i = 0;i<libros.size();i++){
            imprimirLibro(libros.get(i));
        }
    }
    
    private void imprimirLibro(Libro libro){
        System.out.print("Título: "+libro.getTitulo()+", ");
        System.out.print("Autor: "+libro.getAutor()+(", "));
        System.out.println("Año: "+libro.getAnyo()+".");
    }
}
