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
public class Camara {
    private String id;
    private String marca;
    private String modelo;
    private String memoria;
    private String mpx;
    private String accesorios;

    public Camara() {
    }

    public Camara(String id, String marca, String modelo, String memoria, String mpx, String accesorios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.mpx = mpx;
        this.accesorios = accesorios;
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

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getMpx() {
        return mpx;
    }

    public void setMpx(String mpx) {
        this.mpx = mpx;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }
   
    
    
}
