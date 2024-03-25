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
public class Bike implements Serializable{
    private static final long serialVersionUID = 123456789L;
    
    private int codBike;
    private String modelo;
    private Marca marca;
    private float preco;
    private Date dataLancamento;
    private byte[] imagen;

    public Bike(int codBike, String modelo, Marca marca, float preco, Date dataLancamento, byte[] imagen) {
        this.codBike = codBike;
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.dataLancamento = dataLancamento;
        this.imagen = imagen;
    }

    public Bike(String modelo, Marca marca, float preco, Date dataLancamento, byte[] imagen) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.dataLancamento = dataLancamento;
        this.imagen = imagen;
    }

    public Bike(int codBike) {
        this.codBike = codBike;
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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
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

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Bike{" + "codBike=" + codBike + ", modelo=" + modelo + ", marca=" + marca + ", preco=" + preco + ", dataLancamento=" + dataLancamento + ", imagen=" + imagen + '}';
    }

    
    
}
