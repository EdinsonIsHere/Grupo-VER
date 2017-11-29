/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesCH;

import java.util.Scanner;
<<<<<<< HEAD
import java.util.ArrayList;

/**
 *
 * @author CLARO
 */
public class Planificador extends Persona {

    public static void crearCurso() {
        Scanner sc = new Scanner(System.in);
        Curso C = new Curso();
        while (true) {
            showMaterias();
            System.out.println("Elija una materia del listado de materias: ");
            int num = sc.nextInt();
            sc.nextLine();
            switch (num) {
                case (1):
                    C.setMateria(Materia.POCIONES);
                    break;
                case (2):
                    C.setMateria(Materia.DEFENSA_CONTRA_LAS_ARTES_OSCURAS);
                    break;
                case (3):
                    C.setMateria(Materia.ADIVINACION);
                    break;
                case (4):
                    C.setMateria(Materia.ASTRONOMIA);
                    break;
                case (5):
                    C.setMateria(Materia.HISTORIA_DE_LA_MAGIA);
                    break;
                case (6):
                    C.setMateria(Materia.HERBOLOGIA);
                    break;
                case (7):
                    C.setMateria(Materia.ENCANTAMIENTO);
                    break;
                case (8):
                    C.setMateria(Materia.VUELO);
                    break;
                default:
                    System.out.println("Opción inválida, ingrese de nuevo: ");
                    break;
            }
            System.out.println("\n");
            showProfesores();
            System.out.println("Elija un profesor del listado: ");
            while (true) {
                int eleccion = sc.nextInt();
                if (eleccion <= (Academico_Hogwarts.profesores).size() && eleccion >= 0) {
                    C.setProfesor((Academico_Hogwarts.profesores).get(eleccion));
                    break;
                }else{
                    System.out.println("La opción es inválida, ingrese de nuevo: ");
                }
            }
            System.out.println("\nIngrese la capacidad del curso para "+(C.getMateria()).toString());
            int cap = sc.nextInt();
            C.setCapacidad(cap);
            
            System.out.println("\nIngrese el día: ");
            String dia = sc.nextLine();
            C.setDia(dia);
            
            System.out.println("Ingrese el horario del curso: ");
            String hora = sc.nextLine();
            C.setHorario(hora);
            
=======

public class Planificador extends Persona {
    
    public void opcionesP(){
        Scanner sc = new Scanner(System.in);
        
        showOpcP();
        
        System.out.print(">>Elija una opción: ");
        int opc = sc.nextInt();  
        
        switch (opc) {
            case(1): 
                crearCurso();
                break;
            case(2):
                Profesor profe = new Profesor();
                profe.crearProfesor();
                break;
                
>>>>>>> parent of 102d73c... Merge branch 'master' of https://github.com/EdinsonIsHere/Grupo-VER
        }
    }

    

    public static void showMaterias() {
        System.out.println("/** MATERIAS **/\n");
        System.out.println("1. Pociones");
        System.out.println("2. Defensa contra las artes oscuras");
        System.out.println("3. Adivinación");
        System.out.println("4. Astronomia");
        System.out.println("5. Historia de la Magia");
        System.out.println("6. Herbología");
        System.out.println("7. Encantamiento");
        System.out.println("8. Vuelo");
    }
<<<<<<< HEAD

    public static void showProfesores() {
        ArrayList<Profesor> profes = Academico_Hogwarts.profesores;
        if (profes != null) {
            System.out.println("/** PROFESORES **/");
=======
   
    public static void crearCurso() {
        Scanner sc = new Scanner(System.in);
        Curso C = new Curso();
        while (true) {
            showMaterias();
            System.out.println(">>Elija una materia del listado de materias: ");
            int num = sc.nextInt();
            sc.nextLine();
            switch (num) {
                case (1):
                    C.setMateria(Materia.POCIONES);
                    break;
                case (2):
                    C.setMateria(Materia.DEFENSA_CONTRA_LAS_ARTES_OSCURAS);
                    break;
                case (3):
                    C.setMateria(Materia.ADIVINACION);
                    break;
                case (4):
                    C.setMateria(Materia.ASTRONOMIA);
                    break;
                case (5):
                    C.setMateria(Materia.HISTORIA_DE_LA_MAGIA);
                    break;
                case (6):
                    C.setMateria(Materia.HERBOLOGIA);
                    break;
                case (7):
                    C.setMateria(Materia.ENCANTAMIENTO);
                    break;
                case (8):
                    C.setMateria(Materia.VUELO);
                    break;
                default:
                    System.out.println("Opción inválida, ingrese de nuevo: ");
                    break;
            }
            
            //showProfesores();
            System.out.println("Elija un profesor del listado: ");
            /*
            while (true) {
                int eleccion = sc.nextInt();
                if (eleccion <= (Academico_Hogwarts.profesores).size() && eleccion >= 0) {
                    C.setProfesor((Academico_Hogwarts.profesores).get(eleccion));
                    break;
                }else{
                    System.out.println("La opción es inválida, ingrese de nuevo: ");
                }
            }
            System.out.println("\nIngrese la capacidad del curso para "+(C.getMateria()).toString());
            int cap = sc.nextInt();
            C.setCapacidad(cap);
            
            System.out.println("\nIngrese el día: ");
            String dia = sc.nextLine();
            C.setDia(dia);
            
            System.out.println("Ingrese el horario del curso: ");
            String hora = sc.nextLine();
            C.setHorario(hora);
            */
        }
    }

    

    public static void showMaterias() {
        System.out.println("\n/** MATERIAS **/");
        System.out.println("1. Pociones");
        System.out.println("2. Defensa contra las artes oscuras");
        System.out.println("3. Adivinación");
        System.out.println("4. Astronomia");
        System.out.println("5. Historia de la Magia");
        System.out.println("6. Herbología");
        System.out.println("7. Encantamiento");
        System.out.println("8. Vuelo");
    }
/*
    public static void showProfesores() {
        ArrayList<Profesor> profes = Academico_Hogwarts.profesores;
        if (profes != null) {
            System.out.println("/** PROFESORES **//*");
>>>>>>> parent of 102d73c... Merge branch 'master' of https://github.com/EdinsonIsHere/Grupo-VER
            int i = 1;
            for (Profesor profe : profes) {
                System.out.println(i + ". " + profe.getNombre() + " " + profe.getApellido());
                i++;
            }
        } else {
            System.out.println("No hay profesores todavía.");
        }
    }
<<<<<<< HEAD
=======
*/

>>>>>>> parent of 102d73c... Merge branch 'master' of https://github.com/EdinsonIsHere/Grupo-VER
    

}
