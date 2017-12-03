/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionesCH;
import Personas.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
/**
 *
 * @author CLARO
 */
public class Usuario {
    private String user;
    private String contraseña;
    private Persona persona;
    private String rol;

    public Usuario(String user, String contraseña, Persona persona, String rol) {
        this.user = user;
        this.contraseña = contraseña;
        this.persona = persona;
        this.rol = rol;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public static void addUsuariosTXT(Usuario U) {
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileOutputStream("..\\Hogwarts\\usuarios.txt",true));
            outputStream.println(U.getUser() + "," + U.getContraseña() + "," +  U.getPersona().getNombre() + "," + U.getPersona().getApellido() + "," + U.getRol());
        } catch (FileNotFoundException ex) {
            System.out.println("¡Archivo no encontrado!");
            System.exit(0);
        } finally {
            outputStream.close();
        }
    }

}