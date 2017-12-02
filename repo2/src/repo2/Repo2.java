/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo2;
import java.util.ArrayList;

/**
 *
 * @author cajas
 */
public class Repo2 {

        public static void main(String[] args) {
            //creo un objeto profesory alumno
            Estudiante est=new Estudiante();
            est.CrearEstudiante();
            Profesor prof= new Profesor();
            prof.CrearProfesor();
            //creo array
            ArrayList<Estudiante> ListaEstud=new ArrayList<>();
            ArrayList<Profesor> ListaProfesores=new ArrayList<>();
            prof.GuardarProfesor(ListaProfesores, prof);//añado prof a listaprofesores
            est.GuardarEstudiante(ListaEstud, est);
            
            
            
    }
    
}
