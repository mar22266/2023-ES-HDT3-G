package pck;

/**
 * Author: Andre marroqui, Gabriel Paz, Andy Fuentes
 * ht3 - 2023
 */
public class EnterosComparador<T> implements IComparador<T> {
    @Override
    public int Compare(T object1, T object2) {
        int a = (int) object1;
        int b = (int) object2;
        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }
}
