package Locacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Locacao {

    private int idLocacao = 100;
    private LocalDate data;
    private int horaInicio;
    private int horaFinal;
    private float valorLocacao;

    public void registraLocacao(int horaInicio){
        Bicicleta bicicleta = new Bicicleta();
        this.data = LocalDate.now();
        this.horaInicio = horaInicio;
    }

    public void registraDevolucao(int horaFinal){
        this.horaFinal = horaFinal;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFinal() {
        return horaFinal;
    }
}
