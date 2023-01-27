package br.com.alura.java.io.teste;

import javax.annotation.processing.Generated;
import java.io.Serial;
import java.io.Serializable;

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cpf;
    private String nome;
    private String profissao;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return String.format("%s, CPF: %s, %s", this.nome, this.cpf, this.profissao);
    }

}
