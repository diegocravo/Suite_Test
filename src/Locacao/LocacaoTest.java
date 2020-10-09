package Locacao;

import org.junit.Test;
import static org.junit.Assert.*;

public class LocacaoTest {

    Locacao locacao = new Locacao();

    @Test
    public void registraLocacao(){
        locacao.registraLocacao(10);
        assertEquals(10, locacao.getHoraInicio());
    }

    @Test
    public void registraDevolucao(){
        locacao.registraDevolucao(12);
        assertEquals(12, locacao.getHoraFinal());
    }
}