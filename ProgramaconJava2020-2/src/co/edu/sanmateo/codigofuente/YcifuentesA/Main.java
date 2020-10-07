/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sanmateo.codigofuente.YcifuentesA;

import co.edu.sanmateo.codigofuente.YcifuentesA.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.YcifuentesA.operaciones.Universidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author yonie
 */
public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>();
        Universidad universidad = new Universidad();

        while (true) {
            System.out.println("Bienvenido a la universidad San Mateo");
            System.out.println("---------- Menu ----------");
            System.out.println("1. Registrar estudiante");
            System.out.println("0. Salir");
            int opcion = entrada.nextInt();
            if (opcion == 0) {
                System.exit(0);
            } else if (opcion == 1) {
                Estudiante estu = universidad.crearEstudiante();
                listaEstudiante.add(estu);
                System.out.println("El estudiante ingresado es: " + estu.nombrecompleto + " ha sido ingresado en el sistema ");
            }
        }

    }
}
