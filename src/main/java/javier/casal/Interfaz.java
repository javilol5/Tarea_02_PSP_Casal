package javier.casal;

import java.util.Scanner;

public class Interfaz {

    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = -1;

        while (numero != 0) {

            System.out.print("¿Qué nivel quieres usar? (1, 2, 3 o 4) 0 para salir: ");
            numero = teclado.nextInt();
            teclado.nextLine();

            switch (numero) {
                case 1:
                    System.out.println("Nivel 1");
                    String entrada;
                    while (true) {

                        System.out.print("Introduce un número o escribe 'salir': ");
                        entrada = teclado.nextLine();

                        if (entrada.equalsIgnoreCase("salir")) {
                            break;
                        }

                        int numeroN1;

                        try {
                            numeroN1 = Integer.parseInt(entrada);
                        } catch (NumberFormatException excepcion) {
                            System.out.println(RED + "\'" + entrada + "\'" + RESET + " no es un numero valido");
                            continue;
                        }

                        String resultado = Lanzador.factor(numeroN1);
                        System.out.println("Resultado: " + resultado);

                    }

                    break;


                case 2:
                    System.out.println("Nivel 2");
                    Lanzador.nivel2();
                    break;

                case 3:
                    System.out.println("Nivel 3");
                    Lanzador.nivel3();
                    break;

                case 4:
                    System.out.println("Nivel 4");
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