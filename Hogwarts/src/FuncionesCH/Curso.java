
package FuncionesCH;

import Personas.Profesor;

/**
 * Esta clase te permite guardas los datos del curso
 */
public class Curso {
    private Materia materia;
    private Profesor profesor;
    private int capacidad;
    private Dia dia;
    private String horario;
    private int registrados;
    
    /**
     * Este método permite ingresar los datos nulos del curso
     */
    public Curso(){
    }

    /**
     * Este método permite ingresar los datos del cuso por medio de parámetros
     * @param materia nombre de la materia
     * @param profesor nombre del profesor
     * @param capacidad numero de la capacidad del curso
     * @param dia dia de la curso
     * @param horario horarios de la curso
     */
    public Curso(Materia materia, Profesor profesor, int capacidad, Dia dia, String horario) {
        this.materia = materia;
        this.profesor = profesor;
        this.capacidad = capacidad;
        this.dia = dia;
        this.horario = horario;
        this.registrados = 0;
    }
    
    /**
     * Este método devuelve la materia
     * @return retorna la materia
     */
    public Materia getMateria() {
        return materia;
    }

    /**
     * Este método modifica la materia
     * @param materia nombre de la materia
     */
    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    /**
     * Este método devuelve el objeto del profesor
     * @return retorna el objeto profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Este método modifica el objeto profesor
     * @param profesor retorna el objeto profesor
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    /**
     * Este método devuelve el número de la capacidad del curso
     * @return retorna la capacidad del cutso
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Este método modifica la capacidad del curso
     * @param capacidad número de la capacidad del curso
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Este método devuelve el objeto día
     * @return retorna el objeto día
     */
    public Dia getDia() {
        return dia;
    }

    /**
     * Este método modifica el objeto día
     * @param dia retorna el objeto día
     */
    public void setDia(Dia dia) {
        this.dia = dia;
    }

    /**
     * Este método devuelve el horario del curso
     * @return retorna el horario del curso
     */
    public String getHorario() {
        return horario;
    }

    /**
     * Este método modifica el horario del curso
     * @param horario  horario del curso
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * Este método devuelve el número de registrados
     * @return retorna el número de registrados
     */
    public int getRegistrados() {
        return registrados;
    }

    /**
     * Este método modifica el numero de registrados
     * @param registrados número de registrados
     */
    public void setRegistrados(int registrados) {
        this.registrados = registrados;
    }
    
    /**
     * Este método incrementa en 1 el número de registrados
     */
    public void aumentarRegistrados(){
        this.registrados = registrados +1;
    }
    
}