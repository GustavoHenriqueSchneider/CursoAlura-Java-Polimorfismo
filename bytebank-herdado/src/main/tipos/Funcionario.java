package main.tipos;

// não pode instanciar objetos dessa porque é abstrata/um conceito
public abstract class Funcionario {
    private String nome, cpf;
    private double salario;

    // metodo não possui implementação/corpo *AQUI*, os filhos possuem a implementação
    public abstract double getBonificacao();

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
