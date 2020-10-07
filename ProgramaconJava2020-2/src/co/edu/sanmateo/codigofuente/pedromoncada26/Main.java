package co.edu.sanmateo.codigofuente.pedromoncada26;

import co.edu.sanmateo.codigofuente.pedromoncada26.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.pedromoncada26.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Universidad universidad = new Universidad();

        while(true){
            
        System.out.println("BIENVENIDO A LA UNIVERSIDAD SAN MATEO");
        System.out.println("----------Menu---------");
        System.out.println("1. Registrar Estudinate");
        System.out.println("0. Salir");

        int opcion = entrada.nextInt();

        if (opcion == 0) {

            System.out.println("Saliendo");
            System.exit(0);

        } else if (opcion == 1) {

            Estudiante estu = universidad.crearEstudiante();
            listaEstudiante.add(estu);
            System.out.println("El Estudiante: " + estu.nombreCompleto + " ha sido ingresado a la universidad");

        }
            
        }
        

    }

}
