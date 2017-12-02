/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cajas
 */
public class Profesor extends Mago{
    //atributos propios de un mago.profesor, los cuales tendran valores o serán null deacuerdo al tipo de mago.
    String animal;
    String hechizo;
    String pocion;
    String deporte;
    String fecha;
    //setter y getter
    public void setAnimal(String animal){
        this.animal=animal;
    }
    public void sethechizo(String hechizo){
        this.hechizo=hechizo;
    }
    public void setpocion(String pocion){
        this.pocion=pocion;
        
    }
    public void setdeporte(String deporte){
        this.deporte=deporte;
    }
    public String getDeporte(){
        return this.deporte;
        
     }
    public void setNombre(String nombre){
        this.Nombre=nombre;
    }
    
    public void CrearProfesor(){//crea el profesor con inputs
        System.out.println("/**CREAR PROFESOR**/");
        //llena el objeto
        Scanner sc= new Scanner(System.in);
        
        System.out.println("ingrese el nombre");
        String cadena=sc.nextLine();
        this.Nombre=cadena;
     
        System.out.println("ingrese el apellido");
        String cadena2=sc.nextLine();
        this.Apellido=cadena2; 
        
        System.out.println("ingrese la edad:");
        String cadena3=sc.nextLine();
        this.Varita=cadena3; 
        
        System.out.println("ingrese la fecha de ingreso (dd/mm/aa=");
        String cadena4=sc.nextLine();
        this.fecha=cadena4; 
        
        System.out.println("Tipos de mago/bruja");
        System.out.println("1.Animago");
        System.out.println("2.Metamorfomago");
        System.out.println("3.Estandar");
        System.out.println("Elija el tipo de mago/bruj que es:a");
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
    
    public void GuardarProfesor(ArrayList<Profesor> ListaProfesores,Profesor profesor){
        //metodo para guardar, en caso de guardar se envia el profesor a una lista donde luego
        Scanner g=new Scanner(System.in);
        System.out.println("Desea guardar los datos? S/N: ");
        String guardar=g.nextLine();
        if (guardar=="S"){
            ListaProfesores.add(profesor);
            System.out.println("Datos del profesor guardados");
        }else
            System.out.println("Datos eliminados.....");               
           
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
