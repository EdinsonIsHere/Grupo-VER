
package FuncionesCH;

import java.io.IOException;

public class DemoCH {
    public static void main(String[] args) throws IOException {
        System.out.println("Prueba de commit");
        System.out.println("Bienvenido al programa del Colegio Hogwarts");
<<<<<<< HEAD
        Ingreso comenzar = new Ingreso();
        String tipoPersona = comenzar.getTipoAcceso();
        System.out.println("El tipo de persona es : "+ tipoPersona);
=======
        Ingreso acceso = new Ingreso();
        acceso.getAcceso();
        
        if (acceso.getRol().equals("planificador")){

            Planificador planificador = new Planificador();
            planificador.opcionesP();
            
        }
>>>>>>> parent of 102d73c... Merge branch 'master' of https://github.com/EdinsonIsHere/Grupo-VER
    }
}
