
package Personas;

/**
 * Esta clase permite definir los detalles de los/las magos/brijas
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String varita;
    private Hechizero tipoMago;
    
    /**
     * Este método permite ingresar valores a un objeto persona con parámetros
     * @param nombre nombre de la persona
     * @param apellido apellido de la persona
     * @param edad edad de la persona
     * @param varita varita de la persona
     * @param tipoMago  tipo de mago que es la persona
     */
    public Persona(String nombre, String apellido, int edad, String varita, Hechizero tipoMago) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.varita = varita;
        this.tipoMago = tipoMago;
    }

    /**
     * Este método devuele el nombre de la persona
     * @return retorna el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este método  modifica el nombre de la persona
     * @param nombre nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este método devuelve el apellido de la persona
     * @return retorna el apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Este método modifica el apellido de la persona
     * @param apellido  apellido de la persona
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Este método devuelve la edad de la persona
     * @return retorna la edad de la persona
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Este método modifica la edad de la persona
     * @param edad edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Este método devuelve el nombre de la varita
     * @return retorna el nombre de la varita
     */
    public String getVarita() {
        return varita;
    }
    
    /**
     * Este método modifica el nombre de la varita
     * @param varita nombre de la varita
     */
    public void setVarita(String varita) {
        this.varita = varita;
    }

    /**
     * Este método devuelve el tipo de mago
     * @return retorna el tipo de mago
     */
    public Hechizero getTipoMago() {
        return tipoMago;
    }

    /**
     * Este método modifica el tipo de mago
     * @param tipoMago nombre del tipo de mago
     */
    public void setTipoMago(Hechizero tipoMago) {
        this.tipoMago = tipoMago;
    }
}