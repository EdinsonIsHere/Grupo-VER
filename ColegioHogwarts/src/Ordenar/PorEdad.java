/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenar;
import java.util.Comparator;
import FuncionesCH.Estudiante;

/**
 *
 * @author CLARO
 */
public class PorEdad implements Comparator<Estudiante>{
    
    @Override
    public int compare(Estudiante e1, Estudiante e2){
        if (e1.getEdad() > e2.getEdad())return 1;
        if (e1.getEdad() < e2.getEdad()) return -1;
        if (e1.getEdad() == e2.getEdad()){
            return e1.getNombre().compareTo(e2.getNombre());
        }
        return 0;
    }
}
