package FuncionesCH;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ingreso {
    private String linea = null;
    private String usuario = null;
    private String contraseña = null;
    private boolean acceso= false;
    private String tipoAcceso;
   
    
    public Ingreso() throws FileNotFoundException, IOException{
 
        
        
        Scanner sc = new Scanner(System.in);
        
        while (acceso == false){
            System.out.println("Ingrese su usuario: ");
            usuario= sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            contraseña= sc.nextLine();
            
            FileReader archivo = new FileReader("..\\ColegioHogwarts\\datos.txt");
            System.out.println(archivo);

            BufferedReader br = new BufferedReader(archivo);
            
            while ((linea = br.readLine()) != null){
                if (linea.split(",")[0].equalsIgnoreCase(usuario)){
                    if (linea.split(",")[1].equalsIgnoreCase(contraseña)){
                        acceso = true;
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
}
