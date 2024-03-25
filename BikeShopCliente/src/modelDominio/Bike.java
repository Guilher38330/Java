/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Guilherme
 */
public class Bike extends Usuario implements Serializable{
    private static final long serialVersionUID = 123456789L;
    
    private int codBike;
    private String modelo;
    private String marca;
    private float preco;
    private Date dataLancamento;
    private byte[] imagen;

    public Bike(int codBike, String modelo, String marca, float preco, Date dataLancamento, byte[] imagen, int codUsuario, String nomeUsuario, String nome, String senha, String email) {
        super(codUsuario, nomeUsuario, nome, senha, email);
        this.codBike = codBike;
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.dataLancamento = dataLancamento;
        this.imagen = imagen;
    }

    public Bike(int codBike, String modelo, String marca, float preco, Date dataLancamento, byte[] imagen, String nomeUsuario, String nome, String senha, String email) {
        super(nomeUsuario, nome, senha, email);
        this.codBike = codBike;
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.dataLancamento = dataLancamento;
        this.imagen = imagen;
    }

    public Bike(int codBike, String modelo, String marca, float preco, Date dataLancamento, byte[] imagen, int codUsuario) {
        super(codUsuario);
        this.codBike = codBike;
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.dataLancamento = dataLancamento;
        this.imagen = imagen;
    }

    public Bike(int codBike, String modelo, String marca, float preco, Date dataLancamento, byte[] imagen, String nome, String senha) {
        super(nome, senha);
        this.codBike = codBike;
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.dataLancamento = dataLancamento;
        this.imagen = imagen;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public int getCodBike() {
        return codBike;
    }

    public void setCodBike(int codBike) {
        this.codBike = codBike;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    
    
    
}
