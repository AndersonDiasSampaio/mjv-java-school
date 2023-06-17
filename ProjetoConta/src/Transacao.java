import java.util.Date;

public class Transacao {

    boolean tipoSaque= false;
    boolean tipoTransferencia= false;
    Double saque;
    Double valorConta;
    Integer contaNumeroEnvia;
    Integer contaNumeroRecebe=null;

    void addtransacao(Double saque, Double valorConta, Integer contaNumeroEnvia){
        this.tipoSaque= true;
        this.saque= saque;
        this.valorConta= valorConta;
        this.contaNumeroEnvia=contaNumeroEnvia;

    }
    void addtransacao(Double saque, Double valorConta, Integer contaNumeroEnvia, Integer contaNumeroRecebe){
        this.tipoTransferencia= true;
        this.saque= saque;
        this.valorConta= valorConta;
        this.contaNumeroEnvia=contaNumeroEnvia;
        this.contaNumeroRecebe=contaNumeroRecebe;

    }

    public Transacao() {
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "tipoSaque=" + tipoSaque +
                ", tipoTransferencia=" + tipoTransferencia +
                ", saque=" + saque +
                ", valorConta=" + valorConta +
                ", contaNumeroEnvia=" + contaNumeroEnvia +
                ", contaNumeroRecebe=" + contaNumeroRecebe +
                '}';
    }
}
