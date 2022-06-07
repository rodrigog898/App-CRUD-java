/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Rodrigo
 */
public class Telefono {
    private String imei;
    private String marca;
    private String modelo;
    private String color;
    private String mpxcamara;
    private String ram;

    public Telefono() {
    }

    public Telefono(String imei, String marca, String modelo, String color, String mpxcamara, String ram) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.mpxcamara = mpxcamara;
        this.ram = ram;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMpxcamara() {
        return mpxcamara;
    }

    public void setMpxcamara(String mpxcamara) {
        this.mpxcamara = mpxcamara;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
    
    
    
}
