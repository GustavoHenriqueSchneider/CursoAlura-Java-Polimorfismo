package contas;

import sistemas.Tributavel;
import tipos.Cliente;
import tipos.Conta;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.setSaldo(super.getSaldo()+valor);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }
}
