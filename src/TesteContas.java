public class TesteContas {
    public static void main(String[] args) {

        int a = 3;
        int b = a / 0;

        ContaCorrente outra = null;

        outra.saca(200);

        ContaCorrente cc = new ContaCorrente(123,123456);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(123,321345);
        cp.deposita(200);

        cc.transfere(10, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());

    }
}
