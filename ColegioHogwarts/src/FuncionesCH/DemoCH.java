
package FuncionesCH;

import java.io.IOException;

public class DemoCH {
    public static void main(String[] args) throws IOException {
        System.out.println("Bienvenido al programa del Colegio Hogwarts");

        Ingreso acceso = new Ingreso();
        acceso.getAcceso();
        
        if (acceso.getRol().equals("planificador")){

            Planificador planificador = new Planificador();
            planificador.opcionesP();
            
        }
    }
}
