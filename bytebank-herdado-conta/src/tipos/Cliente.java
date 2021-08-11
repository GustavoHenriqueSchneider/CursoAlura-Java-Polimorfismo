package tipos;

import sistemas.SeguroVida;

public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;
    private SeguroVida seguro;

    public Cliente(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setSeguroVida(SeguroVida seguro) {
        this.seguro = seguro;
    }

    public SeguroVida getSeguroVida() {
        return this.seguro;
    }

}