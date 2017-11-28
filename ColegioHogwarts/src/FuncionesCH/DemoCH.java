
package FuncionesCH;

import java.io.IOException;

public class DemoCH {
    public static void main(String[] args) throws IOException {
        System.out.println("Prueba de commit");
        System.out.println("Bienvenido al programa del Colegio Hogwarts");
        Ingreso comenzar = new Ingreso();
        String tipoPersona = comenzar.getTipoAcceso();
        System.out.println("El tipo de persona es : "+ tipoPersona);
        
    }
    
    public static void showMenuPlanificador(){
        System.out.println("/** PLANIFICADOR **/\n");
        System.out.println("1. Crear Curso");
        System.out.println("2. Crear Profesor");
        System.out.println("3. Crear Estudiante");
        System.out.println("4. Ver Horarios Planificados");
        System.out.println("5. Listado de Estudiantes");
    }
    
    public static void showMenuEstudiantes(){
        System.out.println("/** ESTUDIANTE **/\n");
        System.out.println("1. Ver Cursos Planificados");
        System.out.println("2. Registro");
        System.out.println("3. Descripción de Vuelo");
    }
    
}
