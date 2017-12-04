package Personas;

/**
 *Esta clase permite crear los detalles de un animago
 */
public class Animago extends Hechicero{
    private String animal;
    private String hechizo;
    
    /**
     * Este método permite ingresar los valores de un animago por medio de parámetros
     * @param animal nombre del animal
     * @param hechizo hechizo
     */
    public Animago(String animal,String hechizo){
        this.animal=animal;
        this.hechizo=hechizo;
    }
    
    /**
     * Este método devuelve el nombre del animal
     * @return retorna el nombre dle animal
     */
    public String getAnimal() {
        return animal;
    }
    
    /**
     * Este método modifica el nombre del animal
     * @param animal nombre del animal
     */
    public void setAnimal(String animal) {
        this.animal = animal;
    }
    
    /**
     * Este método devuelve el hechizo
     * @return retorna el hechizo
     */
    public String getHechizo() {
        return hechizo;
    }
    
    /**
     * Este método modifica el hechizo
     * @param hechizo hechizo
     */
    public void setHechizo(String hechizo) {
        this.hechizo = hechizo;
    }
    
    /**
     * Este método es implementado de la interfaz Volador
     */
    @Override
    public void despegar(){
        System.out.println("¡El animago ha despegado!\n");
    }
    
    /**
     * Este método es implementado de la interfaz Volador
     */
    @Override
    public void volar(){
        System.out.println("El animago puede volar con ayuda de su varita.\n");
    }
}
