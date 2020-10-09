package Locacao;

public class Bicicleta {

    private int id = 1000;
    private String descricao = "Bicicleta de corrida";
    private char tipo = 'B';
    private float valorLocacao = 2.00f;
    private boolean disponível;

    public boolean disponivel(){
        this.disponível = true;
        return this.disponível;
    }

    public boolean indisponível(){
        this.disponível = false;
        return this.disponível;
    }

    public boolean isDisponível() {
        return disponível;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }
}
