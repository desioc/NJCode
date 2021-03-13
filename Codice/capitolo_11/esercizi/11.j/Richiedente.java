package com.claudiodesio.sportello.dati;

public class Richiedente extends Thread {

    private final String nome;

    public Richiedente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void run() {
        Sportello.getInstance().gestisciRichiesta(this);
    }

    @Override
    public String toString() {
        return nome;
    }
}