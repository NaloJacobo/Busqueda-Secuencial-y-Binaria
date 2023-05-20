package Busquedas;

/**
 *
 * @author Nalo
 */
public class BusquedaSecuencial {

    public static int busquedaSecuencial(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
}
