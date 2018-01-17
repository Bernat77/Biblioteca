/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbiblioteca;

public class Pagina {
    //Atributos
    private int num;
    
    //Constructor
    public Pagina(int enternum){
        num=enternum;
    }
    
    //setter
    public void setNum(int enternum){ //Setter
        num=enternum;
    }
    
    //getter
    public int getNum(){
        int numero=num;
        return numero;
    }
    
}
