package br.com.mjv.cadastro.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cadastro {
Integer id;
String nome;
String cpf;
String email;
    LocalDate dataNascimento;
Long telefone;
String habilidades;
Sexo sexo;
PretencaoSalarial pretencaoSalarial;
Endereco endereco;
List<Celular> celulars;
List<Profissao> profissaoLis;

    public Cadastro(Integer id, String nome, String cpf, String email,
                    LocalDate dataNascimento, Long telefone, String habilidades, Sexo sexo, PretencaoSalarial pretencaoSalarial, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.habilidades = habilidades;
        this.sexo = sexo;
        this.pretencaoSalarial=pretencaoSalarial;
        this.endereco=endereco;
        this. celulars = new ArrayList<>();
        this.profissaoLis= new ArrayList<>();


    }

    public PretencaoSalarial getPretencaoSalarial() {
        return pretencaoSalarial;
    }

    public void setPretencaoSalarial(PretencaoSalarial pretencaoSalarial) {
        this.pretencaoSalarial = pretencaoSalarial;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public List<Celular> getCelulars() {
        return celulars;
    }

    public void setCelulars(Celular celulars) {
        this.celulars.add(celulars);
    }

    public List<Profissao> getProfissaoLis() {
        return profissaoLis;
    }

    public void setProfissaoLis(Profissao profissaoLis) {
        this.profissaoLis.add(profissaoLis);
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", telefone=" + telefone +
                ", habilidades='" + habilidades + '\'' +
                ", sexo=" + sexo +
                ", pretencaoSalarial=" + pretencaoSalarial +
                ", endereco=" + endereco +
                ", celulars=" + celulars +
                ", profissaoLis=" + profissaoLis +
                '}';
    }
}
