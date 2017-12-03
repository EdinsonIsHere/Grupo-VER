
package FuncionesCH;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author cajas
 */
public class Archivos {
    
    public ArrayList<Curso> LeerHorariostxt(String direccion){
        ArrayList<Curso> cursos=new ArrayList<Curso>();
    
        try{
            BufferedReader bf=new BufferedReader(new FileReader(direccion));
            String temp="";
            String bfread;
            
            while((bfread=bf.readLine()) !=null){
                String[] dato=new String[5];
                dato=bfread.split( ",");//separo la linea por comas materia,profesor,dia,horario,capacidad
                Curso c1=new Curso();
                c1.setMateria(Materia.POCIONES);//cambiar en orden para cada valor del enum, respetando el  orden
                //c1.setProfesor(dato[1]);
                //c1.setDia(dato[2]);
                c1.setHorario(dato[3]);
                //c1.setCapacidad(dato[4]);//debo pasarlo a string, ayuda
                cursos.add(c1);
                       
            
            } 
            } catch(Exception e) {
                System.err.println("No se encontro archivo");
                    }       
       return cursos;
        
    }
}
