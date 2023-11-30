package aula1;

import java.util.Scanner;

public class Funcionario extends Pessoa {
    private int matricula;

    public Funcionario() {
        super();
        this.matricula = 0;
    }

    public Funcionario(String nome, String cpf, String telefone, int matricula) {
        super(nome, cpf, telefone);
        this.matricula = matricula;
    }

    public int getMatricula() {

        return matricula;
    }
}
