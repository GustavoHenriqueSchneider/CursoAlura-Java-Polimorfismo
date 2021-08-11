package contas;

import tipos.Cliente;
import tipos.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero, Cliente titular){
        super(agencia, numero, titular);
    }

    @Override
    public void deposita(double valor){
        super.setSaldo(super.getSaldo()+valor);
    }
}
