
package FuncionesCH;

import java.io.IOException;
import Personas.*;
import java.util.Scanner;

public class DemoCH {
    public static void main(String[] args) throws IOException {
        System.out.println("/** ACADEMICO HOGWARTS **/\n");
        Scanner sc = new Scanner(System.in);
        Academico_Hogwarts AC = new Academico_Hogwarts();
        AC.iniciarSistema();
        String usuario;
        String contraseña;
        Persona P;
        String op;
        while (true){
            System.out.print("Ingrese su Usuario: ");
            usuario = sc.nextLine();
            System.out.print("Ingrese su Contraseña: ");
            contraseña = sc.nextLine();
            P=AC.ingresarSistema(usuario, contraseña, AC.getUsuarios());
            if (P!=null){
                if (P instanceof Planificador){
                    Planificador P1 = (Planificador)P;
                    while (true){
                        Mostrar.showMenuPlanificador();
                        System.out.print("\nIngrese su opción: ");
                        op=sc.nextLine();
                        if (op.equals("1")){
                            P1.crearCurso(AC);
                        }else if(op.equals("2")){
                            P1.crearProfesor(AC.getProfesores());
                        }else if(op.equals("3")){
                            P1.crearEstudiante(AC.getEstudiantes(),AC.getUsuarios());
                        }else if(op.equals("4")){
                            P1.verHorarios(AC.getHorarios());
                        }else if(op.equals("5")){
                            P1.verListadoEstudiantes(AC.getEstudiantes());
                        }else if(op.equals("6")){
                            System.out.println("¡Cierre de sesión (Planificador) exitoso!\n");
                            break;
                        }else{
                            System.out.println("\nOpción inválida, intente de nuevo.\n");
                        }
                    }
                }else if (P instanceof Estudiante){
                    Estudiante E1 = (Estudiante)P;
                    while (true){
                        Mostrar.showMenuEstudiantes();
                        System.out.print("\nIngrese su opción: ");
                        op=sc.nextLine();
                        if (op.equals("1")){
                            E1.verHorarios(AC.getHorarios());
                        }else if(op.equals("2")){
                            E1.registrar(AC.getHorarios());
                        }else if(op.equals("3")){
                            E1.showVuelo();
                        }else if(op.equals("4")){
                            System.out.println("¡Cierre de sesión (Estudiante) exitoso!\n");
                            break;
                        }else{
                            System.out.println("\nOpción inválida, intente de nuevo.\n");
                        }
                    }
                }
            }else{
                System.out.println("\nEl usuario ó la contraseña no son válidos. Por favor intente otra vez.\n");
            }
            
        }
    }
    
}