import org.junit.jupiter.api.Test;
import pck.EnterosComparador;
import pck.Sorts;

import static org.junit.jupiter.api.Assertions.*;

class SortsTest {

    /**
     * @param metodo para ordenar los datos
     */
    @Test
    void bubbleSort() {
        Sorts sorts = new Sorts(new EnterosComparador());

        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        sorts.BubbleSort(array);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);

    }
    /**
     * @param metodo para ordenar los datos
     */
    @Test
    void gnomeSort() {
        Sorts sorts = new Sorts(new EnterosComparador());

        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        sorts.gnomeSort(array);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);

    }
/**
     * @param metodo para ordenar los datos
     */
    @Test
    void quickSort() {
        Sorts sorts = new Sorts(new EnterosComparador());

        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        sorts.quickSort(array,0,array.length-1);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);
    }
/**
     * @param metodo para ordenar los datos
     */
    @Test
    void mergeSort() {
        Sorts sorts = new Sorts(new EnterosComparador());

        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        sorts.mergeSort(array,0,array.length-1);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);

    }
/**
     * @param metodo para ordenar los datos
     */
    @Test
    void radixSort() {
        Sorts sorts = new Sorts(new EnterosComparador());

        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        sorts.radixSort(array);

        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);
    }
}