package FuncionesCH;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ingreso {
    private String linea;
    private String usuario;
    private String contraseña;
    private boolean acceso;
    private String rol;
   
    public Ingreso() {
        
        usuario = null;
        contraseña = null;
        acceso = false;
        rol=null;
    }
    
    //clase para validar el accceso
    public void getAcceso() throws IOException{
        Scanner sc = new Scanner(System.in);

        //Se pide el usuario y contraseña para acceder.
        while (acceso ==false){
            System.out.print("Ingrese su usuario: ");
            usuario= sc.nextLine();
            System.out.print("Ingrese su contraseña: ");
            contraseña= sc.nextLine();
            
            FileReader archivo = new FileReader("..\\ColegioHogwarts\\usuarios.txt");
            BufferedReader br = new BufferedReader(archivo);
            while ((linea = br.readLine()) != null){
                if (linea.split(",")[0].equalsIgnoreCase(usuario)){
                    if (linea.split(",")[1].equalsIgnoreCase(contraseña)){
                        acceso = true;
                        System.out.println("Ingreso exitoso");
                        rol = linea.split(",")[4];
                        break;
                    }
                }
            }
          
            
            if (acceso == true) break;
            
            System.out.println("El usuario o contraseña no son válidos.");
            System.out.println("Por favor intente otra vez.\n");
        }

    }
    
    public String getRol(){
        return rol;
    }
}
