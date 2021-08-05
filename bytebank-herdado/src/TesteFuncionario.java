public class TesteFuncionario {
    public static void main(String[] args){
        Funcionario gus = new Funcionario();

        gus.setNome("Gustavo");
        gus.setCpf("111.111.111-11");
        gus.setSalario(3000.00);

        System.out.println(gus.getNome());
        System.out.println(gus.getBonificacao());
    }
}
