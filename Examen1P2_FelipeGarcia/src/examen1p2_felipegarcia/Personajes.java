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
public class Personajes {
    
    private String Nombre;
    private int Vida;
    private int Escudo;
    private Armas arm;
    private String tipo;

    public Personajes() {
    }

    public Personajes(String Nombre, int Vida, int Escudo, Armas arm, String tipo) {
        this.Nombre = Nombre;
        this.Vida = Vida;
        this.Escudo = Escudo;
        this.arm = arm;
        this.tipo = tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }

    public int getEscudo() {
        return Escudo;
    }

    public void setEscudo(int Escudo) {
        this.Escudo = Escudo;
    }

    public Armas getArm() {
        return arm;
    }

    public void setArm(Armas arm) {
        this.arm = arm;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

  
    @Override
    public String toString() {
        return "Personajes{" + "Nombre=" + Nombre + ", Vida=" + Vida + ", Escudo=" + Escudo + ", arm=" + arm + ", tipo=" + tipo + '}';
    }

   
}
