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

    public int registraLocacao(int horaInicio){
        Bicicleta bicicleta = new Bicicleta();
        this.data = LocalDate.now();
        this.horaInicio = horaInicio;
        return  this.horaInicio;
    }

    public int registraDevolucao(int horaFinal){
        this.horaFinal = horaFinal;
        return this.horaFinal;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFinal() {
        return horaFinal;
    }
}
