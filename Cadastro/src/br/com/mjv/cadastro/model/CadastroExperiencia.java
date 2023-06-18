package br.com.mjv.cadastro.model;

import java.util.Date;

public class CadastroExperiencia {
    Integer id;
    Double salario;
    boolean empregoAtual;
    Date dataContratacao;
    Date datDesligamento;
    RegimeDeContratacaoENUM regimeDeContratacaoENUM;
    Empresa empresa;

    public CadastroExperiencia(Integer id, Double salario, boolean empregoAtual,
                               Date dataContratacao, Date datDesligamento,
                               RegimeDeContratacaoENUM regimeDeContratacaoENUM, Empresa empresa) {
        this.id = id;
        this.salario = salario;
        this.empregoAtual = empregoAtual;
        this.dataContratacao = dataContratacao;
        this.datDesligamento = datDesligamento;
        this.regimeDeContratacaoENUM = regimeDeContratacaoENUM;
        this.empresa = empresa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public boolean isEmpregoAtual() {
        return empregoAtual;
    }

    public void setEmpregoAtual(boolean empregoAtual) {
        this.empregoAtual = empregoAtual;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Date getDatDesligamento() {
        return datDesligamento;
    }

    public void setDatDesligamento(Date datDesligamento) {
        this.datDesligamento = datDesligamento;
    }

    public RegimeDeContratacaoENUM getRegimeDeContratacaoENUM() {
        return regimeDeContratacaoENUM;
    }

    public void setRegimeDeContratacaoENUM(RegimeDeContratacaoENUM regimeDeContratacaoENUM) {
        this.regimeDeContratacaoENUM = regimeDeContratacaoENUM;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "CadastroExperiencia{" +
                "id=" + id +
                ", salario=" + salario +
                ", empregoAtual=" + empregoAtual +
                ", dataContratacao=" + dataContratacao +
                ", datDesligamento=" + datDesligamento +
                ", regimeDeContratacaoENUM=" + regimeDeContratacaoENUM +
                ", empresa=" + empresa +
                '}';
    }
}
