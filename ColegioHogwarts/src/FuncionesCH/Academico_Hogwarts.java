/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesCH;
import java.util.ArrayList;

/**
 *
 * @author CLARO
 */
public class Academico_Hogwarts {
    
    private static ArrayList<Estudiante> estudiantes;
    private static ArrayList<Curso> horarios;
    public static ArrayList<Profesor> profesores;

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
    
    
    
}
