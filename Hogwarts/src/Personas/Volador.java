package Personas;


/**
 *La interfaz Volador tiene dos métodos que es despegar y volar
 */
public interface Volador {
    
    /**
    *Este método  es implementado por otras clases para ver si despega
    */
    public void despegar();
    
    /**
     * Este método es implentado por otras clases para saber como vuela
     */
    public void volar();
}