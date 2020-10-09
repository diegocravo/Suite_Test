package Locacao;

public class Bicicleta {

    private int id = 1000;
    private String descricao = "Bicicleta de corrida";
    private char tipo = 'B';
    private float valorLocacao = 2.00f;
    private boolean disponível;

    public void disponivel(){
        this.disponível = true;
    }

    public void indisponível(){
        this.disponível = false;
    }

    public boolean isDisponível() {
        return disponível;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }
}
