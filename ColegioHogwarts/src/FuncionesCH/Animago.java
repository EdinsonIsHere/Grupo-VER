
package FuncionesCH;

public class Animago extends Persona{

    private String animal;
    private String hechizo;
    
    public Animago(){
        animal=null;
        hechizo=null;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal){
           this.animal = animal;
    }

    public String getHechizo() {
        return hechizo;
    }

    public void setHechizo(String hechizo) {
        this.hechizo = hechizo;
    }
    

    public void despegar(){
        System.out.println("¡El animago ha despegado!\n");
    }
    

    public void volar(){
        System.out.println("El animago puede volar con ayuda de su varita.\n");
    }
}
