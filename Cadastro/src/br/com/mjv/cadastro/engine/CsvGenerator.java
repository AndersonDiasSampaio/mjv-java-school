package br.com.mjv.cadastro.engine;

import br.com.mjv.cadastro.model.Cadastro;
import br.com.mjv.cadastro.model.Celular;
import br.com.mjv.cadastro.model.Profissao;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class CsvGenerator {
    public static void escreverLayoutDelimitado(List<Cadastro> cadastros) {

        try {
            StringBuilder conteudo = new StringBuilder();

            conteudo.append("CPF;");
            conteudo.append("Nome;");
            conteudo.append("Sexo;");
            conteudo.append("Data de Nascimento;");
            conteudo.append("Logradouro;");
            conteudo.append("Numero;");
            conteudo.append("Complemento;");
            conteudo.append("Bairro;");
            conteudo.append("Cidade;");
            conteudo.append("Estado;");
            conteudo.append("Email;");
            conteudo.append("Telefone;");
            conteudo.append("Celulares;");
            conteudo.append("Profissões;");
            conteudo.append("Habilidades;");
            conteudo.append("PretenÇão salarial Maxima;");
            conteudo.append("Pretenção salarial Minima;");
            conteudo.append("\n");


            for (Cadastro cadastro : cadastros) {
                conteudo.append(cadastro.getCpf() + ";");
                conteudo.append(cadastro.getNome() + ";");
                conteudo.append(cadastro.getSexo() + ";");
                conteudo.append(cadastro.getDataNascimento() + ";");
                conteudo.append(cadastro.getEndereco().getLogradouro() + ";");
                conteudo.append(cadastro.getEndereco().getNumero() + ";");
                conteudo.append(cadastro.getEndereco().getComplemento() + ";");
                conteudo.append(cadastro.getEndereco().getBairro() + ";");
                conteudo.append(cadastro.getEndereco().getCidade().getNome() + ";");
                conteudo.append(cadastro.getEndereco().getCidade().getEstado() + ";");
                conteudo.append(cadastro.getEmail() + ";");
                conteudo.append(cadastro.getTelefone() + ";");
                for (Celular celular : cadastro.getCelulars()) {

                    conteudo.append("Numero Celular: " + celular.getNumero() + ",    ");
                    conteudo.append("Profissional: " + celular.isProfissional() + ",   ");
                    conteudo.append("Pessoal: " + celular.isPessoal() + ",   ");
                    conteudo.append("WhatsApp: " + celular.isWhatsapp() + "|  ");
                }
                conteudo.append(";");
                for (Profissao profissao : cadastro.getProfissaoLis()) {
                    conteudo.append("Profissão:" + profissao.getNome() + ", ");
                    conteudo.append("Empresa: " + profissao.getCadastroExperiencia().getEmpresa().getNome() + ", ");
                    conteudo.append("Salario: " + profissao.getCadastroExperiencia().getSalario() + ", ");
                    conteudo.append("Emprego Atual:" + profissao.getCadastroExperiencia().isEmpregoAtual() + "|");

                }
                conteudo.append(";");
                conteudo.append(cadastro.getHabilidades() + ";");
                conteudo.append(cadastro.getPretencaoSalarial().getValorMaximo() + ";");
                conteudo.append(cadastro.getPretencaoSalarial().getValorMinimo() + ";");


            }

            Path arquivoDestino = Paths.get("D:\\cadastros.csv");

            Files.write(arquivoDestino, conteudo.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
