/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabalhoModelDominio;

import trabalhofinal.*;

/**
 *
 * @author vitie
 */
public class Produto {
        private String Nome;
        private int Quantidade;
        private float preco;

    public Produto(String Nome, int Quantidade, float preco) {
        this.Nome = Nome;
        this.Quantidade = Quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


   
        
        public boolean retiradaEstoque( int quantidadeRetirar){
            boolean resultado;
        if (this.Quantidade >= quantidadeRetirar && quantidadeRetirar > 0) {
            this.Quantidade = this.Quantidade - quantidadeRetirar;
            //System.out.println("Saque efetuado com sucesso!");
            resultado = true;
        } else {
            resultado = false;
            //System.out.println("Erro: saldo insuficiente para o saque desejado!");
        }
        return resultado;
           
            
        }
        
        public boolean entradaEstoque( int quantidadeEntrada){
             boolean resultado;
        if (quantidadeEntrada > 0) {
            this.Quantidade = this.Quantidade + quantidadeEntrada;
            //System.out.println("Depósito efetuado com sucesso!");
            resultado = true;
        } else {
            resultado = false;
            //System.out.println("Erro: depósito não realizado!");
        }
        return resultado;
           
        }
}
