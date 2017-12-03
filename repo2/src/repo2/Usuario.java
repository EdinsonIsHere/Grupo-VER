/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author cajas
 */
public class Usuario {
    public class Ingreso {
    private String linea = null;
    private String usuario = null;
    private String contraseña = null;
    private boolean acceso= false;
    private String tipoAcceso;
    private String nombre;
    private String apellido;
   
    
    public Ingreso() throws FileNotFoundException, IOException{
 
        
 
        Scanner sc = new Scanner(System.in);
        
        while (acceso == false){
            System.out.println("Ingrese su usuario: ");
            usuario= sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            contraseña= sc.nextLine();
            
            FileReader archivo = new FileReader("C:\\Users\\cajas\\Documents\\GitHub\\Grupo-VER\\repo2\\src\\repo2");
            System.out.println(archivo);

            BufferedReader br = new BufferedReader(archivo);
            
            while ((linea = br.readLine()) != null){
                if (linea.split(",")[0].equalsIgnoreCase(usuario)){
                    if (linea.split(",")[1].equalsIgnoreCase(contraseña)){
                        acceso = true;
                        nombre=linea.split(",")[2];
                        apellido=linea.split(",")[3];
                        System.out.println("Ingreso exitoso");
                        tipoAcceso = linea.split(",")[4];
                        break;
                    }
                }
            }
            if (acceso == true) break;
            
            System.out.println("El usuario o contraseña no son válidos.");
            System.out.println("Por favor intente otra vez.\n");
        }

    }
    
    public String getTipoAcceso(){
        return tipoAcceso;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
//en la main, hacer un if con el tipoacceso para empezar como planificador o estudiante( usar getters para registro())
    
}
