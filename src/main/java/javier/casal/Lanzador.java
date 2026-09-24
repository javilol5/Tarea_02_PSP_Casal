package javier.casal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lanzador {

    public static void main(String[] args) {}
    public static String factor(int num) {

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

            // Muestra por consola un mensaje de error
            System.out.println("Error: " + excepcion.getMessage());

        }

        return sol;
    }



        public static void nivel2 () {

            System.out.println("Nivel2");
        }

        public static void nivel3 () {

            System.out.println("Nivel3");
        }
        public static void nivel4 () {

            System.out.println("Nivel4");
    }
}

