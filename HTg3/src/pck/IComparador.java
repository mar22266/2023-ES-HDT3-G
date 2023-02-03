package pck;

/**
 * Author: Andre marroqui, Gabriel Paz, Andy Fuentes
 * ht3 - 2023
 */
public interface IComparador<T> {
    /**
     * interfaz para comparar dos objetos
     * @param object1
     * @param object2
     * @return
     */
    public int Compare(T object1, T object2);
}
