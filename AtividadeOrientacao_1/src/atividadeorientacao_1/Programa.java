/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeorientacao_1;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Programa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        LinkedList<Aluno> listaAlunos = new LinkedList<>();
        System.out.println("Deseja:\n"
                + "1 – Cadastrar aluno com dados básicos (matrícula, nome e curso)\n"
                + "2 – Cadastrar aluno com todos os dados (matrícula, nome, curso, notas e frequência)\n"
                + "3 – Informar notas e frequência\n"
                + "4 – Visualizar alunos cadastrados\n"
                + "5 – Visualizar aluno em específico\n"
                + "6 – Remover aluno\n"
                + "7 – Pesquisar aluno por matrícula\n"
                + "8 – Editar dados do aluno\n"
                + "9 – Encerrar o programa");
        int opcao = ler.nextInt();
        while (opcao != 9) {
            if (opcao == 1) {
                System.out.println("Informe a matricula: ");
                String matricula = ler.nextLine();
                matricula = ler.nextLine();
                System.out.println("Informe o nome do aluno: ");
                String nome = ler.nextLine();
                System.out.println("Informe o curso do aluno: ");
                String curso = ler.nextLine();

                Aluno meuAluno = new Aluno(matricula, nome, curso);
                listaAlunos.add(meuAluno);
                System.out.println("Aluno cadrastrado com sucesso!");

            } else if (opcao == 2) {
                System.out.println("Informe a matricula: ");
                String matricula = ler.nextLine();
                matricula = ler.nextLine();
                System.out.println("Informe o nome do aluno: ");
                String nome = ler.nextLine();
                System.out.println("Informe o curso do aluno: ");
                String curso = ler.nextLine();
                System.out.println("Informe a nota 1:");
                float nota1 = ler.nextFloat();
                System.out.println("Informe a nota 2:");
                float nota2 = ler.nextFloat();
                System.out.println("Informe a nota 3:");
                float nota3 = ler.nextFloat();
                System.out.println("Informe a frequencia do aluno: ");
                float frequencia = ler.nextFloat();

                Aluno meuAluno = new Aluno(matricula, nome, curso);
                listaAlunos.add(meuAluno);
                System.out.println("Aluno cadrastrado com sucesso!");
                
            } else if (opcao == 3) {
                System.out.println("Informe a posicao do aluno desejado: ");
                int posicao = ler.nextInt();
                if (posicao >= 0 && posicao < listaAlunos.size()) {
                    Aluno meuAluno = listaAlunos.get(posicao);
                    System.out.println("Informe a nota 1:");
                    float nota1 = ler.nextFloat();
                    System.out.println("Informe a nota 2:");
                    float nota2 = ler.nextFloat();
                    System.out.println("Informe a nota 3:");
                    float nota3 = ler.nextFloat();
                    System.out.println("Informe a frequencia do aluno: ");
                    float frequencia = ler.nextFloat();
                    meuAluno.setNota1(nota1);
                    meuAluno.setNota2(nota2);
                    meuAluno.setNota3(nota3);
                    meuAluno.setFrequencia(frequencia);
                    meuAluno.calculoMedia();
                    meuAluno.verificarSituacao();

                } else {
                    System.out.println("Erro: posicao informada e invalida.");
                }
            } else if (opcao == 4) {
                for (int i = 0; i < listaAlunos.size(); i++) {
                    Aluno meuAluno = listaAlunos.get(i);
                    System.out.println("Matricula: " + meuAluno.getMatricula());
                    System.out.println("Nome: " + meuAluno.getNome());
                    System.out.println("Curso: " + meuAluno.getCurso());
                    System.out.println("Media: " + meuAluno.getMedia());
                    System.out.println("Situacao: " + meuAluno.getSituacaoLiteral());
                }
            } else if (opcao == 5) {
                System.out.println("Informe a posicao do aluno desejado: ");
                int posicao = ler.nextInt();
                if (posicao >= 0 && posicao < listaAlunos.size()) {
                    Aluno meuAluno = listaAlunos.get(posicao);
                } else {
                    System.out.println("Erro: posicao informada e invalida.");
                }
            } else if (opcao == 6) {
                System.out.println("Informe a posicao do aluno desejado: ");
                int posicao = ler.nextInt();
                if (posicao >= 0 && posicao < listaAlunos.size()) {
                    Aluno meuAluno = listaAlunos.get(posicao);
                    listaAlunos.remove(posicao);
                    System.out.println("Aluno removido!");
                } else {
                    System.out.println("Erro: Posicao informada invalida!");
                }
            } else if (opcao == 7) {
                System.out.println("Informe a matricula do aluno: ");
                String matriculaPesquisada = ler.nextLine();
                matriculaPesquisada = ler.nextLine();
                boolean achei = false;
                for (int i = 0; i < listaAlunos.size(); i++) {
                    Aluno meuAluno = listaAlunos.get(i);
                    if (matriculaPesquisada.equals(meuAluno.getMatricula())) {
                        System.out.println("Matricula: " + meuAluno.getMatricula());
                        System.out.println("Nome: " + meuAluno.getNome());
                        System.out.println("Curso: " + meuAluno.getCurso());
                        System.out.println("Media: " + meuAluno.getMedia());
                        System.out.println("Situacao: " + meuAluno.getSituacaoLiteral());
                        achei = true;
                        break;
                    }
                }
                if (achei == false) {
                    System.out.println("Erro: não existe aluno com essa matricula informado ");
                }
            } else if (opcao == 8) {
                System.out.println("Informe a posicao desejada: ");
                int posicao = ler.nextInt();
                if (posicao >= 0 && posicao < listaAlunos.size()) {
                    Aluno meuAluno = listaAlunos.get(posicao);
                    System.out.println("Informe o nome do aluno: ");
                    String nome = ler.nextLine();
                    System.out.println("Informe o curso do aluno: ");
                    String curso = ler.nextLine();
                    meuAluno.setCurso(curso);
                    meuAluno.setNome(nome);
                    System.out.println("Aluno editado");
                } else {
                    System.out.println("Erro: Posicao informada invalida!");
                }
            }
            System.out.println("Deseja:\n"
                    + "1 – Cadastrar aluno com dados básicos (matrícula, nome e curso)\n"
                    + "2 – Cadastrar aluno com todos os dados (matrícula, nome, curso, notas e frequência)\n"
                    + "3 – Informar notas e frequência\n"
                    + "4 – Visualizar alunos cadastrados\n"
                    + "5 – Visualizar aluno em específico\n"
                    + "6 – Remover aluno\n"
                    + "7 – Pesquisar aluno por matrícula\n"
                    + "8 – Editar dados do aluno\n"
                    + "9 – Encerrar o programa");
            opcao = ler.nextInt();
        }
    }
}
