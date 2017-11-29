
package FuncionesCH;

import java.util.Scanner;

public class Curso {
    private Materia materia;
    private Profesor profesor;
    private int capacidad;
    private Dia dia;
    private String horario;
    private static int registrados = 0;
    
    public Curso(){
        materia = null;
        profesor = null;
        capacidad = 0;
        dia = null;
        horario = null;
        
    }

    public Curso(Materia materia, Profesor profesor, int capacidad, Dia dia, String horario) {
        this.materia = materia;
        this.profesor = profesor;
        this.capacidad = capacidad;
        this.dia = dia;
        this.horario = horario;
    }
    
    public void CrearCurso(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            showMaterias();
            System.out.println(">>Elija una materia del listado de materias: ");
            int num = sc.nextInt();
            sc.nextLine();
            Materia M = null;
            while (true) {
                if (existeCurso(num, AH) == false) {
                    switch (num) {
                        case (1):
                            M = Materia.POCIONES;
                            break;
                        case (2):
                            M = Materia.DEFENSA_CONTRA_LAS_ARTES_OSCURAS;
                            break;
                        case (3):
                            M = Materia.ADIVINACION;
                            break;
                        case (4):
                            M = Materia.ASTRONOMIA;
                            break;
                        case (5):
                            M = Materia.HISTORIA_DE_LA_MAGIA;
                            break;
                        case (6):
                            M = Materia.HERBOLOGIA;
                            break;
                        case (7):
                            M = Materia.ENCANTAMIENTO;
                            break;
                        case (8):
                            M = Materia.VUELO;
                            break;
                        default:
                            System.out.println("Opción inválida, ingrese de nuevo: ");
                            break;
                    }
                } else {
                    System.out.println("¡El curso ya existe, ingrese otro!");
                }
                break;
            }
        }
    }
    
    public static void showMaterias(){
        System.out.println("\n/** MATERIAS **/\n"
                + "1. Pociones\n"
                + "2. Defensa contra las artes oscuras\n"
                + "3. Adivinación\n"
                + "4. Astronomía\n"
                + "5. Historia de la magia\n"
                + "6. Herbología\n"
                + "7. Vuelo");
    }
    
    
    
    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public static int getRegistrados() {
        return registrados;
    }

    public static void setRegistrados(int registrados) {
        Curso.registrados = registrados;
    }
    
}
