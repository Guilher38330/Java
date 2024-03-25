/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeorientacao_1;

/**
 *
 * @author Guilherme
 */
public class Aluno {

    private String matricula;
    private String nome;
    private String curso;
    private float nota1;
    private float nota2;
    private float nota3;
    private float frequencia;
    private float media;
    private int situacao; // 1 - aprovado, 2 - reprovado

    public Aluno(String matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public Aluno(String matricula, String nome, float nota1, float nota2, float nota3, float frequencia) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.frequencia = frequencia;
    }

    public void calculoMedia() {
        this.media = (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public void verificarSituacao() {
        if (this.media >= 6 && this.frequencia >= 75) {
            this.situacao = 1;
        } else {
            this.situacao = 2;
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(float frequencia) {
        this.frequencia = frequencia;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public int getSituacao() {
        return situacao;
    }
    
    public String getSituacaoLiteral(){
        String retorno;
        if (this.situacao == 1) {
            retorno = "Aprovado";
        }else{
            retorno = "Reprovado";
        }
    return retorno;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }
}
