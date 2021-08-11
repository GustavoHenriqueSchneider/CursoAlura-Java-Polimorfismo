package test;

import main.classes.Designer;
import main.classes.EditorVideo;
import main.classes.Gerente;
import main.sistemas.ControleBonificacao;

public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        //main.tipos.Funcionario g1 = new main.profissoes.Gerente();
        g.setNome("Gustavo");
        g.setSalario(5000);

        EditorVideo ev = new EditorVideo();
        ev.setNome("Pedro");
        ev.setSalario(2500);

        Designer d = new Designer();
        d.setNome("Paulo");
        d.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(g);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());
    }
}
