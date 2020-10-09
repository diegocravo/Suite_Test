package financeiro;

import Locacao.*;

import java.time.LocalDate;

public class MovimentoLocacao {

    private int id;
    private LocalDate dataMovimentacao;
    Locacao locacao = new Locacao();
    private float valor;
    private float valorIss;

    Bicicleta bicicleta = new Bicicleta();

    public float calcularIss(){
        locacao.registraLocacao(10);
        locacao.registraDevolucao(12);
        this.valor = (bicicleta.getValorLocacao() * (locacao.getHoraFinal() - locacao.getHoraInicio()));
        this.valorIss = valor * 0.05f;
        return this.valorIss;
    }

    public float getValorIss() {
        return valorIss;
    }
}
