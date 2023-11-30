package aula1;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;

    public void impressao() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
    }

    public Pessoa() {
        this.nome = "";
        this.cpf = "";
        this.telefone = "";
    }

    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {

        return nome;
    }

    public String getCpf() {

        return cpf;
    }

    public String getTelefone() {

        return telefone;
    }

}