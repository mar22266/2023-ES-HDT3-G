import org.junit.jupiter.api.Test;
import pck.ControladoraArchivos;

import static org.junit.jupiter.api.Assertions.*;

class ControladoraArchivosTest {

    /**
     * @param metodo para crear un archivo
     */
    @Test
    void crearArchivo() {
        ControladoraArchivos controladoraArchivos = new ControladoraArchivos();
        controladoraArchivos.crearArchivo();

    }

    /**
     * @param metodo para leer un archivo
     */
    @Test
    void leerarchivo() {
        ControladoraArchivos controladoraArchivos = new ControladoraArchivos();
        controladoraArchivos.leerarchivo();


    }
    /**
     * @param metodo para actualizar un archivo
     */
    @Test
    void ACtualizarArchivo() {
        ControladoraArchivos controladoraArchivos = new ControladoraArchivos();
        Integer[] numeros = {1,2,3};
        controladoraArchivos.ACtualizarArchivo(numeros);
        Integer[] resultado = controladoraArchivos.leerarchivo();

        assertEquals(1, resultado[0]);
        assertEquals(2, resultado[1]);
        assertEquals(3, resultado[2]);
    }
}