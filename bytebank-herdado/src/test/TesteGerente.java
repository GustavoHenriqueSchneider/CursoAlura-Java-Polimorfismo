package test;

import main.classes.Administrador;
import main.classes.Gerente;
import main.tipos.Autenticavel;
import main.tipos.Funcionario;

public class TesteGerente {
    public static void main(String[] args) {
        Autenticavel referencia = new Gerente();
        Funcionario referencia2 = new Gerente();
        Autenticavel referencia3 = new Administrador();

        Gerente gerente = new Gerente();

        gerente.setNome("Gustavo");
        gerente.setCpf("123.123.123-12");
        gerente.setSalario(5000.0);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());

        gerente.setSenha(2222);
        boolean autenticou = gerente.autentica(2222);
        System.out.println(autenticou);

        System.out.println(gerente.getBonificacao());
    }
}
