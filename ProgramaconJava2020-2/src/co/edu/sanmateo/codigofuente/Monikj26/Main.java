
package co.edu.sanmateo.codigofuente.Monikj26;

import co.edu.sanmateo.codigofuente.Monikj26.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.Monikj26.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
                Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Universidad universidad = new Universidad();

        while (true) {
            System.out.println("Bienvenido a la universidad San Mateo");
            System.out.println("-------- Menu ------------");
            System.out.println("1. Registrar Estudiante");
            System.out.println("0. Salir");
            int opcion = entrada.nextInt();
            if (opcion == 0) {
                System.out.println("Saliendo....");
                System.exit(0);
            } else if (opcion == 1) {
                Estudiante estudiante = universidad.crearEstudiante();
                listaEstudiante.add(estudiante);
                System.out.println("El estudiante: " + estudiante.nombreCompleto + " ha sido ingresado a la universidad");
            }
        }
    }
    
}
