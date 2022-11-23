package teste;

import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente cc = new ContaCorrente(123,123456);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(123,321345);
        cp.deposita(200);

        cc.transfere(10, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}
