package br.com.mjv.cadastro.model;

public class Cidade {
    int id;
    String nome;
    String estado;
    String singla;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSingla() {
        return singla;
    }

    public void setSingla(String singla) {
        this.singla = singla;
    }

    public Cidade(int id, String nome, String estado, String singla) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
        this.singla = singla;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", estado='" + estado + '\'' +
                ", singla='" + singla + '\'' +
                '}';
    }
}
