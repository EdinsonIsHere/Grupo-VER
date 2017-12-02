/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cajas
 */
public class Curso {
    String Materia;//enum
    String Profesor;//enum
    int    Capacidad;//validar que nunca exceda
    String dia;//enum
    String Horario;//validar que no se repita
    
    public void CrearCurso(){
        System.out.println("/** MATERIAS **/\n"
                + "1.Pociones\n"
                +"2.Defensa contra las artes oscuras"
                +"3.Adivinacion\n"
                +"4.Astrología\n"
                +"5.Historia de la Magia\n"
                +"6.Herbología\n"
                +"7.Encantamientos\n"
                +"8.Vuelo");
       //usar un switch para los enum y pedir datos 
    }
    public void GuardarCurso(ArrayList<Curso> ListaCursos, Curso curso){
        Scanner c=new Scanner(System.in);
        System.out.println("Desea guardar los datos? S/N: ");
        String guardar=c.nextLine();
        if (guardar=="S"){
            ListaCursos.add(curso);
            System.out.println("Datos del curso guardados ");
        }else
            System.out.println("Datos eliminados.....");  
    }
}
