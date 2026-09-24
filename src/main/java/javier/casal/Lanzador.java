package javier.casal;

import java.io.*;

public class Lanzador {

    public static void main(String[] args) {}
    public static String factor(int num, int nivel) {

        System.out.println("[LOG] Has entrado en la funcion factor()");
        System.out.println("[LOG] numero entregado: " + num);

        // Se declara la variable sol como una cadena vacia
        String sol = "";

        // Comienza un bloque try para ejecutar codigo que podria producir una excepcion
        try {

            // Se crea un ProcessBuilder para ejecutar el comando "factor" pasandole el número como argumento
            ProcessBuilder factorizar = new ProcessBuilder("factor", String.valueOf(num));

            // Inicia el proceso factor y guarda el resultado
            Process proceso = factorizar.start();

            // Crea un BufferedReader para poder leer el texto que devuelve el proceso factor
            BufferedReader lector = new BufferedReader(
                    // Convierte los bytes de salida de factor en un flujo de caracteres legibles
                    new InputStreamReader(proceso.getInputStream())
            );

            // Guarda la primera linea de salida en la variable sol.
            sol = lector.readLine();

            // Espera a que el proceso anterior termine para poder continuar continuar
            proceso.waitFor();

        // Captura cualquier excepción que se produzca dentro del bloque try
        } catch (Exception excepcion) {

            // Muestra por consola un mensaje de error dependiendo de si es nivel 1 o 2
            if  (nivel == 1) {
                System.out.println(excepcion.getMessage());
                System.out.println("[LOG] nivel 1");
            }
            else if (nivel == 2 && nivel == 3) {
                System.out.println("[Error] " + excepcion.getMessage());
                System.out.println("[LOG] nivel 2 o 3");
            }
            else if (nivel == 3) {
                String err = "[Error] " + excepcion.getMessage();
                guardarError(err);

            }
        }

        return sol;
    }



        public static void guardarError(String mensaje) {
            try (PrintWriter log = new PrintWriter( new FileWriter("factor_error.log", true))) {
                log.println(mensaje);
            }

            catch (IOException error) {
                System.out.println("No se pudo escribir en el archivo de log.");
            }

        }

    public static void guardarOutput(String mensaje) {
        try (PrintWriter log = new PrintWriter( new FileWriter("factor_output.log", true))) {
            log.println(mensaje);
        }

        catch (IOException error) {
            System.out.println("No se pudo escribir en el archivo de log.");
        }

    }

        public static void nivel4 () {

            System.out.println("Nivel4");
    }
}

