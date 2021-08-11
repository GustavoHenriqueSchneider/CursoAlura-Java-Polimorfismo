package main.classes;

import main.tipos.Autenticavel;
import main.tipos.Funcionario;
import main.util.Autenticacao;

// Administrador é/extende/herda um Funcionario e assina o contrato/implementa Autenticavel
public class Administrador extends Funcionario implements Autenticavel {

    private Autenticacao autenticador = new Autenticacao();

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public double getBonificacao() {
        return 50;
    }
}
