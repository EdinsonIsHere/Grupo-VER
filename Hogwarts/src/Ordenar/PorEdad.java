
package Ordenar;
import java.util.Comparator;
import Personas.Estudiante;

/**
 * Esta clase ordena los estudiantes por edad
 */
public class PorEdad implements Comparator<Estudiante>{
    
    /**
     * Este método devuelve que estudiante es anterior o posterior a otro
     * dependiendo de la edad, es decir:
     * -1 si estudiante 1 va antes que el estudiante 2 alfabéticamente
     * +1 si estudiante 1 va después que el estudiante 2 alfabéticamente
     * 0 ambos estudiantes van en el mismo orden alfabético
     * @param e1 estudiante 1
     * @param e2 estudiante 2
     * @return  retorna el valor del orden de los dos estudiantes
     */
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
