public class TesteReferencias {
    public static void main(String[] args){
        Gerente g = new Gerente();
        //Funcionario g1 = new Gerente();
        g.setNome("Gustavo");
        g.setSalario(5000);

        Funcionario f = new Funcionario();
        f.setNome("Joao");
        f.setSalario(2000);

        EditorVideo ev = new EditorVideo();
        ev.setNome("Pedro");
        ev.setSalario(2500);

        Designer d = new Designer();
        d.setNome("Paulo");
        d.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(g);
        controle.registra(f);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());
    }
}
