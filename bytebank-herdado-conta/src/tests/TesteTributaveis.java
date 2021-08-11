package tests;

import contas.ContaCorrente;
import sistemas.CalculadorImposto;
import sistemas.SeguroVida;
import tipos.Cliente;

public class TesteTributaveis {

    public static void main(String[] args){
        Cliente c1 = new Cliente("Gustavo", "12321423");
        c1.setSeguroVida(new SeguroVida());

        ContaCorrente cc = new ContaCorrente(3312,1234, c1);
        cc.deposita(100);

        CalculadorImposto calculador = new CalculadorImposto();
        calculador.registra(cc);
        calculador.registra(cc.getTitular().getSeguroVida());

        System.out.println(calculador.getTotalImposto());
    }
}
