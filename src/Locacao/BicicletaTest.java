package Locacao;

import org.junit.Test;
import static org.junit.Assert.*;

public class BicicletaTest {

    Bicicleta bicicleta = new Bicicleta();

    @Test
    public void disponivel() {
        bicicleta.disponivel();
        assertTrue(bicicleta.isDisponível());
    }

    @Test
    public void indisponível() {
        bicicleta.indisponível();
        assertFalse(bicicleta.isDisponível());
    }
}