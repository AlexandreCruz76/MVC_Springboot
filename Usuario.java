package br.fatecrl.mvcdemo.models;

public class Usuario {
    private String cpf;
    private String nome;
    private float mensalidade;
    private float credito;

    public Usuario(String cpf, String nome, float mensalidade, float credito) {
        this.cpf = cpf;
        this.nome = nome;
        this.mensalidade= mensalidade;
        this.credito = credito;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        mensalidade = mensalidade;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
}
