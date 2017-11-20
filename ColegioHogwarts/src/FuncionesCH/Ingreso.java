package FuncionesCH;

import java.io.BufferedReader;
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
 
        FileReader archivo = new FileReader("C:\\Users\\PAQUITA\\Documents\\2017-II\\POO\\Proyecto\\Grupo-VER\\datos.txt");
        BufferedReader br = new BufferedReader(archivo);
        
        Scanner sc = new Scanner(System.in);
        
        while (acceso == false){
            System.out.println("Ingrese su usuario: ");
            usuario= sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            contraseña= sc.nextLine();
            
            

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
            System.out.println(acceso);
            if (acceso == true) break;
            
            System.out.println("El usuario o contraseña no son válidos.");
            System.out.println("Por favor intente otra vez.\n");
        }

    }
    
    public String getTipoAcceso(){
        return tipoAcceso;
    }
}
