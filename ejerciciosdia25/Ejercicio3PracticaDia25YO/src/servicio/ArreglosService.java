/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */
package servicio;

import java.util.Arrays;

/**
 *
 * @author Esteban
 */
public class ArreglosService {

    public void inicializarA(double[] arreglo1) {
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = (double) (Math.random() * 10);
            arreglo1[i]=(Math.round((arreglo1[i])*100.0d)/100.0d);
        }
    }

    public void mostrar(double[] arreglo1) {
        System.out.println(Arrays.toString(arreglo1));
    }

    public void ordenar(double[] arreglo1) {
        double aux[] = new double[arreglo1.length]; int i = arreglo1.length-1, cont = 0;
        Arrays.sort(arreglo1);
        do {
            aux[cont] = arreglo1[i];
            cont++;
            i--;
        } while (i != -1);
        arreglo1=aux;
        mostrar(arreglo1);
    }
    public void inicializarB(double[] arreglo1, double[] arreglo2) {
        System.arraycopy(arreglo1, 0, arreglo2, 0, 10);
        Arrays.fill(arreglo2, 10, 20, (0.5));
    }
}
