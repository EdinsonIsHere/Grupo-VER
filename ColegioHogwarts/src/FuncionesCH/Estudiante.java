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
public class Estudiante extends Persona implements Comparable<Estudiante>{
    private Casa casa;
    private static int materiasReg = 0;

    public Estudiante(Casa casa, String nombre, String apellido, int edad, String varita, Hechizero tipoMago) {
        super(nombre, apellido, edad, varita, tipoMago);
        this.casa = casa;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public int getMateriasReg() {
        return materiasReg;
    }

    public void incrementar(int num) {
        materiasReg = materiasReg + 1;
    }
    
    @Override
    public String toString(){
        String frase= getNombre()+" "+getApellido()+"  --  "+getEdad()+" años  --  "+getCasa()+"  --  "+getMateriasReg()+" materias";
        return frase;
    }
    
    @Override
    public int compareTo(Estudiante e){
        if( this.getNombre().equalsIgnoreCase(e.getNombre()) ){
            return this.getApellido().compareTo(e.getApellido());
        } else{
            return this.getNombre().compareTo(e.getNombre());
        }
    }
}
