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
public class Estudiante extends Persona {
    private Casa casa;
    private static int materiasReg;

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

    public void setMateriasReg(int materiasReg) {
        this.materiasReg = materiasReg;
    }
}
