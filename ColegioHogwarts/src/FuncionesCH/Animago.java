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
public class Animago extends Hechizero{
    private String animal;
    private String hechizo;
    
    public Animago(String animal,String hechizo){
        this.animal=animal;
        this.hechizo=hechizo;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getHechizo() {
        return hechizo;
    }

    public void setHechizo(String hechizo) {
        this.hechizo = hechizo;
    }
    
    @Override
    public void despegar(){
        System.out.println("¡El animago ha despegado!\n");
    }
    
    @Override
    public void volar(){
        System.out.println("El animago puede volar con ayuda de su varita.\n");
    }
}
