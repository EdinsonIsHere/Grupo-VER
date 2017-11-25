/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesCH;

/**
 *
 * @author CLARO
 */
public class Metamorfomago extends Hechizero{
    
    private String pocion;

    public Metamorfomago(String pocion) {
        this.pocion = pocion;
    }
    
    public String getPocion(){
        return pocion;
    }
    public void setPocion(String pocion){
        this.pocion = pocion;
    }
    
    @Override
    public void despegar(){
        System.out.println("¡El metamorfomago ha despegado!\n");
    }
    
    @Override
    public void volar(){
        System.out.println("El metamorfomago puede volar con ayuda de su poder, sin varita ni escoba.\n");
    }
}