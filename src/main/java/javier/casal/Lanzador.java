package javier.casal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lanzador {

    public static void main(String[] args) {}
    public static String factor(int num) {

        System.out.println("[LOG] Has entrado en la funcion factor()");
        System.out.println("[LOG] numero entregado: " + num);

        String sol = "";

        try {

            ProcessBuilder factorizar = new ProcessBuilder("factor", String.valueOf(num));

            Process proceso = factorizar.start();

            BufferedReader lector = new BufferedReader(
                    new InputStreamReader(proceso.getInputStream())
            );

            sol = lector.readLine();

            proceso.waitFor();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

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

