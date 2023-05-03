package br.com.fag.entities;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Horario{

    private Long codigo;
    private String numeroDoPontoDeDorigem;
    private String numeroDoPontoDeDestino;
    private Date dataPartida;
    private Date dataChegada;
    private String ClasseVoo;

    public Horario() {
    }

    public Horario(Long codigo, String numeroDoPontoDeDorigem, String numeroDoPontoDeDestino, Date dataPartida, Date dataChegada, String classeVoo) {
        this.codigo = codigo;
        this.numeroDoPontoDeDorigem = numeroDoPontoDeDorigem;
        this.numeroDoPontoDeDestino = numeroDoPontoDeDestino;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        ClasseVoo = classeVoo;
    }

    public String dataPartidaformatacao() {
        String dataPartidaFormat = new SimpleDateFormat("yyyy-MM-dd").format(this.dataPartida);
        return dataPartidaFormat;
    }

    public String dataChegadaformatacao() {
        String dataChegadaFormat = new SimpleDateFormat("yyyy-MM-dd").format(this.dataChegada);
        return dataChegadaFormat;
    }

    public Long getCodigo() {
        return codigo;
    }

    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getClasseVoo() {
        return ClasseVoo;
    }

    public void setClasseVoo(String classeVoo) {
        ClasseVoo = classeVoo;
    }

    public String getNumeroDoPontoDeDorigem() {
        return numeroDoPontoDeDorigem;
    }

    public void setNumeroDoPontoDeDorigem(String numeroDoPontoDeDorigem) {
        this.numeroDoPontoDeDorigem = numeroDoPontoDeDorigem;
    }

    public String getNumeroDoPontoDeDestino() {
        return numeroDoPontoDeDestino;
    }

    public void setNumeroDoPontoDeDestino(String numeroDoPontoDeDestino) {
        this.numeroDoPontoDeDestino = numeroDoPontoDeDestino;
    }

    @Override
    public String toString(){
        if(dataChegada != null) {
            return "Cidade de Origem: " + numeroDoPontoDeDorigem
                    + "\nCidade de Destino: " + numeroDoPontoDeDestino
                    + "\nDataPartida: " + dataPartidaformatacao()
                    + "\nDataChegada: " + dataChegadaformatacao()
                    + "\nClasseVoo: " + ClasseVoo;
        }else {
            return "Cidade de Origem: " + numeroDoPontoDeDorigem
                    + "\nCidade de Destino: " + numeroDoPontoDeDestino
                    + "\nDataPartida: " + dataPartidaformatacao()
                    + "\nClasseVoo: " + ClasseVoo;
        }
    }
}
