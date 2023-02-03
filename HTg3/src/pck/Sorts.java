package pck;

import java.util.Arrays;

public class Sorts<T> {

    /**
     * @param args the command line arguments
     */
    public IComparador comparar;

    /**
     * @param args the command line arguments
     */
    public Sorts(IComparador comparar){
        this.comparar = comparar;
    }

    /**
     * Mteodo de bubble sort para el ordenamieto de los datos
     * @param array
     */

    public void BubbleSort(T[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (comparar.Compare(array[j], array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    /**
     * Metodo de gnome sort para el ordenamiento de los datos
     * @param array
     */
    public void gnomeSort(T[] array){
        int i = 0;
        while (i < array.length) {
            if (i == 0) {
            	i++;
            }
            if(comparar.Compare(array[i], array[i-1]) >= 0) {

            	i++;
            }else {
                T temp;
                temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i--;
            }
        }

    }

    /**
     * Metodo de merge sort para el ordenamiento de los datos
     * @param array
     * @param a
     * @param c
     */
    public void quickSort(T[] array, int inf, int sup) {
        int i = inf - 1;
        int j = sup;
        boolean flag = true;
        T temp;


        if (inf >= sup) {
            return;
        }

        T elem_div = array[sup];


        while (flag) {
            while(comparar.Compare(array[++i], elem_div) < 0); //Move the index i until it finds an element bigger than elem_div
            while((comparar.Compare(array[--j], elem_div) > 0)  && (j > inf)); //Move the index j until it finds element smaller than elem_div

            if (i < j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            } else {
                flag = false;
            }
        }

        temp = array[i];
        array[i] = array[sup];
        array[sup] = temp;
        quickSort(array, inf, i - 1);
        quickSort(array, i + 1, sup);
    }


    /**
     * Metodo pruvado de merge sort para apoyo del ordenamiento de los datos
     * @param array
     * @param a
     * @param b
     * @param c
     */
    private void unir(T[] array, int a, int b, int c){
        int n1 = b - a + 1;
        int n2 = c - b;

        Integer[] B = new Integer[n1];
        Integer[] C = new Integer[n2];

        for (int i = 0; i < n1; ++i)
            B[i] = (Integer) array[a + i];
        for (int j = 0; j < n2; ++j)
            C[j] = (Integer) array[b + 1 + j];

        int i = 0, j = 0;

        int k = a;
        while (i < n1 && j < n2) {
            if (B[i] <= C[j]) {
            	array[k] = (T) B[i];
                i++;
            }
            else {
            	array[k] = (T) C[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
        	array[k] = (T) B[i];
            i++;
            k++;
        }

        while (j < n2) {
        	array[k] = (T) C[j];
            j++;
            k++;
        }


    }

    /**
     * Metodo de merge sort para el ordenamiento de los datos
     * @param array
     * @param a
     * @param c
     */
    public void mergeSort(T[] array, int a, int c){
        if (a < c) {
            int b = (a+c)/2;
            mergeSort(array, a, b);
            mergeSort(array , b+1, c);
            unir(array, a, b, c);
        }
    }

    /**
     * metodo privado radix sort para la ayuda de ordenamiento de los datos
     * @param array
     * @return
     */
    private T ValorAlto(T[] array){
        T superior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (comparar.Compare(superior, array[i]) == -1) {
                superior = array[i];
            }
        }
        return superior;
    }

    /**
     * metodo radix sort privado para la ayuda de ordenamiento de los datos
     * @param array
     * @param x
     */

    private void contarOrdenar(T[] array, int x) {
        Integer[] salida = new Integer[array.length];
        int i;
        int[] contador = new int[10];
        Arrays.fill(contador, 0);

        for (i = 0; i < array.length; i++){
            Integer valor = (Integer) array[i];
            contador[((valor / x ) % 10)]++;
        }
        for (i = 1; i < 10; i++) {
            contador[i] += contador[i - 1];
        }
        for (i = array.length - 1; i >= 0; i--) {
            salida[contador[((Integer) array[i] / x) % 10] - 1] = (Integer) array[i];
            contador[((Integer) array[i] / x) % 10]--;
        }

        for (i = 0; i < array.length; i++)
            array[i] = (T) salida[i];
    }

    /**
     * Metodo radix sort para el ordenamiento de los datos
     * @param array
     */

    public void radixSort(T[] array) {
        Integer d = (Integer) ValorAlto(array);
        for (int x = 1;  d/x > 0; x *= 10)
            contarOrdenar(array, x);
    }





}
