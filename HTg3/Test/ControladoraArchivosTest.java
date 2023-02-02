import org.junit.jupiter.api.Test;
import pck.ControladoraArchivos;

import static org.junit.jupiter.api.Assertions.*;

class ControladoraArchivosTest {

    @Test
    void crearArchivo() {
        ControladoraArchivos controladoraArchivos = new ControladoraArchivos();
        controladoraArchivos.crearArchivo();

    }

    @Test
    void leerarchivo() {
        ControladoraArchivos controladoraArchivos = new ControladoraArchivos();
        controladoraArchivos.leerarchivo();


    }

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