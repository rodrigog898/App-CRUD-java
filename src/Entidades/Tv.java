/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author JOSE
 */
public class Tv {
    private String id;
    private String marca;
    private String modelo;
    private String pulgadas;
    private String cantidadentradas;

    public Tv() {
    }

    public Tv(String id, String marca, String modelo, String pulgadas, String cantidadentradas) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
        this.cantidadentradas = cantidadentradas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(String pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getCantidadentradas() {
        return cantidadentradas;
    }

    public void setCantidadentradas(String cantidadentradas) {
        this.cantidadentradas = cantidadentradas;
    }
    
    
    
}
