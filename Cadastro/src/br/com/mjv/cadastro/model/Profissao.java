package br.com.mjv.cadastro.model;

public class Profissao {
    Integer id;
    String nome;
    CadastroExperiencia cadastroExperiencia;

    public Profissao(Integer id, String nome, CadastroExperiencia cadastroExperiencia) {
        this.id = id;
        this.nome = nome;
        this.cadastroExperiencia = cadastroExperiencia;
    }

    public CadastroExperiencia getCadastroExperiencia() {
        return cadastroExperiencia;
    }

    public void setCadastroExperiencia(CadastroExperiencia cadastroExperiencia) {
        this.cadastroExperiencia = cadastroExperiencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
