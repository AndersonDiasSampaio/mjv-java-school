import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Anderson", "25-06-1990");
    Conta a= new Conta(233.5, 25, true, cliente);
        Cliente cliente2 = new Cliente("Karla", "12-08-1970");
        Conta b= new Conta(500.5, 47, true, cliente2);
    System.out.println(a);
    a.sacar(78.5);
        System.out.println(a);
a.sacar(25.5);
        System.out.println(a);
a.tranferir(25.5,b);
        for (Transacao t:a.extrato
             ) {
            System.out.println(t.toString()+"\n");
        }


    }
}