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
public class Notebook {
    private String id;
    private String marca;
    private String modelo;
    private String procesador;
    private String ram;
    private String grafica;
    private String almacenamiento;

    public Notebook() {
    }

    public Notebook(String id, String marca, String modelo, String procesador, String ram, String grafica, String almacenamiento) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.ram = ram;
        this.grafica = grafica;
        this.almacenamiento = almacenamiento;
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

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    
    
}
