package FuncionesCH;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ingreso {
    private String linea = null;
    private final String usuario;
    private final String contraseña;
    private boolean acceso= false;
   
    
    public Ingreso() throws FileNotFoundException, IOException{
 
        FileReader archivo = new FileReader("C:\\Users\\PAQUITA\\Documents\\2017-II\\POO\\Proyecto\\Grupo-VER\\datos.txt");
        BufferedReader br = new BufferedReader(archivo);
        
        System.out.println("Edinson está en esto ahora XD");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su usuario: ");
        usuario= sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        contraseña= sc.nextLine();
        
        while ((linea = br.readLine()) != null){
            if (linea.split(",")[0].equalsIgnoreCase(usuario)){
                if (linea.split(",")[1].equalsIgnoreCase(contraseña)){
                    acceso = true;
                }
            }
        }

        if (acceso== true){
            System.out.println("Puede entrar");
        }else{
            System.out.println(":O ");
        }
    }
}
