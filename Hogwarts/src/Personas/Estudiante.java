/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author CLARO
 */
public class Estudiante extends Persona implements Comparable<Estudiante> {

    private Casa casa;
    private int materiasReg;

    public Estudiante(Casa casa, String nombre, String apellido, int edad, String varita, Hechizero tipoMago) {
        super(nombre, apellido, edad, varita, tipoMago);
        this.casa = casa;
        this.materiasReg = 0;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public int getMateriasReg() {
        return materiasReg;
    }

    public void incrementar() {
        materiasReg = materiasReg + 1;
    }

    @Override
    public String toString() {
        String frase = getNombre() + " " + getApellido() + "  --  " + getEdad() + " años  --  " + getCasa() + "  --  " + getMateriasReg() + " materia(s)";
        return frase;
    }

    @Override
    public int compareTo(Estudiante e) {
        if (this.getNombre().equalsIgnoreCase(e.getNombre())) {
            return this.getApellido().compareTo(e.getApellido());
        } else {
            return this.getNombre().compareTo(e.getNombre());
        }
    }

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

    public void showVuelo() {
        (this.getTipoMago()).volar();
    }
}
