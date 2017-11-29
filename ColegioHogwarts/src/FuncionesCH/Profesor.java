package FuncionesCH;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Profesor extends Persona{
    
    private String fechaIngreso;

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }


    public void crearProfesor() throws IOException{
        FileWriter archivo = new FileWriter("..\\ColegioHogwarts\\profesores.txt");
        while (true){
            Scanner sc = new Scanner(System.in);
            Persona profe = new Persona ();
            Animago animago = new Animago();
            Metamorfomago metam = new Metamorfomago();
            MagoNormal magon = new MagoNormal();

            System.out.print("\nIngrese Nombre: ");
            profe.setNombre(sc.next());
            System.out.print("Ingrese Apellidos: ");
            profe.setApellido(sc.next());
            System.out.print("Ingrese Edad: ");
            profe.setEdad(sc.nextInt());
            System.out.print("Varita: ");
            profe.setVarita(sc.next());
            System.out.print("Fecha de Ingreso: ");
            fechaIngreso= sc.next();

            showListaTipoMago();
            System.out.print(">>Elija el tipo de mago/bruja que es: ");
            int numTipo = sc.nextInt();

            switch (numTipo) {
                case 1:
                    System.out.println(">>En qué animal puede convertirse?: ");
                    animago.setAnimal(sc.nextLine());
                    System.out.print(">>Qué hechizo utiliza? ");
                    String hechizo = sc.nextLine();
                    animago.setHechizo(hechizo);
                    break;

                case 2:
                    System.out.print("Con qué poción se controla?: ");
                    String pocion = sc.nextLine();
                    metam.setPocion(pocion);
                    break;

                case 3:
                    System.out.print("Cuál es su deporte favorito?: ");
                    String deporte = sc.nextLine();
                    magon.setDeporte(deporte);
                    break;

                default:
                    System.out.println(">>Opción inválida, ingrese de nuevo: ");
                    break;
            }

            System.out.print("Desea guardar los datos? S/N: ");
            String resp = sc.next();

            if (resp.equalsIgnoreCase("s")){

                String contenido = profe.getNombre()+","+profe.getApellido()+","
                        +profe.getEdad()+","+profe.getVarita()+","+fechaIngreso+","
                        +profe.getTipoMago()+","+animago.getAnimal()+","+
                        animago.getHechizo()+","+metam.getPocion()+","+magon.getDeporte();

                
                BufferedWriter escribir = new BufferedWriter (archivo);
                escribir.write(contenido);
                escribir.close();

                System.out.println("Sus datos han sido guardados correctamente");
                break;
            }
        }
    }

    public static void showListaTipoMago(){
        System.out.println("\n Tipo de Magos/Brujas\n"
                + "1.Animago\n"
                + "2.Metamorfomago\n"
                + "3.Normal");
    }
}