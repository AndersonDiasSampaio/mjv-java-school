import java.awt.*;
import java.util.*;
import java.util.List;

public class Conta {

    Double saldoConta;
    Cliente cliente;
    Integer numeroConta;
    boolean contaAtiva;
    List<Transacao> extrato = new ArrayList<>();

    boolean sacar(Double valor) {
        if( saldoConta>valor){
        this.saldoConta -= valor;
        Transacao t = new Transacao();
        t.addtransacao(valor,this.saldoConta, this.numeroConta);
            extrato.add(t);
        return true;}
        else{
            return false;
        }
    }

    boolean tranferir(Double valor, Conta destimp) {
        if( saldoConta>valor){
            this.saldoConta -= valor;
            destimp.setSaldoConta(valor+destimp.getSaldoConta());
            Transacao t = new Transacao();
            t.addtransacao(valor,this.saldoConta, this.numeroConta, destimp.numeroConta);
            extrato.add(t);
            return true;}
        else{
            return false;
        }
    }

    boolean cancelarConta(){
        return this.contaAtiva = false;
    }

    Double consultarSaldo() {
        return saldoConta;
    }



    List<Transacao> consultarExtrato() {
        return extrato;
    }

    public Conta(Double saldoConta, Integer numeroConta, boolean contaAtiva, Cliente cliente) {
        this.saldoConta = saldoConta;
        this.numeroConta = numeroConta;
        this.contaAtiva = contaAtiva;
        this.cliente = cliente;

    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldoConta=" + saldoConta +
                ", cliente=" + cliente +
                ", numeroConta=" + numeroConta +
                ", contaAtiva=" + contaAtiva +
                ", extrato=" + extrato +
                '}';
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public List<Transacao> getExtrato() {
        return extrato;
    }
}