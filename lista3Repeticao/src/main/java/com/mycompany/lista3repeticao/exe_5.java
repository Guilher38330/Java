package com.mycompany.lista3repeticao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Guilherme
 */
import java.util.*;

public class exe_5 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, nome_maior_nota = null, nome_maior_idade = null;
        float nota, nota_maior_nota = 0, nota_maior_idade = 0;
        int idade, idade_maior_nota = 0, idade_maior_idade = 0;

        //LOGICO
        do {
            System.out.println("Digite o nome do aluno: ");
            nome = ler.next();
            System.out.println("Digite sua idade: ");
            idade = ler.nextInt();
            if (idade > 0) {
                System.out.println("Digite sua nota: ");
                nota = ler.nextFloat();
                System.out.println("");
                if (nota > nota_maior_nota) {
                    idade_maior_nota = idade;
                    nota_maior_nota = nota;
                    nome_maior_nota = nota;
                    if (idade > idade_maior_idade) {
                        nota_maior_idade = nota;
                        idade_maior_idade = idade;
                        nome_maior_idade = nome;
                    }
                }
            }
            while (idade > 0);
            System.out.println("");
            System.out.println("Aluno com maior nota \n Nome: " + nome_maior_nota + "\n Nota: " + nota_maior_nota + "\n Idade: " + idade_maior_nota);
            System.out.println("Aluno com maior idade \n Nome: " + nome_maior_idade + "\n Nota: " + nota_maior_idade + "\n Idade: " + idade_maior_idade);
        }
    }
}
