
package Personas;

/**
 *Esta clase permite definir los detalles de un mago normal
 */
public class Normal extends Hechizero{
    private String deporte;

    /**
     * Este método  define deporte a partir de un parámetro
     * @param deporte nombre del deporte
     */
    public Normal(String deporte) {
        this.deporte = deporte;
    }

    /**
     * Este método devuelve el nombre del deporte
     * @return retorna el deporte
     */
    public String getDeporte() {
        return deporte;
    }

    /**
     * Este método  modifica el nombre del deporte
     * @param deporte nombre del deporte
     */
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
    /**
     * Este método  muestra si ha despegado
     */
    @Override
    public void despegar(){
        System.out.println("¡El mago normal ha despegado!\n");
    }
    
    /**
     * Este método  muestra como puede volar
     */
    @Override
    public void volar(){
        System.out.println("El mago normal puede volar con ayuda de su escoba Nimbus 2000.\n");
    }
    
}