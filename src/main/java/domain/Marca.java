/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author asus
 */
public class Marca {
    private String nombre;
    private String pais;

    public Marca(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public Marca() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    
    
    @Override
    public String toString() {
        return "Marca{" + "nombre=" + nombre + ", pais=" + pais + '}';
    }
    
    
}
