/*
                    FUNDACIÓN UNIVERSITARIA SAN MATEO
                     FACULTAD DE INGENIERÍA Y AFINES
                         INGENIERÍA DE SISTEMAS
                              GRUPO O1N30
                              BOGOTÁ D,C.
                                  2020
       
 */
package co.edu.sanmateo.codigofuente.YersonRomero;

import co.edu.sanmateo.codigofuente.YersonRomero.modelo.Estudiante;
import co.edu.sanmateo.codigofuente.YersonRomero.operaciones.Universidad;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public Main() {
        //Aqui se construye la clase de una instancia
    }

    public void ejecutarMenu() throws IOException {

        Scanner entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiante = new ArrayList<>(); //Creación de la lista dinámica

        File fileLectura = new File("A:\\Software\\SanMateo\\FundamentosProgramacionJava\\estudiantes.txt"); //Creación de la clase File
        Scanner leerArchivo = new Scanner(fileLectura); //Lectura del archivo
        while (leerArchivo.hasNextLine()) {
            String linea = leerArchivo.nextLine();
            System.out.println("LINEA:" + linea);

            String arreglo[] = linea.split(",");
            Estudiante estudiante = new Estudiante(arreglo[1], arreglo[0]);
            listaEstudiante.add(estudiante);
        }

        Universidad universidad = new Universidad();

        while (true) {
            System.out.println("|--------------------------------------------------|");
            System.out.println("|Bienvenidos a la Fundación Universitaria San Mateo|");
            System.out.println("|---------------------- Menú ----------------------|");
            System.out.println("|1. Registrar Estudiante                           |");
            System.out.println("|2. Listar Estudiantes                             |");
            System.out.println("|3. Buscar Estudiante en la Lista                  |");
            System.out.println("|4. Guardar la información de los Estudiantes      |");
            System.out.println("|5. Eliminar un Estudiante                         |");
            System.out.println("|0. Salir                                          |");
            System.out.println("|--------------------------------------------------|");

            int opcion = entrada.nextInt();

            if (opcion == 0) {
                System.out.println("Saliendo...");
                System.exit(0);
            } else if (opcion == 1) {
                Estudiante estu = universidad.crearEstudiante();
                listaEstudiante.add(estu); //El .add es para adicionar un estudiante a la lista.
                System.out.println("El estudiante "+estu.nombreCompleto+" ha sido ingresado a la iniversidad");
            } else if (opcion == 2) {
                //Un ciclo for realiza tres operaciones fundamentales de la siguiente manera:
                //1. Inicialización.
                //2. Pregunta.
                //3. Incrementa o Disminuye.
                System.out.println("ESTUDIANTES A MOSTRAR: "+listaEstudiante.size()); //El .size es para conocer el tamaño de la lista.
                System.out.println("DOCUMENTO      NOMBRE COMPLETO");
                System.out.println("|--------------------------------------------------|");
                for (int indice = 0; indice < listaEstudiante.size(); indice++) {
                    Estudiante estudiante = listaEstudiante.get(indice); //El .get es para mostrar la información de un estudiante.
                    System.out.println(estudiante.cedula + "      "+estudiante.nombreCompleto);
                }
            } else if (opcion == 3) {

                Estudiante estudianteBuscado = universidad.buscarEstudiante(entrada, listaEstudiante);
                if (estudianteBuscado != null) {
                    System.out.println("Estudiante encontrado: "+estudianteBuscado.nombreCompleto);
                } else {
                    System.out.println("Lo siento, el estudiante no fue encontrado");
                }
                
            } else if (opcion == 4) {
                FileWriter fileWriter = new FileWriter("A:\\Software\\SanMateo\\FundamentosProgramacionJava\\estudiantes.txt", false);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                for (int indice = 0; indice < listaEstudiante.size(); indice++) {
                    Estudiante estudiante = listaEstudiante.get(indice);
                    bufferedWriter.write(estudiante.cedula+","+estudiante.nombreCompleto);
                    bufferedWriter.write("\n");
                }
                bufferedWriter.close();
                System.out.println("Se ha guardado correctamente la lista de los estudiantes");

            } else if (opcion == 5) {
                
                Estudiante estudianteBuscado = universidad.buscarEstudiante(entrada, listaEstudiante);
                if (estudianteBuscado != null) {
                    listaEstudiante.remove(estudianteBuscado);
                    System.out.println("Se ha eliminado correctamente el estudiante "+estudianteBuscado.nombreCompleto);
                } else {
                    System.out.println("Lo siento, no puedo eliminar un estudiante que no existe");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Main m = new Main();
        m.ejecutarMenu();

    }
}
