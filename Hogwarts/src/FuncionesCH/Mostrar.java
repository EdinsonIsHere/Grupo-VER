
package FuncionesCH;

import Personas.Hechicero;
import Personas.Animago;
import Personas.Estudiante;
import Personas.Metamorfomago;
import Personas.Normal;
import Personas.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *Esta clase permite mostrar los distintos menú de opciones
 */
public class Mostrar {
    
    /**
     * Este método muestra las opciones de planificador
     */
    public static void showMenuPlanificador() {
        System.out.println("\n/** PLANIFICADOR **/\n");
        System.out.println("1. Crear Curso");
        System.out.println("2. Crear Profesor");
        System.out.println("3. Crear Estudiante");
        System.out.println("4. Ver Horarios Planificados");
        System.out.println("5. Listado de Estudiantes");
        System.out.println("6. Cerrar sesión");
    }
    
    /**
     * Este método muestra las opciones del estudiante
     */
    public static void showMenuEstudiantes() {
        System.out.println("\n/** ESTUDIANTE **/\n");
        System.out.println("1. Ver Cursos Planificados");
        System.out.println("2. Registrar en Curso");
        System.out.println("3. Descripción de Vuelo");
        System.out.println("4. Cerrar sesión");
    }
    
    /**
     * Este método muestra las opciones de las materias
     */
    public static void showMaterias() {
        System.out.println("\n/** MATERIAS **/\n");
        System.out.println("1. Pociones");
        System.out.println("2. Defensa contra las artes oscuras");
        System.out.println("3. Adivinación");
        System.out.println("4. Astronomia");
        System.out.println("5. Historia de la Magia");
        System.out.println("6. Herbología");
        System.out.println("7. Encantamiento");
        System.out.println("8. Vuelo");
    }

    /**
     * Este método muestra las opciones de tipos de magos
     */
    public static void showTiposMagos() {
        System.out.println("\nTipos de Magos/Brujas");
        System.out.println("1.Animago");
        System.out.println("2.Metamorfomago");
        System.out.println("3.Estandar");
    }
    
    /**
     * Este método permite elegir el tipo de mago
     * @return retorna un objeto hechicero
     */
    public static Hechicero elegirTipoMago() {
        Scanner sc = new Scanner(System.in);
        showTiposMagos();
        System.out.print("Elija el tipo de mago/bruja que es:");
        while (true) {
            int tipo = sc.nextInt();
            sc.nextLine();
            String animal, hechizo, pocion, deporte;
            Hechicero H;
            switch (tipo) {
                case (1):
                    System.out.println("\n¿En qúe clase de animal puede convertirse?: ");
                    animal = sc.nextLine();
                    System.out.println("\n¿Qúe hechizo está usando?: ");
                    hechizo = sc.nextLine();
                    H = new Animago(animal, hechizo);
                    return H;
                case (2):
                    System.out.println("\n¿Qué poción usa?: ");
                    pocion = sc.nextLine();
                    H = new Metamorfomago(pocion);
                    return H;
                case (3):
                    System.out.println("\n¿Cuál es su deporte favorito?: ");
                    deporte = sc.nextLine();
                    H = new Normal(deporte);
                    return H;
                default:
                    System.out.println("\n¡La opción no existe, ingrese de nuevo!");
            }
        }
    }
    
    /**
     * Este método muestra la lista de estudiantes
     * @param ests lista de estudiantes
     */
    public static void showListado(ArrayList<Estudiante> ests) {
        for (Estudiante e : ests) {
            System.out.println(e.toString());
        }
    }
    
    /**
     * Este método designa la casa
     * @return retorna un objeto casa
     */
    public static Casa elegirCasa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Casa: ");
        Casa c;
        while (true) {
            String casa = sc.nextLine();
            if (casa.equalsIgnoreCase("gryffindor")) {
                c = Casa.GRYFFINDOR;
                return c;
            } else if (casa.equalsIgnoreCase("ravenclaw")) {
                c = Casa.RAVENCLAW;
                return c;
            } else if (casa.equalsIgnoreCase("hufflepuff")) {
                c = Casa.HUFFLEPUFF;
                return c;
            } else if (casa.equalsIgnoreCase("slytherin")) {
                c = Casa.SLYTHERIN;
                return c;
            } else {
                System.out.println("Solo puede elegir entre éstas 4 casas: Gryffindor, Ravenclaw, Hufflepuff y Slytherin");
                System.out.print("Ingrese de nuevo: ");
            }
        }
    }
    
    /**
     * Este método define el dia
     * @return retorna un objeto dia
     */
    public static Dia elegirDia() {
        Scanner sc = new Scanner(System.in);
        Dia d;
        System.out.print("\nIngrese el día: ");
        while (true) {
            String dia = sc.nextLine();
            if (dia.equalsIgnoreCase("lunes")) {
                d = Dia.LUNES;
                return d;
            } else if (dia.equalsIgnoreCase("martes")) {
                d = Dia.MARTES;
                return d;
            } else if (dia.equalsIgnoreCase("miercoles") || dia.equalsIgnoreCase("miércoles")) {
                d = Dia.MIÉRCOLES;
                return d;
            } else if (dia.equalsIgnoreCase("jueves")) {
                d = Dia.JUEVES;
                return d;
            } else if (dia.equalsIgnoreCase("viernes")) {
                d = Dia.VIERNES;
                return d;
            } else if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("sábado")) {
                d = Dia.SÁBADO;
                return d;
            } else if (dia.equalsIgnoreCase("domingo")) {
                d = Dia.DOMINGO;
                return d;
            } else {
                System.out.print("Solo puede elegir entre los días de la semana, ingrese de nuevo: ");
            }
        }
    }
    
    /**
     * Este método muestra la existencia de profesores
     * @param AH  objeto de académico hogwarts
     */
    public static void showProfesores(Academico_Hogwarts AH) {
        ArrayList<Profesor> profes = AH.getProfesores();
        if (profes != null) {
            System.out.println("/** PROFESORES **/");
            int i = 1;
            for (Profesor profe : profes) {
                System.out.println(i + ". " + profe.getNombre() + " " + profe.getApellido());
                i++;
            }
        } else {
            System.out.println("No hay profesores todavía.");
        }
    }
    
    /**
     * Este método determina la existencia de un curso
     * @param num numero de la opcion de las materias
     * @param AH objeto académico hogwarts
     * @return retorna el valor de la existencia de curso
     */
    public static boolean existeCurso(int num, Academico_Hogwarts AH) {
        Materia M = null;
        switch (num) {
            case (1):
                M = Materia.POCIONES;
                break;
            case (2):
                M = Materia.DEFENSA_CONTRA_LAS_ARTES_OSCURAS;
                break;
            case (3):
                M = Materia.ADIVINACION;
                break;
            case (4):
                M = Materia.ASTRONOMIA;
                break;
            case (5):
                M = Materia.HISTORIA_DE_LA_MAGIA;
                break;
            case (6):
                M = Materia.HERBOLOGIA;
                break;
            case (7):
                M = Materia.ENCANTAMIENTO;
                break;
            case (8):
                M = Materia.VUELO;
                break;
        }
        for (Curso C : AH.getHorarios()) {
            if (C.getMateria() == M) {
                return true;
            }
        }
        return false;
    }
}
