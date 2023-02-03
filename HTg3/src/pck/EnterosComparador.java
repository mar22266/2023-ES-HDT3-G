package pck;

/**
 * Author: Andre marroqui, Gabriel Paz, Andy Fuentes
 * ht3 - 2023
 */
public class EnterosComparador<T> implements IComparador<T> {
    /**
     * @param metodo de comparar datos
     */
    @Override
    public int Compare(T object1, T object2) {
        int numero1 = Integer.parseInt(object1.toString());
        int numero2 = Integer.parseInt(object2.toString());
        if (numero1 > numero2) {
            return 1;
        } else if (numero1 < numero2) {
            return -1;
        } else {
            return 0;
        }
    }
}
