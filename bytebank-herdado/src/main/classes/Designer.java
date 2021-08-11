package main.classes;

import main.tipos.Funcionario;

public class Designer extends Funcionario {

    @Override
    public double getBonificacao() {
        return 200;
    }
}
