package br.com.mjv.cadastro.model;

public class Celular {
    Long numero;
    boolean whatsapp;

    boolean profissional;
    boolean pessoal;

    public Celular(Long numero, boolean whatsapp, boolean profissional, boolean pessoal) {
        this.numero = numero;
        this.whatsapp = false;
        this.profissional = false;
        this.pessoal = false;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public boolean isWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(boolean whatsapp) {
        this.whatsapp = whatsapp;
    }

    public boolean isProfissional() {
        return profissional;
    }

    public void setProfissional(boolean profissional) {
        this.profissional = profissional;
    }

    public boolean isPessoal() {
        return pessoal;
    }

    public void setPessoal(boolean pessoal) {
        this.pessoal = pessoal;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "numero=" + numero +
                ", whatsapp=" + whatsapp +
                ", profissional=" + profissional +
                ", pessoal=" + pessoal +
                '}';
    }
}
