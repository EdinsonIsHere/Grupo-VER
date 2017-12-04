package Personas;

/**
 * Esta clase permite definir los detalles del profesor
 */
public class Profesor extends Persona{
    
    private String fechaIngreso;
    private String cosa;
    
    /**
     * Este método define al profesor por medio de parámetros
     * @param fechaIngreso fecha de ingreso
     * @param nombre nombre del profesor
     * @param apellido apellido del profesor
     * @param edad edad del profesor
     * @param varita nombre de la varita del profesor
     * @param tipoMago  tipo de mago que es el profesor
     */
    public Profesor(String fechaIngreso, String nombre, String apellido, int edad, String varita, Hechicero tipoMago) {
        super(nombre, apellido, edad, varita, tipoMago);
        this.fechaIngreso = fechaIngreso;
    }
    
    /**
     * Este método  devuelve la fecha de ingreso
     * @return retorna la fecha de ingreso
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }
    
    /**
     * Este método modifica la fecha de ingreso
     * @param fechaIngreso fecha de ingreso
     */
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
