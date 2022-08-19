/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_felipegarcia;

/**
 *
 * @author felip
 */
public class Armas {
    
    private String Nombre;
    private int Daño;
    private int Precision;

    public Armas() {
    }

    public Armas(String Nombre, int Daño, int Precision) {
        this.Nombre = Nombre;
        this.Daño = Daño;
        this.Precision = Precision;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDaño() {
        return Daño;
    }

    public void setDaño(int Daño) {
        this.Daño = Daño;
    }

    public int getPrecision() {
        return Precision;
    }

    public void setPrecision(int Precision) {
        this.Precision = Precision;
    }

    @Override
    public String toString() {
        return "Armas{" + "Nombre=" + Nombre + ", Da\u00f1o=" + Daño + ", Precision=" + Precision + '}';
    }
    
    
}
