package FuncionesCH;
import Personas.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Esta clase permite tener los detalles del usuario
 */
public class Usuario {
    private String user;
    private String contraseña;
    private Persona persona;
    private String rol;
    
    /**
     * Este método permite crear un usuario con parámetros
     * @param user nombre del uuario
     * @param contraseña contraseña del usuario
     * @param persona objeto persona
     * @param rol nombre del rol del usuario
     */
    public Usuario(String user, String contraseña, Persona persona, String rol) {
        this.user = user;
        this.contraseña = contraseña;
        this.persona = persona;
        this.rol = rol;
    }
    
    /**
     * Este método devuelve el usuario
     * @return retorna el nombre del usuario
     */
    public String getUser() {
        return user;
    }
    
    /**
     * Este metodo modifica el nombre del usuario
     * @param user nombre del usuario
     */
    public void setUser(String user) {
        this.user = user;
    }
    
    /**
     * Este metodo devuelve la contraseña
     * @return retorna la contraseña
     */
    public String getContraseña() {
        return contraseña;
    }
    
    /**
     * Este metodo modifica la contraseña
     * @param contraseña contraseña del usuario
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    /**
     * Este método devuelve el objeto persona
     * @return retorna el objeto persona
     */
    public Persona getPersona() {
        return persona;
    }
    
    /**
     * Este método modifica el objeto persona
     * @param persona objeto persona
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    /**
     * Este método devuelve el rol del usuario
     * @return retorna el rol del usuario
     */
    public String getRol() {
        return rol;
    }
    
    /**
     * Este método modifica el rol del usuario
     * @param rol nombre del rol del usuario
     */
    public void setRol(String rol) {
        this.rol = rol;
    }
    
    /**
     * Este método permite ingresar los datos del usuario al archivo usuarios.txt
     * @param U objeto usuario
     */
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