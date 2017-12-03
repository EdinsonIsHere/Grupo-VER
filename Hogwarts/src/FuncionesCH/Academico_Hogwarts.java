/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesCH;

import Personas.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CLARO
 */
public class Academico_Hogwarts {

    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> horarios;
    private ArrayList<Profesor> profesores;
    private ArrayList<Usuario> usuarios;

    public Academico_Hogwarts() {
        estudiantes = new ArrayList();
        horarios = new ArrayList();
        profesores = new ArrayList();
        usuarios = new ArrayList();
    }

    //Para una rápida prueba del funcionamiento del programa, se creara un método que inicialice
    //los atributos con un planificador, 3 cursos, 4 estudiantes y 5 profesores.
    public void iniciarSistema() {
        Planificador Planif = new Planificador("Albus","Dumbledore",45,"roble", new Normal("golf"));
        Usuario UP = new Usuario("adumb","adumb34",Planif,"planificador");
        usuarios.add(UP);
        Usuario.addUsuariosTXT(UP);
        Profesor P1 = new Profesor("02/05/2017", "John", "Carson", 27, "aliso", new Animago("perro", "hechizo_1"));
        Profesor P2 = new Profesor("01/05/2016", "Steven", "Rooney", 31, "cedro", new Normal("tenis"));
        Profesor P3 = new Profesor("06/05/2013", "Mac", "Tyler", 28, "manzano", new Normal("soccer"));
        Profesor P4 = new Profesor("01/05/2011", "Donald", "Perez", 35, "manzano", new Normal("basquet"));
        Profesor P5 = new Profesor("08/05/2014", "Abraham", "Anderosn", 33, "cornejo", new Metamorfomago("poción de uva"));
        
        Curso C1 = new Curso(Materia.POCIONES, P1, 15, Dia.LUNES,"10:00-12:00");
        Curso C2 = new Curso(Materia.DEFENSA_CONTRA_LAS_ARTES_OSCURAS, P2, 15, Dia.MARTES,"10:00-12:00");
        Curso C3 = new Curso(Materia.ADIVINACION, P3, 15, Dia.MIÉRCOLES,"10:00-12:00");
        horarios.add(C1);horarios.add(C2);horarios.add(C3);
        Planificador.addCursosTXT(C1);Planificador.addCursosTXT(C2);Planificador.addCursosTXT(C3);
        
        profesores.add(P1);
        Planificador.addProfesoresTXT(P1);
        profesores.add(P2);
        Planificador.addProfesoresTXT(P2);
        profesores.add(P3);
        Planificador.addProfesoresTXT(P3);
        profesores.add(P4);
        Planificador.addProfesoresTXT(P4);
        profesores.add(P5);
        Planificador.addProfesoresTXT(P5);
        Estudiante E1 = new Estudiante(Casa.GRYFFINDOR, "Harry", "Potter", 16, "espino", new Animago("ratón", "hechizo_22"));
        Estudiante E2 = new Estudiante(Casa.RAVENCLAW, "Colin", "Creevey", 12, "cedro", new Normal("soccer"));
        Estudiante E3 = new Estudiante(Casa.SLYTHERIN, "Draco", "Malfoy", 15, "acebo", new Normal("tenis"));
        Estudiante E4 = new Estudiante(Casa.GRYFFINDOR, "Hermione", "Granger", 14, "manzano", new Metamorfomago("poción de limón"));
        Usuario U1 = new Usuario("hapott","hapotter124",E1,"estudiante");
        Usuario.addUsuariosTXT(U1);usuarios.add(U1);
        Usuario U2 = new Usuario("cocree","creevey23",E2,"estudiante");
        Usuario.addUsuariosTXT(U2);usuarios.add(U2);
        Usuario U3 = new Usuario("draquito","malfoy99",E3,"estudiante");
        Usuario.addUsuariosTXT(U3);usuarios.add(U3);
        Usuario U4 = new Usuario("hermiGr","granger90",E4,"estudiante");
        Usuario.addUsuariosTXT(U4);usuarios.add(U4);
       
        estudiantes.add(E1);
        Planificador.addEstudiantesTXT(E1);
        estudiantes.add(E2);
        Planificador.addEstudiantesTXT(E2);
        estudiantes.add(E3);
        Planificador.addEstudiantesTXT(E3);
        estudiantes.add(E4);
        Planificador.addEstudiantesTXT(E4);

    }

    public Persona ingresarSistema(String usuario, String contraseña, ArrayList<Usuario> usuarios) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        String linea = null;
        Persona P = null;
        FileReader archivo = new FileReader("..\\Hogwarts\\usuarios.txt");

        BufferedReader br = new BufferedReader(archivo);

        while ((linea = br.readLine()) != null) {
            if (linea.split(",")[0].equalsIgnoreCase(usuario)) {
                if (linea.split(",")[1].equalsIgnoreCase(contraseña)) {
                    String rol = linea.split(",")[4];
                    if (rol.equalsIgnoreCase("planificador")){
                        System.out.println("\n¡Ingreso Exitoso!\n");
                        for (Usuario U: usuarios){
                            if(U.getUser().equals(usuario) && U.getContraseña().equals(contraseña)){
                                P= U.getPersona();
                                return P;
                            }
                        }
                    }else if(rol.equalsIgnoreCase("estudiante")){
                        System.out.println("\n¡Ingreso Exitoso!\n");
                        for (Usuario U: usuarios){
                            if(U.getUser().equals(usuario) && U.getContraseña().equals(contraseña)){
                                P= U.getPersona();
                                return P;
                            }
                        }
                    }
                    break;
                }
            }
        }
        return P;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Curso> getHorarios() {
        return horarios;
    }

    public void setHorarios(ArrayList<Curso> horarios) {
        this.horarios = horarios;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}