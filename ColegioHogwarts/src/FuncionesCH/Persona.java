package FuncionesCH;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String varita;
    private String tipoMago;
    
    public Persona(){
        nombre = null;
        apellido = null;
        edad = 0;
        varita = null;
        tipoMago = null;
    }

    public Persona(String nombre, String apellido, int edad, String varita, String tipoMago) {
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

    public String getTipoMago() {
        return tipoMago;
    }

    public void setTipoMago(String tipoMago) {
        this.tipoMago = tipoMago;
    }
}