/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbiblioteca;

public class Pagina {
    //Atributos
    private int num;
    private Libro libro;
    
    //Constructor
    /**
     * Constructor de página
     * @param enternum número de la página
     */
    public Pagina(int enternum){
        num=enternum;
    }
    
    //setter
    public void setNum(int enternum){ //Setter
        num=enternum;
    }
    
    public void setLibro(Libro libro){
        this.libro=libro;
    }
    
    //getter
    /**
     * Devuelve el número de la página.
     * @return Devuelve el número de la página.
     */
    public int getNum(){
        int numero=num;
        return numero;
    }
    
}
