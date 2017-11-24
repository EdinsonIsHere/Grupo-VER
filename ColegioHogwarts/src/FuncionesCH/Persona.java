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

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String varita;
    private Hechizero tipoMago;

    public Persona(String nombre, String apellido, int edad, String varita, Hechizero tipoMago) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.varita = varita;
        this.tipoMago = tipoMago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getVarita() {
        return varita;
    }

    public void setVarita(String varita) {
        this.varita = varita;
    }

    public Hechizero getTipoMago() {
        return tipoMago;
    }

    public void setTipoMago(Hechizero tipoMago) {
        this.tipoMago = tipoMago;
    }
}