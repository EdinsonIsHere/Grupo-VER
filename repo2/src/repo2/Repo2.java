/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo2;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author cajas
 */
public class Repo2 {

        public static void main(String[] args) throws IOException {
            /*creo un objeto profesor y alumno
            Estudiante est=new Estudiante();
            est.CrearEstudiante();
            Profesor prof= new Profesor();
            prof.CrearProfesor();
            //creo array
            ArrayList<Estudiante> ListaEstud=new ArrayList<>();
            ArrayList<Profesor> ListaProfesores=new ArrayList<>();
            prof.GuardarProfesor(ListaProfesores, prof);//añado prof a listaprofesores
            est.GuardarEstudiante(ListaEstud, est);*/
            //creo un objeto usuario
            Usuario user=new Usuario();
            String tipo=user.getTipoAcceso();
            if(tipo.equalsIgnoreCase("planificador")){
                System.out.println("/**BIENVENIDO: Planificador**/");
                //corre menu planificador
                
            }else
                System.out.println("/**BIENVENIDO: Estudiante**/");
                
            
            
            
    }
    
}
