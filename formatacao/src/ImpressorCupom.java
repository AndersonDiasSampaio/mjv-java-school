public class ImpressorCupom {
    public void imprimir(Cupom cupom){
        /**
         vamos somente impimir o resultado no console
         mas este mesmo conteúdo poderá proporicionar várias saidas
         logo a variável conteudo deveria ser retornada para outros "processadores"
         como gerador de arquivo txt, pdf ou até mesmo envio por e-mail
         */

        /*
        CONSIDERE O COMPRIMENTO MÁXIMO DE 50 CARACTERES EM CADA LINHA
        E APLIQUE O RESPECTIVO ALINHAMENTO
         */
        StringBuilder conteudo = new StringBuilder();
        conteudo.append(tracos());
        conteudo.append(cupom.nomeFantasia + "\n"); //preencher com espaços até ter 50 caracteres de comprimento
        Endereco end = cupom.endereco;
        conteudo.append(end.logradouro + String.format(" N. %s %s %s %s-%s \n",end.numero, end.complemento, end.bairro, end.cidade, end.uf)); //como formatar vários campos
        conteudo.append(String.format("CPF/CNPJ: %11s %tD \n",cupom.cpf, cupom.data ));//calcular os respectivos comprimentos e aplicar alinhamento
        conteudo.append(String.format("IE: %s%02d:%02d:%02d \n",cupom.ie,cupom.hora.getHour(), cupom.hora.getMinute(), cupom.hora.getSecond()));//calcular os respectivos comprimentos e aplicar alinhamento
        conteudo.append(String.format("IM: %s  CCF:%s \n" , cupom.im ,cupom.ccf) );//calcular os respectivos comprimentos e aplicar alinhamento
        conteudo.append(String.format("CDD: %d \n", cupom.cdd));//aplicar alinhamento à direita
        conteudo.append(tracos());
        conteudo.append("CUPOM FISCAL\n");
        //modelo para ser replicado
        conteudo.append(String.format("ITEM COD. %-30s%10s\n","DESCRIÇÃO","VALOR"));
        for(CupomItem item:cupom.itens){
            conteudo.append("DESCRICAO DE ACORDO COM CADA ITEM EXISTENTE\n");
        }
        conteudo.append(tracos());
        System.out.println(conteudo.toString());
        //em caso de resolver explorar algumas formas de apresentação
        //return conteudo.toString();
    }
    private String tracos(){
        String repeated = new String(new char[50]).replace("\0", "-");
        return repeated + "\n";
    }
    private String cpfCnpj(String cpfCnpj){
        String newCnpj = "";
        if(cpfCnpj.length()==11)
            newCnpj = cpfCnpj.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        else
            newCnpj = cpfCnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
        return newCnpj;
    }
}
