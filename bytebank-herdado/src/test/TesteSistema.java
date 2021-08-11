package test;

import main.classes.Administrador;
import main.classes.Cliente;
import main.classes.Gerente;
import main.sistemas.SistemaInterno;

public class TesteSistema {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2211);

        Administrador adm = new Administrador();
        adm.setSenha(2211);

        Cliente c = new Cliente();
        c.setSenha(1234);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(c);
    }
}
