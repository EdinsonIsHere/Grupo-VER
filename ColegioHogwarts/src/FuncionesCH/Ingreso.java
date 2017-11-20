package FuncionesCH;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Ingreso {
    private String usuario;
    private String contraseña;
    private boolean acceso= false;
   
    
    public Ingreso(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su usuario: ");
        usuario= sc.next();
        System.out.println("Ingrese su contraseña: ");
        contraseña= sc.next();
        
        BufferedReader archivo = new BufferedReader( new FileReader(""
                + "https://docs.google.com/document/d/1FftqXE5YHozby59kMHCTVANnmpd65txYZE2BfJMWu6A/edit?usp=sharing"));
        
        //Validar el usuario
        String linea = "";
        while((linea = archivo.readLine())!= null){
            if(linea.indexOf(",")!=-1){
                if (linea.split(",")[0].equalsIgnoreCase(usuario) && linea.split(",")[1].equalsIgnoreCase(contraseña)){
                    acceso= true
                    break;
                }
            }
        }
        if (acceso== true){
            System.out.println("Puede entrar");
        else{
            System.out.println(":O ");
            }
        }
    }
    
    
    
    
    
}
