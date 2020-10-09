package Locacao;

import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class BicicletaTest {

    Bicicleta bicicleta = new Bicicleta();

    @Rule
    public ErrorCollector error = new ErrorCollector();

    @Test
    public void disponivel() {
        bicicleta.disponivel();
        error.checkThat(bicicleta.isDisponível(), is(true));
    }

    @Test
    public void indisponível() {
        bicicleta.indisponível();
        error.checkThat(bicicleta.isDisponível(), is(false));
    }
}