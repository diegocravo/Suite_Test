package Test;

import Locacao.Bicicleta;
import Locacao.BicicletaTest;
import Locacao.LocacaoTest;
import financeiro.MovimentoLocacaoTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        BicicletaTest.class,
        LocacaoTest.class,
        MovimentoLocacaoTest.class
})

public class TestSuit {

}
