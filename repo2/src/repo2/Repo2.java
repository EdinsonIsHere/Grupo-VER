/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cajas
 */
public class Repo2 {

        public static void main(String[] args) throws IOException {
            
       
            //creo array y los lleno con los valores que tenga mi txt.(INCOMPLETO)
            ArrayList<Curso> ListaCursos=new ArrayList<>();
            ArrayList<Estudiante> ListaEstudiantes=new ArrayList<>();
            ArrayList<Profesor> ListaProfesores=new ArrayList<>();
            
            //Creo mis objetos estudiante y profesor que sirven como plantilla
            Estudiante estudiante=new Estudiante();
            Profesor profesor=new Profesor();
            
            //creo un objeto usuario para validar entrada
            Usuario user=new Usuario();
            String tipo=user.getTipoAcceso();
            if(tipo.equalsIgnoreCase("planificador")){
                System.out.println("/**BIENVENIDO: Planificador**/");
                String volver="N";
                do{
                    System.out.println("1.Crear Curso\n"
                            + "2.Crear Profesor\n"
                            + "3.Crear Estudiante\n"
                            + "4.Ver Horarios Planificados\n"
                            + "5.Listado de Estudiantes");
                    Scanner op1=new Scanner(System.in);
                    String op=op1.nextLine();
                    if(op=="1"){//INCOMPLETO, VALIDAR QUE NO CREE DOS HORARIOS IGUALES
                        
                    }
                    if(op=="2"){//completa
                        profesor.CrearProfesor();
                        profesor.GuardarProfesor(ListaProfesores, profesor);//añado prof a listaprofesores   
                    }
                    if(op=="3"){//completa
                        estudiante.CrearEstudiante();
                        estudiante.GuardarEstudiante(ListaEstudiantes, estudiante);//añado estudiante a ListaEstudiantes
                        
                    }
                    if(op=="4"){//USAR EL ARRAYLIST PARA HACER PRINT DE SUS OBJ
                        
                    }
                    if(op=="5"){//NO SE COMO
                        
                    }
                }while("N".equalsIgnoreCase(volver));//preguntamos si desea volver a seleccionar una opción
                
            }else
                System.out.println("/**BIENVENIDO: Estudiante**/");
                String volver="N";
                do{
                    System.out.println("1.Ver Cursos Planificados\n"
                            + "2.Registro\n"
                            + "3.Descripcion de vuelo");
                    Scanner op1=new Scanner(System.in);
                    String op=op1.nextLine();
                    if(op=="1"){//MISMA QUE OP4 DE PLANIFICADOR
                        
                    }
                    if(op=="2"){ 
                        //solo hay 9 materias y 9 horarios diferentes, genero un array con objetos Cupo(materia,cupo)
                        //compruebo que no exceda los cupos
                        for(Estudiante est:ListaEstudiantes){
                            if(user.getNombre().equalsIgnoreCase(est.Nombre)){
                                if(user.getApellido().equalsIgnoreCase(est.Apellido)){
                                    //procedo a registrarme, validar cupo
                                }
                            }
                        }   
                    }
                    if(op=="3"){//completado
                        for(Estudiante est:ListaEstudiantes){
                            //compruebo que mi usuario esta registrado como estudiante(nombre,apellido)
                            if(user.getNombre().equalsIgnoreCase(est.Nombre)){
                                if(user.getApellido().equalsIgnoreCase(est.Apellido)){
                                    est.volar();
                                }
                                //compruebo que mi usuario esta registrado como estudiante
                                
                            }
                        }
                        
                    }
                }while("N".equalsIgnoreCase(volver));//preguntamos si desea volver a seleccionar una opción
            
            
            
    }
    
}

