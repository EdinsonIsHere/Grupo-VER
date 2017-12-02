/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo2;

import java.util.Scanner;

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
    String Casa;
    //setter y getter
    public void CrearEstudiante(){//crea el profesor con inputs
        System.out.println("/**CREAR ESTUDIANTE**/");
        //llena el objeto
        Scanner sc= new Scanner(System.in);
        
        System.out.println("ingrese el nombre:");
        String cadena=sc.nextLine();
        this.Nombre=cadena;
     
        System.out.println("ingrese el apellido:");
        String cadena2=sc.nextLine();
        this.Apellido=cadena2; 
        
        System.out.println("ingrese la edad:");
        int cadena3=sc.nextInt();
        this.Edad=cadena3; 
        
        System.out.println("Varita: ");
        String cadena4=sc.nextLine();
        this.Varita=cadena4;
        
        System.out.println("Casa: ");
        String cadena7=sc.nextLine();
        this.Casa=cadena7;
        
        System.out.println("Tipos de mago/bruja");
        System.out.println("1.Animago");
        System.out.println("2.Metamorfomago");
        System.out.println("3.Estandar");
        System.out.println("Elija el tipo de mago/bruja que es:a");
        String tipom=sc.nextLine();
        
        //agregar el switch para los 3 tipos de mago
        if("1"==tipom){
            this.Tipo="Animago";
            System.out.println("ingrese el animal de transformacion:");
            String cad5=sc.nextLine();
            this.animal=cad5;
            System.out.println("ingrese el hechizo de transformacion:");
            String cad6=sc.nextLine();
            this.animal=cad6;
            
        }
        if("2"==tipom){
            this.Tipo="Metamorfomago";
            System.out.println("ingrese pocion:");
            String cad5=sc.nextLine();
            this.pocion=cad5;    
        }
        if ("3"==tipom){
            this.Tipo="Normal";
            System.out.println("ingrese deporte:");
            String cad5=sc.nextLine();
            this.deporte=cad5;
            
        }
                
    }
    
    
    
    
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
