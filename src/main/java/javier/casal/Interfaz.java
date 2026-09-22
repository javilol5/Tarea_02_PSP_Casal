package javier.casal;

import java.util.Scanner;

public class Interfaz {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero = -1;

        while (numero != 0) {

            System.out.print("¿Qué nivel quieres usar? (1, 2, 3 o 4) 0 para salir: ");
            numero = teclado.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("Nivel 1");
                    Lanzador.nivel1();
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