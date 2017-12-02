/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo2;

/**
 *
 * @author cajas
 */
public class Estudiante extends Mago {
    //atributos propios de un mago.alumno, los cuales tendran valores o serán null deacuerdo al tipo de mago.
    String animal;
    String hechizo;
    String pocion;
    String deporte;
    //setter y getter

    @Override
    public void despegar() {
        /*if(this.Tipo=="Animago"){
              System.out.println("Usted es un mago Animago, Para volar necesita usar su varita.");   
        }
        if(this.Tipo=="Metamorfomago"){
              System.out.println("Usted es un metamorfomago, Para volar necesita unicamente su poder.");        
        }
        if(this.Tipo=="Normal"){
              System.out.println("Usted es un mago Normal, Para volar necesita una nimbus2000");

        }*/
    }

    @Override
    public void volar() {
        if(this.Tipo=="Animago"){
              System.out.println("Usted es un mago Animago, Para volar necesita usar su varita.");   
        }
        if(this.Tipo=="Metamorfomago"){
              System.out.println("Usted es un metamorfomago, Para volar necesita unicamente su poder.");        
        }
        if(this.Tipo=="Normal"){
              System.out.println("Usted es un mago Normal, Para volar necesita una nimbus2000");

        }
    
    }
}
