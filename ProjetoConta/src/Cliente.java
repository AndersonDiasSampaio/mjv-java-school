public class Cliente {
    String nomeCliente;
    String dataNascimento;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Cliente(String nomeCliente, String dataNascimento) {
        this.nomeCliente = nomeCliente;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
