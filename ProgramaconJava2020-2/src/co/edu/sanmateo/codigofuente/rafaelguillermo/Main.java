
package co.edu.sanmateo.codigofuente.rafaelguillermo;

import co.edu.sanmateo.codigofuente.rafaelguillermo.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.rafaelguillermo.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rafael Guillermo Blanco Banquez <rafaelg.blancob@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Universidad universidad = new Universidad();
        
        System.out.println("Bienvenido a la universidad San Mateo");
        System.out.println("-------- Menu ------------");
        System.out.println("1. Registrar Estudiante");
        System.out.println("0. Salir");
        int opcion = entrada.nextInt();
        if(opcion == 0){
            System.out.println("Saliendo....");
            System.exit(0);
        }else if(opcion == 1){
            Estudiante estu = universidad.crearEstudiante();
            listaEstudiante.add(estu);
            System.out.println("El estudiante: "+estu.nombreCompleto+" ha sido ingresado a la universidad");
        }
    }
}
