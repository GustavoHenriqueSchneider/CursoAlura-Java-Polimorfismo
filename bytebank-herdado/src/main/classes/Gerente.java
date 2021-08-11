package main.classes;

import main.tipos.Autenticavel;
import main.tipos.Funcionario;

// Gerente é/extende/herda um Funcionario e assina o contrato/implementa Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    @Override
    public double getBonificacao() {
        return super.getSalario();
    }
}
