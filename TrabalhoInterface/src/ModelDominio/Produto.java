/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ModelDominio;

/**
 *
 * @author Guilherme
 */
public class Produto {

    private String nome;
    private int quantidade;
    private float preco;

    public Produto(String nome, int quantidade, float preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public float 
        getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    public boolean retiradaEstoque( int retirada){
            boolean resultado;
        if (this.quantidade >= retirada && retirada > 0) {
            this.quantidade = this.quantidade - retirada;
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
           
            
        }
        
        public boolean entradaEstoque( int entrada){
             boolean resultado;
        if (entrada > 0) {
            this.quantidade = this.quantidade + entrada;
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
           
        }
}
