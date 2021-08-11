package test;

import main.classes.Cliente;
import main.classes.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente gus = new Gerente();

        gus.setNome("Gustavo");
        gus.setCpf("111.111.111-11");
        gus.setSalario(3000.00);

        Cliente c = new Cliente();
        c.setSenha(2211);
        c.autentica(2211);

        System.out.println(gus.getNome());
        System.out.println(gus.getBonificacao());
    }
}
