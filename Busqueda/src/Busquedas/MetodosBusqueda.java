package Busquedas;

/**
 *
 * @author Nalo
 */
import java.util.Random;
import java.util.Scanner;

public class MetodosBusqueda {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);

        int n;

        System.out.println("Ingresa el tamaño del arreglo");
        n = sca.nextInt();

        int[] arreglo = random(n);

        System.out.println("El arreglo es:");
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }

        System.out.println("\n\nSelecciona la operación:");
        System.out.println("1. Búsqueda Secuencial");
        System.out.println("2. Búsqueda Binaria");

        int opcion = sca.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingresa el elemento a buscar:");
                int elementoBusqueda = sca.nextInt();

                int indiceSecuencial = BusquedaSecuencial.busquedaSecuencial(arreglo, elementoBusqueda);

                if (indiceSecuencial == -1) {
                    System.out.println("El elemento no se encuentra en el arreglo.");
                } else {
                    System.out.println("El elemento se encuentra en el índice: " + indiceSecuencial);
                }

                break;

            case 2:
                System.out.println("Ingresa el elemento a buscar:");
                int elementoBinaria = sca.nextInt();

                int indiceBinaria = BusquedaBinaria.busquedaBinaria(arreglo, elementoBinaria);

                if (indiceBinaria == -1) {
                    System.out.println("El elemento no se encuentra en el arreglo.");
                } else {
                    System.out.println("El elemento se encuentra en el índice: " + indiceBinaria);
                }

                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static int[] random(int n) {
        int[] arreglo = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arreglo[i] = rand.nextInt(100);
        }
        return arreglo;
    }
}
