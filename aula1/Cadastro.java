package aula1;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        int tam = 5;
        Funcionario[] funcionarios = new Funcionario[tam];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tam; i++) {
            System.out.println("Digite seu nome " + (i + 1) + ":");
            String nome = scanner.next();
            System.out.println("Digite seu cpf " + (i + 1) + ":");
            String cpf = scanner.next();
            System.out.println("Digite seu número " + (i + 1) + ":");
            String telefone = scanner.next();
            System.out.println("Digite a matrícula do funcionário " + (i + 1) + ":");
            int matricula = scanner.nextInt();

            funcionarios[i] = new Funcionario(nome, cpf, telefone, matricula);
        }

        for (int i = 0; i < tam; i++) {
            System.out.println("Funcionário " + (i + 1) + ":");
            Funcionario funcionario = funcionarios[i];
            System.out.println("Matrícula: " + funcionario.getMatricula());
            funcionario.impressao();
            System.out.println();
        }
    }
}
