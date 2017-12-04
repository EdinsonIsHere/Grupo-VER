package Personas;

import FuncionesCH.Casa;
import FuncionesCH.Curso;
import FuncionesCH.Materia;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 *Esta clase permite definir los detalles del estudiante
 */
public class Estudiante extends Persona implements Comparable<Estudiante> {

    private Casa casa;
    private int materiasReg;
    
    /**
     * Este método permite ingresar valores del estudiante por medio de parámetros
     * @param casa objeto casa
     * @param nombre nombre del estudiante
     * @param apellido apellido del estudiante
     * @param edad edad del estudiante
     * @param varita nombre de la varita del estudiante
     * @param tipoMago  tipo de mago que es el estudiante
     */
    public Estudiante(Casa casa, String nombre, String apellido, int edad, String varita, Hechicero tipoMago) {
        super(nombre, apellido, edad, varita, tipoMago);
        this.casa = casa;
        this.materiasReg = 0;
    }
    
    /**
     * Este método devuelve el objeto casa
     * @return retorna el objeto casa
     */
    public Casa getCasa() {
        return casa;
    }
    
    /**
     * Este método modifica el objeto casa
     * @param casa  objeto casa
     */
    public void setCasa(Casa casa) {
        this.casa = casa;
    }
    
    /**
     * Este método devuelve el número de materias en que se ha registrado
     * @return retorna el número de materias
     */
    public int getMateriasReg() {
        return materiasReg;
    }
    
    /**
     * Este método incrementa el número de materias registradas
     */
    public void incrementar() {
        materiasReg = materiasReg + 1;
    }
    
    /**
     * Este método convierte a string los datos del estudiantes
     * @return retorna los datos del estudiante como frase
     */
    @Override
    public String toString() {
        String frase = getNombre() + " " + getApellido() + "  --  " + getEdad() + " años  --  " + getCasa() + "  --  " + getMateriasReg() + " materia(s)";
        return frase;
    }
    
    /**
     * Este método compara estudiante en orden lexicográfico
     * @param e estudiante
     * @return retorna valor 0, 1 ó -1.
     */
    @Override
    public int compareTo(Estudiante e) {
        if (this.getNombre().equalsIgnoreCase(e.getNombre())) {
            return this.getApellido().compareTo(e.getApellido());
        } else {
            return this.getNombre().compareTo(e.getNombre());
        }
    }
    
    /**
     * Este método le permite ver al estudiante los cursos planificados
     * @param cursos lista de cursos
     */
    public void verHorarios(ArrayList<Curso> cursos) {
        Scanner sc = new Scanner(System.in);
        if (cursos != null) {
            int i = 1;
            System.out.println("/** CURSOS PLANIFICADOS **/");
            for (Curso C : cursos) {
                System.out.println(i + ". " + C.getMateria());
                i++;
            }
            System.out.print("Elija una materia del listado de materias: ");
            int num = sc.nextInt();
            sc.nextLine();
            Curso curso = cursos.get(num - 1);

            System.out.println("\nMATERIA: " + curso.getMateria());
            System.out.println("PROFESOR: " + (curso.getProfesor()).getNombre() + " " + (curso.getProfesor()).getApellido());
            System.out.println("HORARIO: " + curso.getDia() + ", " + curso.getHorario());

        } else {
            System.out.println("¡Aún no hay cursos creados!");
        }

    }
    
    /**
     * Este método le permite al estudiante registrarse en un curso
     * @param cursos lista de cursos
     */
    public void registrar(ArrayList<Curso> cursos) {
        showCursos(cursos);
        System.out.print("Elija la materia para registrar: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            sc.nextLine();
            if (num <= cursos.size() && num > 0) {
                Curso C = cursos.get(num - 1);
                if (C.getRegistrados() < C.getCapacidad()) {
                    System.out.println("El horario de " + C.getMateria() + " es " + C.getDia() + ", " + C.getHorario());

                    System.out.print("\n¿Desea registrarse? S/N : ");
                    String conf = sc.nextLine();
                    if (conf.equalsIgnoreCase("s")) {
                        String tipoRegistro = "normal";
                        this.incrementar();
                        C.aumentarRegistrados();
                        if (C.getMateria() == Materia.POCIONES || C.getMateria() == Materia.DEFENSA_CONTRA_LAS_ARTES_OSCURAS || C.getMateria() == Materia.ADIVINACION) {
                            if (this.getEdad() <= 15) {
                                tipoRegistro = "extraordinario";
                            }
                        }
                        addRegistroTXT(this.getNombre(), this.getApellido(), C.getMateria(), tipoRegistro);
                        System.out.println("Se ha registrado en la materia.");
                        break;
                    } else if (conf.equalsIgnoreCase("n")) {
                        System.out.println("¡Se volverá al inicio!");
                    } else {
                        System.out.println("Sólo puede ingresar S en caso que desee guardar ó N en caso de volver a ingresar los datos.");
                    }
                }else{
                    System.out.println("\n¡No existen cupos libres!\n");
                }

            } else {
                System.out.println("Ingrese un opción válida.");
            }
        }

    }
    
    /**
     * Este método permite añadir al archivo registro.txt sus respectivos datos
     * @param nombre nombre
     * @param apellido apellido
     * @param materia nombre de la materia
     * @param tipoReg tipo de registro
     */
    public static void addRegistroTXT(String nombre, String apellido, Materia materia, String tipoReg) {
        PrintWriter outputStream = null;
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        try {
            outputStream = new PrintWriter(new FileOutputStream("..\\Hogwarts\\registro.txt", true));
            outputStream.println(dia+"/"+(mes+1)+"/"+año+"," + nombre + "," + apellido + "," + materia + "," + tipoReg);
        } catch (FileNotFoundException ex) {
            System.out.println("¡Archivo no encontrado!");
            System.exit(0);
        } finally {
            outputStream.close();
        }

    }
    
    /**
     * Este método muestra si hay cursos creados
     * @param cursos lista de cursos
     */
    public static void showCursos(ArrayList<Curso> cursos) {
        if (cursos != null) {
            int i = 1;
            System.out.println("/** REGISTROS **/");
            for (Curso C : cursos) {
                System.out.println(i + ". " + C.getMateria());
                i++;
            }
        } else {
            System.out.println("¡Aún no hay cursos creados!");
        }
    }
    
    /**
     * Este método muestra la descripción de vuelo del estudiante
     */
    public void showVuelo() {
        (this.getTipoMago()).volar();
    }
    
}