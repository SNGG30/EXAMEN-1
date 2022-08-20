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
public class Jugador {
    private String Username;
    private int ID;
    private String Password;
    private Personajes p;

    public Jugador() {
    }

    public Jugador(String Username, int ID, String Password) {
        this.Username = Username;
        this.ID = ID;
        this.Password = Password;
    }

    public Jugador(String Username, int ID, String Password, Personajes p) {
        this.Username = Username;
        this.ID = ID;
        this.Password = Password;
        this.p = p;
    }
    
    

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Personajes getP() {
        return p;
    }

    public void setP(Personajes p) {
        this.p = p;
    }

    
    @Override
    public String toString() {
        return "Jugador{" + "Username=" + Username + ", ID=" + ID + ", Password=" + Password + '}';
    }
    
    
}
