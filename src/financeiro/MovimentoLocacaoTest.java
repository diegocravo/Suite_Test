package financeiro;

import Locacao.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovimentoLocacaoTest {

    MovimentoLocacao movimentoLocacao = new MovimentoLocacao();
    Locacao locacao = new Locacao();

    @Test
    public void calcularIss() {
        movimentoLocacao.calcularIss();
        assertEquals((4.00f * 0.05), movimentoLocacao.getValorIss(), 0.0001);
    }
}