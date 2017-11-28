
package FuncionesCH;


public class Metamorfomago {
   
    private String pocion;
    
    public Metamorfomago(){
        pocion=null;
    }

    public Metamorfomago(String pocion) {
        this.pocion = pocion;
    }
    
    public String getPocion(){
        return pocion;
    }
    public void setPocion(String pocion){
        this.pocion = pocion;
    }

    public void despegar(){
        System.out.println("¡El metamorfomago ha despegado!\n");
    }

    public void volar(){
        System.out.println("El metamorfomago puede volar con ayuda de su poder, sin varita ni escoba.\n");
    }
}