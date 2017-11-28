
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
}
