package javier.casal;

import java.util.Scanner;

public class Interfaz {

    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int nivel = -1;

        while (nivel != 0) {

            System.out.print("¿Qué nivel quieres usar? (1, 2, 3 o 4) 0 para salir: ");
            nivel = teclado.nextInt();
            teclado.nextLine();

            if (nivel == 0) {
                System.out.println("Salir");
                break;
            }

            String entrada;
            System.out.print("Introduce un número o escribe 'salir': ");
            entrada = teclado.nextLine();

            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }

            int numeroN1;
            try {
                numeroN1 = Integer.parseInt(entrada);
            }

            catch (NumberFormatException excepcion) {


                if  (nivel == 1) {
                    System.out.println(RED + "'" + entrada + "'" + RESET + " no es un número válido");
                    System.out.println("[LOG] nivel 1");
                    continue;
                }
                else if (nivel == 2) {
                    System.out.println("[Error] " + RED + "'" + entrada + "'" + RESET + " no es un número válido");
                    System.out.println("[LOG] nivel 2");
                    continue;
                }


                System.out.println( RED + "'" + entrada + "'" + RESET + " no es un número válido" );
                continue;
            }



            switch (nivel) {
                case 1:
                    System.out.println("Nivel " + nivel);

                    String resultado = Lanzador.factor(numeroN1, nivel);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    System.out.println("Nivel " + nivel);

                    String resultado2 = Lanzador.factor(numeroN1, nivel);
                    System.out.println("[OK] Resultado: " + resultado2);

                    break;

                case 3:
                    System.out.println("Nivel " + nivel);
                    String resultado3 = Lanzador.factor(numeroN1, nivel);
                    Lanzador.guardarOutput("[OK] Resultado: " + resultado3);
                    break;

                case 4:
                    System.out.println("Nivel " + nivel);
                    Lanzador.nivel4();
                    break;

                case 0:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Nivel no válido");
                    break;
            }
        }
    }
}