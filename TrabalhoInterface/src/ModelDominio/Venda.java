/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelDominio;

/**
 *
 * @author Guilherme
 */
public class Venda {
    
    private String nomeCliente;
    private String dataVenda;
    private int quantidade;
    private Float valorVenda;
    private Produto produto;

    public Venda(String nomeCliente, String dataVenda, int quantidade, Produto produto) {
    this.nomeCliente = nomeCliente;
    this.dataVenda = dataVenda;
    this.quantidade = quantidade;
    this.valorVenda = produto.getPreco() * this.quantidade;
    this.produto = produto;
    this.produto.retiradaEstoque(quantidade);
}


   
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
}
    