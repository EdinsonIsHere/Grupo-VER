package FuncionesCH;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import Ordenar.PorEdad;
import Ordenar.PorMatReg;
import java.io.IOException;


public class Planificador extends Persona {

    
    public void opcionesP() throws IOException{
        Scanner sc = new Scanner(System.in);
        
        showOpcP();
        
        System.out.print(">>Elija una opción: ");
        int opc = sc.nextInt();  
        
        switch (opc) {
            case(1): 
                //crearCurso();
                break;
            case(2):
                Profesor profe = new Profesor();
                profe.crearProfesor();
                break;
                
        }
        
    }
    public static void showOpcP() {
        System.out.println("\n/** Qué desea hacer? **/");
        System.out.println("1. Crear curso");
        System.out.println("2. Crear Profesor");
        System.out.println("3. Crear estudiante");
        System.out.println("4. Ver Horarios Planificados");
        System.out.println("5. Listado de estudiantes");
    }
}