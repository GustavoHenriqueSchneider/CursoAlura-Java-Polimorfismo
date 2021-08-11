package tests;

import contas.ContaCorrente;
import contas.ContaPoupanca;
import tipos.Cliente;

public class TesteContas {

    public static void main(String[] args){

        Cliente c1 = new Cliente("Gustavo","213124325");

        ContaCorrente cc = new ContaCorrente(111, 111, c1);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(123,123, c1);
        cp.deposita(200);

        cc.transfere(10,cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
    }
}
