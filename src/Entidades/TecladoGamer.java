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
public class TecladoGamer {
    private String id;
    private String marca;
    private String modelo;
    private String switchs;
    private String color;
    private String velocidad;
    private String cantidadteclas;

    public TecladoGamer() {
    }

    public TecladoGamer(String id, String marca, String modelo, String switchs, String color, String velocidad, String cantidadteclas) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.switchs = switchs;
        this.color = color;
        this.velocidad = velocidad;
        this.cantidadteclas = cantidadteclas;
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

    public String getSwitchs() {
        return switchs;
    }

    public void setSwitchs(String switchs) {
        this.switchs = switchs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getCantidadteclas() {
        return cantidadteclas;
    }

    public void setCantidadteclas(String cantidadteclas) {
        this.cantidadteclas = cantidadteclas;
    }
    
    
    
}
