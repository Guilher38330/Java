/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelDominio;

/**
 *
 * @author Guilherme
 */
public class Produto {
   private String Nome;
        private int quantidade;
        private float preco;

    public Produto(String Nome, int quantidade, float preco) {
        this.Nome = Nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public Produto(Venda nomeCliente){
        this.Nome = Nome;
        this.preco = 0;
    }

    
    public boolean retiradaEstoque(int quantidadeRetirar){
        boolean resultado;
        if(this.quantidade >= quantidadeRetirar){
            this.quantidade = this.quantidade - quantidadeRetirar;
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
    
    
    public boolean entradaEstoque(int quantidadeEntrada){
        boolean resultado;
        if(quantidadeEntrada > 0){
            this.quantidade = this.quantidade + quantidadeEntrada;
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }

    
    
    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
