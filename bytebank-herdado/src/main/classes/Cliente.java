package main.classes;

import main.tipos.Autenticavel;
import main.util.Autenticacao;

// Cliente assina o contrato/implementa Autenticavel
public class Cliente implements Autenticavel {

    private Autenticacao autenticador = new Autenticacao();

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}
