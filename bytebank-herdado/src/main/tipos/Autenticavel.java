package main.tipos;

// contrato Autenticavel, quem assina o contrato precisa implementar os metodos
// interface é uma "classe" com todos metodos abstratos
public interface Autenticavel {

    void setSenha(int senha);

    boolean autentica(int senha);
}
