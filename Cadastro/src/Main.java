import br.com.mjv.cadastro.engine.CsvGenerator;
import br.com.mjv.cadastro.model.*;

import java.io.IOException;
import java.nio.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {




    public static void main(String[] args) {
    Sexo sexo= Sexo.MASCULINO;
    RegimeDeContratacaoENUM regimeDeContratacao = RegimeDeContratacaoENUM.CLT;
    Empresa empresa = new Empresa(20, "Control");
        Date  dateContratacao = new Date(1990, 6, 14);
        Date  dataNascimento = new Date(1990, 6, 14);


        CadastroExperiencia cadastroExperiencia = new CadastroExperiencia(50, 2575d, true,
                dateContratacao, null, regimeDeContratacao, empresa
        );
        System.out.println(cadastroExperiencia);
        Profissao profissao = new Profissao(1, "pedreiro",cadastroExperiencia);
        System.out.println(profissao);
        PretencaoSalarial pretencaoSalarial= new PretencaoSalarial(2600d,3500d);
        Celular celular = new Celular(8297894564L,true, true, false);
        Celular celular1 = new Celular(875464632l, true, true, true);
        Cidade cidade = new Cidade(1, "Maceio", "Alagoas", "Al");
        Endereco endereco = new Endereco(57800000L, "987A", "Praca", "Centro", cidade);
        Cadastro cadastro = new Cadastro(1, "Anderson", "09339394429", "anderson.dias@gmail.com", dataNascimento,827646562121L,"enforçado, rápido",sexo, pretencaoSalarial, endereco);
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


