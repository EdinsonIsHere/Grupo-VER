/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import FuncionesCH.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import Ordenar.PorEdad;
import Ordenar.PorMatReg;

/**
 *
 * @author CLARO
 */
public class Planificador extends Persona {

    public Planificador(String nombre, String apellido, int edad, String varita, Hechizero tipoMago) {
        super(nombre, apellido, edad, varita, tipoMago);
    }

    public void crearCurso(Academico_Hogwarts AH) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Mostrar.showMaterias();
            System.out.print("Elija una materia del listado de materias: ");

            Materia M = null;
            while (true) {
                int num = sc.nextInt();
                sc.nextLine();
                if (num <= 8 && num > 0) {
                    if (Mostrar.existeCurso(num,AH) == false) {
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
                        break;
                    } else {
                        System.out.println("¡El curso ya existe!, ingrese otro: ");
                    }
                }else{
                    System.out.print("Opción inválida, ingrese de nuevo: ");
                }
            }

            System.out.println("\n");
            Mostrar.showProfesores(AH);
            System.out.println("Elija un profesor del listado: ");
            Profesor P;
            while (true) {
                int eleccion = sc.nextInt();
                if (eleccion <= (AH.getProfesores()).size() && eleccion >= 0) {
                    P = AH.getProfesores().get(eleccion - 1);
                    break;
                } else {
                    System.out.println("La opción es inválida, ingrese de nuevo: ");
                }
            }
            System.out.print("\nIngrese la capacidad del curso para " + M.toString() + ": ");
            int cap = sc.nextInt();
            sc.nextLine();

            Dia d = Mostrar.elegirDia();

            System.out.print("\nIngrese el horario del curso: ");
            String hora = sc.nextLine();

            System.out.print("\n¿Desea crear el curso con la información establecida? S/N: ");
            String conf = sc.nextLine();
            if (conf.equalsIgnoreCase("s")) {
                Curso C = new Curso(M, P, cap, d, hora);
                (AH.getHorarios()).add(C);
                addCursosTXT(C);
                System.out.println("\nSe ha creado el curso:\n");
                System.out.println("    MATERIA: " + C.getMateria());
                System.out.println("    PROFESOR: " + (C.getProfesor()).getNombre() + " " + (C.getProfesor()).getApellido());
                System.out.println("    CAPACIDAD: " + C.getCapacidad());
                System.out.println("    HORARIO: " + C.getDia() + " " + C.getHorario());
                break;
            } else if (conf.equalsIgnoreCase("n")) {
                System.out.println("¡Se volverá a pedir datos!");
            } else {
                System.out.println("Sólo puede ingresar S en caso que desee guardar ó N en caso de volver a ingresar los datos.");
            }

        }
    }

    public static void addCursosTXT(Curso curso) {
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileOutputStream("..\\Hogwarts\\cursos.txt", true));
            outputStream.println(curso.getMateria() + "," + (curso.getProfesor()).getNombre() + " " + (curso.getProfesor()).getApellido() + "," + curso.getDia() + "," + curso.getHorario() + "," + curso.getCapacidad());
        } catch (FileNotFoundException ex) {
            System.out.println("¡Archivo no encontrado!");
            System.exit(0);
        } finally {
            outputStream.close();
        }
    }

    public void crearProfesor(ArrayList<Profesor> profes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("/** CREAR PROFESOR **/\n");

        System.out.print("Ingrese Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese Apellidos: ");
        String apellidos = sc.nextLine();

        System.out.print("Ingrese Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Varita: ");
        String varita = sc.nextLine();

        System.out.print("Fecha de Ingreso: ");
        String fechaIn = sc.nextLine();

        Hechizero H = Mostrar.elegirTipoMago();

        System.out.println("\n¿Desea guardar los datos? S/N: ");
        String conf = sc.nextLine();
        if (conf.equalsIgnoreCase("s")) {
            Profesor profe = new Profesor(fechaIn, nombre, apellidos, edad, varita, H);
            profes.add(profe);
            addProfesoresTXT(profe);
            System.out.println("Sus datos se han guardado correctamente.\n");
        } else if (conf.equalsIgnoreCase("n")) {
            System.out.println("¡Se volverá a pedir datos!");
        } else {
            System.out.println("Sólo puede ingresar S en caso que desee guardar ó N en caso de volver a ingresar los datos.");
        }

    }

    public static void addProfesoresTXT(Profesor P) {
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileOutputStream("..\\Hogwarts\\profesores.txt", true));
            Hechizero H = P.getTipoMago();
            if (H instanceof Animago) {
                outputStream.println(P.getNombre() + "," + P.getApellido() + "," + P.getEdad() + "," + P.getVarita() + "," + P.getFechaIngreso() + ",Animago," + ((Animago) H).getAnimal() + "," + ((Animago) H).getHechizo() + ",null,null");
            } else if (H instanceof Metamorfomago) {
                outputStream.println(P.getNombre() + "," + P.getApellido() + "," + P.getEdad() + "," + P.getVarita() + "," + P.getFechaIngreso() + ",Metamorfomago,null,null," + ((Metamorfomago) H).getPocion() + ",null");
            } else if (H instanceof Normal) {
                outputStream.println(P.getNombre() + "," + P.getApellido() + "," + P.getEdad() + "," + P.getVarita() + "," + P.getFechaIngreso() + ",Normal,null,null,null," + ((Normal) H).getDeporte());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("¡Archivo no encontrado!");
            System.exit(0);
        } finally {
            outputStream.close();
        }

    }

    public void crearEstudiante(ArrayList<Estudiante> estudiantes, ArrayList<Usuario> users) {
        Scanner sc = new Scanner(System.in);
        System.out.println("/** CREAR ESTUDIANTE **/\n");

        System.out.print("Ingrese Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese Apellidos: ");
        String apellidos = sc.nextLine();

        System.out.print("Ingrese Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Varita: ");
        String varita = sc.nextLine();

        Casa c = Mostrar.elegirCasa();

        Hechizero H = Mostrar.elegirTipoMago();

        System.out.print("\n¿Desea guardar los datos? S/N : ");

        String conf = sc.nextLine();
        if (conf.equalsIgnoreCase("s")) {
            Estudiante est = new Estudiante(c, nombre, apellidos, edad, varita, H);
            estudiantes.add(est);
            addEstudiantesTXT(est);
            System.out.println("Sus datos se han guardado correctamente.\n");
            System.out.print("Ingrese el usuario para el estudiante: ");
            String user = sc.nextLine();
            System.out.print("Ingrese la contraseña para el estudiante: ");
            String password = sc.nextLine();
            Usuario U = new Usuario(user, password, est, "estudiante");
            users.add(U);
            Usuario.addUsuariosTXT(U);
        } else if (conf.equalsIgnoreCase("n")) {
            System.out.println("¡Se volverá a pedir datos!");
        } else {
            System.out.println("Sólo puede ingresar S en caso que desee guardar ó N en caso de volver a ingresar los datos.");
        }

    }

    public static void addEstudiantesTXT(Estudiante e) {
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileOutputStream("..\\Hogwarts\\estudiantes.txt", true));
            if (e.getTipoMago() instanceof Animago) {
                outputStream.println(e.getNombre() + "," + e.getApellido() + "," + e.getEdad() + "," + e.getVarita() + "," + e.getCasa() + "," + "Animago");
            } else if (e.getTipoMago() instanceof Metamorfomago) {
                outputStream.println(e.getNombre() + "," + e.getApellido() + "," + e.getEdad() + "," + e.getVarita() + "," + e.getCasa() + "," + "Metamorfomago");
            } else if (e.getTipoMago() instanceof Normal) {
                outputStream.println(e.getNombre() + "," + e.getApellido() + "," + e.getEdad() + "," + e.getVarita() + "," + e.getCasa() + "," + "Normal");
            }

        } catch (FileNotFoundException ex) {
            System.out.println("¡Archivo no encontrado!");
            System.exit(0);
        } finally {
            outputStream.close();
        }
    }

    public void verHorarios(ArrayList<Curso> cursos) {
        Scanner sc = new Scanner(System.in);
        if (cursos.size() != 0) {
            int i = 1;
            System.out.println("/** CURSOS PLANIFICADOS **/");
            for (Curso C : cursos) {
                System.out.println(i + ". " + C.getMateria());
                i++;
            }
            System.out.println("Elija una materia del listado de materias: ");
            int num = sc.nextInt();
            sc.nextLine();
            Curso curso = cursos.get(num - 1);

            System.out.println("MATERIA: " + curso.getMateria());
            System.out.println("PROFESOR: " + (curso.getProfesor()).getNombre() + " " + (curso.getProfesor()).getApellido());
            System.out.println("HORARIO: " + curso.getDia() + ", " + curso.getHorario());
            System.out.println("REGISTRADOS: " + curso.getRegistrados());

        } else {
            System.out.println("\n¡Aún no hay cursos creados!\n");
        }

    }

    public void verListadoEstudiantes(ArrayList<Estudiante> estudiantes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("/** LISTADO DE ESTUDIANTES **/");
        System.out.println("1. Nombre");
        System.out.println("2. Edad");
        System.out.println("3. Número de materias registradas");
        System.out.println("Elija el criterio para ordenar: ");
        while (true) {
            int num = sc.nextInt();
            sc.nextLine();
            if (num <= 3 && num > 0) {
                if (num == 1) {
                    Collections.sort(estudiantes);
                    Mostrar.showListado(estudiantes);
                    break;
                } else if (num == 2) {
                    Collections.sort(estudiantes, new PorEdad());
                    Mostrar.showListado(estudiantes);
                    break;
                } else if (num == 3) {
                    Collections.sort(estudiantes, new PorMatReg());
                    Mostrar.showListado(estudiantes);
                    break;
                }
            } else {
                System.out.println("Dicha opción no existe, elija de nuevo:");
            }
        }

    }

}
