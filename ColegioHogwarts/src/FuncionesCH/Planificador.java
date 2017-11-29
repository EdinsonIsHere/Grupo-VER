package FuncionesCH;

import java.util.Scanner;

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
        System.out.println("\n/** Qué desea hacer? **/\n"
                + "1. Crear curso\n"
                + "2. Crear Profesor\n"
                + "3. Crear estudiante\n"
                + "4. Ver Horarios Planificados\n"
                + "5. Listado de estudiantes");
    }
}