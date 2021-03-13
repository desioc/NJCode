package com.claudiodesio.lambda.dati;

public class Citta {

    private String nome;

    private boolean capoluogo;

    private boolean diMare;

    public Citta(String nome, boolean capoluogo, boolean diMare) {
        this.nome = nome;
        this.capoluogo = capoluogo;
        this.diMare = diMare;
    }

    public boolean isDiMare() {
        return diMare;
    }

    public void setDiMare(boolean diMare) {
        this.diMare = diMare;
    }

    public boolean isCapoluogo() {
        return capoluogo;
    }

    public void setCapoluogo(boolean capoluogo) {
        this.capoluogo = capoluogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return getNome();
    }
}