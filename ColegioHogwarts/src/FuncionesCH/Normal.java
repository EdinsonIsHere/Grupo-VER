/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesCH;

/**
 *
 * @author CLARO
 */
public class Normal extends Hechizero{
    private String deporte;

    public Normal(String deporte) {
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
    @Override
    public void despegar(){
        System.out.println("¡El mago normal ha despegado!\n");
    }
    
    @Override
    public void volar(){
        System.out.println("El mago normal puede volar con ayuda de su escoba Nimbus 2000.\n");
    }
    
}