import br.com.mjv.cadastro.engine.CsvGenerator;
import br.com.mjv.cadastro.model.*;
import br.com.mjv.cadastro.model.ENUMS.RegimeDeContratacaoENUM;
import br.com.mjv.cadastro.model.ENUMS.SexoENUM;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        SexoENUM sexo = SexoENUM.MASCULINO;
        RegimeDeContratacaoENUM regimeDeContratacao = RegimeDeContratacaoENUM.CLT;
        CadastroExperiencia cadastroExperiencia;
        Empresa empresa = new Empresa(20, "Control");
        LocalDate dateContratacao = LocalDate.of(1990, 6, 14);
        cadastroExperiencia = new CadastroExperiencia(50, 2575d, true, dateContratacao, null, regimeDeContratacao, empresa);
        LocalDate dataNascimento = LocalDate.of(1980, 05, 17);


      //  System.out.println(cadastroExperiencia);
        Profissao profissao = new Profissao(1, "pedreiro", cadastroExperiencia);
       // System.out.println(profissao);
        PretencaoSalarial pretencaoSalarial = new PretencaoSalarial(2600d, 3500d);
        Celular celular = new Celular(8297894564L, true, true, false);
        Celular celular1 = new Celular(875464632l, true, true, true);
        Cidade cidade = new Cidade(1, "Maceio", "Alagoas", "Al");
        Endereco endereco = new Endereco(57800000L, "987A", "Praca", "Centro", cidade);
        Cadastro cadastro = new Cadastro(1, "Anderson", "09339394429", "anderson.dias@gmail.com", dataNascimento, 827646562121L, "enforçado, rápido", sexo, pretencaoSalarial, endereco);
        cadastro.setCelulars(celular1);
        cadastro.setCelulars(celular);
        cadastro.setProfissaoLis(profissao);
        System.out.println(cadastro);


        List<Cadastro> cadastros = new ArrayList<>();
        cadastros.add(cadastro);

        CsvGenerator csvGenerator = new CsvGenerator();
        csvGenerator.escreverLayoutDelimitado(cadastros);


    }


}


