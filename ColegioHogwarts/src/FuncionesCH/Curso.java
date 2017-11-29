/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesCH;

/**
 *
 * @author CLARO
 */
public class Curso {
    private Materia materia;
    private Profesor profesor;
    private int capacidad;
    private Dia dia;
    private String horario;
    private static int registrados = 0;
    
    public Curso(){
        materia = null;
        profesor = null;
        capacidad = 0;
        dia = null;
        horario = null;
        
    }

    public Curso(Materia materia, Profesor profesor, int capacidad, Dia dia, String horario) {
        this.materia = materia;
        this.profesor = profesor;
        this.capacidad = capacidad;
        this.dia = dia;
        this.horario = horario;
    }
    
    
    
    
    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public static int getRegistrados() {
        return registrados;
    }

    public static void setRegistrados(int registrados) {
        Curso.registrados = registrados;
    }
    
}
