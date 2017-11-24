
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
}
