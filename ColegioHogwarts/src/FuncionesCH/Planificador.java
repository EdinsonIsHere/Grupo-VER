/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesCH;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author CLARO
 */
public class Planificador extends Persona {

    public Planificador(String nombre, String apellido, int edad, String varita, Hechizero tipoMago) {
        super(nombre, apellido, edad, varita, tipoMago);
    }

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
                } else {
                    System.out.println("La opción es inválida, ingrese de nuevo: ");
                }
            }
            System.out.println("\nIngrese la capacidad del curso para " + (C.getMateria()).toString());
            int cap = sc.nextInt();
            C.setCapacidad(cap);

            System.out.println("\nIngrese el día: ");
            String dia = sc.nextLine();
            C.setDia(dia);

            System.out.println("Ingrese el horario del curso: ");
            String hora = sc.nextLine();
            C.setHorario(hora);

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

    public static void showProfesores() {
        ArrayList<Profesor> profes = Academico_Hogwarts.profesores;
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

    public static void crearProfesor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("/** CREAR PROFESOR **/");

        System.out.println("Ingrese Nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese Apellidos: ");
        String apellidos = sc.nextLine();

        System.out.println("Ingrese Edad: ");
        int edad = sc.nextInt();

        System.out.println("Varita: ");
        String varita = sc.nextLine();

        System.out.println("Fecha de Ingreso: ");
        String fechaIn = sc.nextLine();

        Hechizero H = elegirTipoMago();

        System.out.println("\n¿Desea guardar los datos? S/N");
        String conf = sc.nextLine();
        if (conf.equalsIgnoreCase("s")) {
            Profesor profe = new Profesor(fechaIn, nombre, apellidos, edad, varita, H);
            (Academico_Hogwarts.profesores).add(profe);
            System.out.println("Sus datos se han guardado correctamente");
        } else if (conf.equalsIgnoreCase("n")) {
            System.out.println("¡Se volverá a pedir datos!");
        } else {
            System.out.println("Sólo puede ingresar S en caso que desee guardar ó N en caso de volver a ingresar los datos.");
        }

    }

    public static void crearEstudiante() {
        Scanner sc = new Scanner(System.in);
        System.out.println("/** CREAR ESTUDIANTE **/");

        System.out.println("Ingrese Nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese Apellidos: ");
        String apellidos = sc.nextLine();

        System.out.println("Ingrese Edad: ");
        int edad = sc.nextInt();

        System.out.println("Varita: ");
        String varita = sc.nextLine();

        System.out.println("Casa: ");
        String casa = sc.nextLine();
        
        Casa c = elegirCasa(casa);

        Hechizero H = elegirTipoMago();

        System.out.println("\n¿Desea guardar los datos? S/N");

        String conf = sc.nextLine();
        if (conf.equalsIgnoreCase("s")) {
            Estudiante est = new Estudiante(c, nombre, apellidos, edad, varita, H);
            (Academico_Hogwarts.estudiantes).add(est);
            System.out.println("Sus datos se han guardado correctamente");
        } else if (conf.equalsIgnoreCase("n")) {
            System.out.println("¡Se volverá a pedir datos!");
        } else {
            System.out.println("Sólo puede ingresar S en caso que desee guardar ó N en caso de volver a ingresar los datos.");
        }

    }

    public static void showTiposMagos() {
        System.out.println("Tipos de Magos/Brujas");
        System.out.println("1.Animago");
        System.out.println("2.Metamorfomago");
        System.out.println("3.Estandar");
    }

    public static Casa elegirCasa(String casa) {
        Casa c;
        while (true) {
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
            }
        }
    }

    public static Hechizero elegirTipoMago() {
        Scanner sc = new Scanner(System.in);
        showTiposMagos();
        System.out.println("Elija el tipo de mago/bruja que es:");
        while (true) {
            int tipo = sc.nextInt();
            String animal, hechizo, pocion, deporte;
            Hechizero H;
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

}
