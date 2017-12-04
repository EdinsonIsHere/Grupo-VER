
package Personas;

/**
 *Esta clase permite definir los detalles del metamorfomago
 */
public class Metamorfomago extends Hechizero{
    
    private String pocion;

    /**
     * Este método define el valor de poción a partir de un parámetro
     * @param pocion nombre de la poción
     */
    public Metamorfomago(String pocion) {
        this.pocion = pocion;
    }
    
    /**
     * Este método devuelve el nombre de la poción
     * @return retorna la poción
     */
    public String getPocion(){
        return pocion;
    }
    
    /**
     * Este método modifica el nombre de la poción
     * @param pocion nombre de la poción
     */
    public void setPocion(String pocion){
        this.pocion = pocion;
    }
    
    /**
     * Este método muestra si ha despegado
     */
    @Override
    public void despegar(){
        System.out.println("¡El metamorfomago ha despegado!\n");
    }
    
    /**
     * Este método muestra como puede volar
     */
    @Override
    public void volar(){
        System.out.println("El metamorfomago puede volar con ayuda de su poder, sin varita ni escoba.\n");
    }
}