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
public class Profesor extends Persona{
    
    private String fechaIngreso;
    private String cosa;

    public Profesor(String fechaIngreso, String nombre, String apellido, int edad, String varita, Hechizero tipoMago) {
        super(nombre, apellido, edad, varita, tipoMago);
        this.fechaIngreso = fechaIngreso;
    }
    
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
