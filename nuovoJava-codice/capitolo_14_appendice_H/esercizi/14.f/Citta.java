package com.claudiodesio.dati;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Citta other = (Citta) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
}