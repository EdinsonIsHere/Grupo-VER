
package FuncionesCH;
import java.util.ArrayList;

public class Academico_Hogwarts {
    
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> horarios;
    private ArrayList<Profesor> profesores;

    public Academico_Hogwarts() {
        estudiantes = new ArrayList();
        horarios = new ArrayList();
        profesores = new ArrayList();
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
    
}